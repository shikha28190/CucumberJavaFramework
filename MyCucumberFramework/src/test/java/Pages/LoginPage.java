//package Pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class LoginPage {
//	
//	WebDriver driver;
//	
//	private By username_txtbox = By.xpath("//input[@name='uid']");
//	private By password_txtbox = By.xpath("//input[@name='password']");
//	private By login_btn = By.xpath("//input[@name='btnLogin']");
//	//private By error_msg = By.xpath("//*[@id=\"pageLogin\"]/form/div[2]/div/div[2]");
//	
//	public LoginPage(WebDriver driver){
//		this.driver = driver;
//		if(!driver.getTitle().equals("TestProject Demo")) {
//			throw new IllegalStateException("This is not Login page. User is on page"+driver.getCurrentUrl());
//		}
//	}
//	
//	public void enter_username(String username) {		
//		driver.findElement(username_txtbox).sendKeys(username);		
//	}
//	
//	public void enter_password(String password) {
//		driver.findElement(password_txtbox).sendKeys(password);
//	}
//	
//	public void click_loginbtn() {
//		driver.findElement(login_btn).click();
//	}
//
////	public void get_Error_msg() {
////		WebDriverWait wait = new WebDriverWait(driver, 10);
////		wait.until(ExpectedConditions.visibilityOf(driver.findElement(error_msg)));
////		System.out.println(driver.findElement(error_msg).getText());
////		
////	}
//}
