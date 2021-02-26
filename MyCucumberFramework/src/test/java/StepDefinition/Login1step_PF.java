package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.LoginPage_PF;
import io.cucumber.java.en.*;

public class Login1step_PF {
	
	WebDriver driver;
	LoginPage_PF loginpage_pf;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://example.testproject.io/web/");	    
		System.out.println("Inside 1st step");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_user1_and_pass1(String username, String password) {
		loginpage_pf = new LoginPage_PF(driver);
		loginpage_pf.enter_username(username);
		loginpage_pf.enter_password(password);	
		System.out.println("username and password entered");
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		loginpage_pf = new LoginPage_PF(driver);
		loginpage_pf.click_btn();
		System.out.println("clicked on login button");
	}

	@Then("user should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
		String actual_title = driver.getTitle();
		String expected_title = "Test Project Demo";
		System.out.println(actual_title);
		
		loginpage_pf.get_Error_msg();
		if(!actual_title.equals(expected_title)) {
			throw new IllegalStateException("This is not a homepage. This page is: "+driver.getCurrentUrl());
		}
	}

}
