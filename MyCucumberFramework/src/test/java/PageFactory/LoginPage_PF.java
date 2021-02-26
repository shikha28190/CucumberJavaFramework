package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage_PF {
	
	WebDriver driver;
		
	@FindBy(id="name")
	WebElement username_txtbox;
	
	@FindBy(id="password")
	WebElement password_txtbox;
	
	@FindBy(id="login")
	WebElement login_btn;
	
	@FindBy(xpath = "//*[@id=\"pageLogin\"]/form/div[2]/div/div[2]")
	WebElement error_msg;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enter_username(String username) {
		username_txtbox.sendKeys(username);
	}
	
	public void enter_password(String password) {
		password_txtbox.sendKeys(password);
	}
	
	public void click_btn() {
		login_btn.click();
	}
	
	public void get_Error_msg() {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOf(error_msg));
	System.out.println(error_msg.getText());
	}
	

}
