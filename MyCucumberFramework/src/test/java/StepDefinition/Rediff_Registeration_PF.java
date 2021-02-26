package StepDefinition;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;


import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.Rediff_Registeration_Page_PF;
import io.cucumber.java.en.*;

public class Rediff_Registeration_PF {
	
	WebDriver driver;
	Rediff_Registeration_Page_PF rediff;
	
	@Given("user is on User Registeration Page")
	public void user_is_on_User_Registeration_Page(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
		
	@When("^user enter the details (.*) , (.*) , (.*) , (.*) , (.*) , (.*) , (.*) , (.*) , (.*) and (.*)$")
	public void user_enter_the_details(String Full_Name, String Rediffmail_ID, String Password, String Alt_email_id, String mobile_num, String  Date, String Month, String Year, String country, String city) {
		rediff = new Rediff_Registeration_Page_PF(driver);
		rediff.enter_username(Full_Name);
		rediff.enter_email_id(Rediffmail_ID);
		rediff.enter_password(Password);
		rediff.alt_email_id(Alt_email_id);
		rediff.enter_mob_num(mobile_num);
		rediff.enter_dob(Date, Month, Year);
		rediff.enter_country_city(country, city);
	}
	
	
	
	@And("user clicks on Create Account button")
	public void user_clicks_on_Create_Account_button() throws IOException{
		rediff = new Rediff_Registeration_Page_PF(driver);
		rediff.click_register_btn();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();	
		
		File screenshot_file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot_file, new File(System.getProperty("user.dir")+"\\Screenshots\\AlertScreenshot2.png"));		
		
		
	}
	@Then("User should get registered")
	public void user_should_get_registered() {
		
//		TakesScreenshot screenshot = (TakesScreenshot)driver;
//		File screenshot_file = screenshot.getScreenshotAs(OutputType.FILE);
		
		
		
		
		System.out.println("User registered");
		
		
//		driver.close();
//		driver.quit();
	}

}
