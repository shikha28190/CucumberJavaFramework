//package StepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import javax.print.attribute.standard.PagesPerMinute;
//
//import org.junit.Assert;
//import org.junit.rules.ExpectedException;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Timeouts;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import Pages.LoginPage;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
////import org.junit.Assert;
//
//
//public class Login1step_POM {
//
//	WebDriver driver;
//	LoginPage login_page;
//
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
//		driver= new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("http://demo.guru99.com/v4/");
//		System.out.println("inside 1st step");
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) {
//		
//		login_page = new LoginPage(driver);
//		
//		login_page.enter_username(username);
//		login_page.enter_password(password);
//		
////		driver.findElement(By.id("name")).sendKeys("shikhaupadhyay28@gmail.com");
////		driver.findElement(By.id("password")).sendKeys("Welcome@1234");
//	}
//
//	@And("user clicks on login button")
//	public void user_clicks_on_login_button() {
//
//		LoginPage loginpage = new LoginPage(driver);
//		loginpage.click_loginbtn();
//		
//		//driver.findElement(By.id("login")).click();;
//	}
//
//	@Then("user should be navigated to home page")
//	public void user_should_be_navigated_to_home_page() throws Exception {
//		System.out.println("User navigated to home page");
//		String actual_page_title = driver.getTitle();
//		System.out.println(driver.getCurrentUrl());
////		System.out.println(actual_page_title);
////		String expected_page_title="this is a page title";
////		Assert.assertEquals("Titles Matched", expected_page_title, actual_page_title);
//		
//		if(!actual_page_title.equals("Login Page")) {
//		
//		login_page = new LoginPage(driver);
//		//login_page.get_Error_msg();
//		}
//		
//	}
//
//
//
//}
