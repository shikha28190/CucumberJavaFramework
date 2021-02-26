
package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import StepDefinition.Rediff_Registeration_PF;

public class Rediff_Registeration_Page_PF {
	
	WebDriver driver;
	
	
	@FindBy(xpath="//input[contains(@name,'name')]")
	WebElement username_txtbox;
	
	@FindBy(xpath = "//input[contains(@name,'login')]")
	WebElement rediff_mail_id_txtbox;
	
	@FindBy(xpath="//input[contains(@name,'passwd')]")
	WebElement password_txtbox;
	
	@FindBy(xpath="//input[contains(@name,'confirm_passwd')]")
	WebElement confirm_pswd;
	
	@FindBy(xpath="//input[contains(@name,'altemail')]")
	WebElement alt_email_id_txtbox;
	
	@FindBy(xpath="//input[contains(@name,'mobno')]")
	WebElement mobile_num_number;
	
	@FindBy(xpath="//select[contains(@name,'DOB_Day')]")
	WebElement dob_date_drpdwn;
	
	@FindBy(xpath="//select[contains(@name,'DOB_Month')]")
	WebElement dob_month;
	
	@FindBy(xpath="//select[contains(@name,'DOB_Year')]")
	WebElement dob_year;
	
	@FindBy(xpath="//select[@id='country']")
	WebElement country_drpdwn;
	
	@FindBy(xpath="//select[contains(@name,'city')]")
	WebElement city_drpdwn;
	
	@FindBy(xpath="//input[@id='Register']")
	WebElement register_btn;
	
	
	public Rediff_Registeration_Page_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enter_username(String fullname) {
		username_txtbox.sendKeys(fullname);
	}
	
	public void enter_email_id(String rediff_mail_id) {
		rediff_mail_id_txtbox.sendKeys(rediff_mail_id);
	}
	
	public void enter_password(String password) {
		password_txtbox.sendKeys(password);
		confirm_pswd.sendKeys(password);
	}
	
	public void alt_email_id(String alternate_mail) {
		alt_email_id_txtbox.sendKeys(alternate_mail);
	}
	
	public void enter_mob_num(String m_number) {
		mobile_num_number.sendKeys(m_number);
	}
	
	public void enter_dob(String date, String month, String year) {
		Select select_date=new Select(dob_date_drpdwn);
		select_date.selectByValue(date);
		
		Select select_month = new Select(dob_month);
		select_month.selectByValue(month);
		
		Select select_year = new Select(dob_year);
		select_year.selectByValue(year);
	}
		
	public void enter_country_city(String country_nm, String city_nm) {
		Select select_country = new Select(country_drpdwn);
		select_country.selectByVisibleText(country_nm);
		Select select_city = new Select(city_drpdwn);
		select_city.selectByVisibleText(city_nm);
	}
	
	public void click_register_btn() {
		register_btn.click();
	}
}
