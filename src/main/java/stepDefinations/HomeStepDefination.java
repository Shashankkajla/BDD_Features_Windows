package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomeStepDefination {  // extends class are not allowed, initilization error throws
	WebDriver driver;

	LoginStepDefination loginStepDefination;
	
	@Given("^user is able to create a new contact$")
	public void user_is_able_to_create_a_new_contact() throws InterruptedException {
		Thread.sleep(3000);
		System.setProperty("webdriver.chrome.driver", "D:\\Driv\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html?e=1");	
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("shashankk");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().frame("mainpanel");	
	
	
	
	}

	@Then("^user mouse over on contact link$")
	public void user_mouse_over_on_contact_link() throws InterruptedException {
		Thread.sleep(3000);
	WebElement contactsLink = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
	Actions action = new Actions(driver);
	action.moveToElement(contactsLink).build().perform();
	
	}

	@Then("^user click on new contact$")
	public void user_click_on_new_contact()  {
     WebElement newContactLink = driver.findElement(By.xpath("//a[contains(text(),'New Contact')]"));
     newContactLink.click();
		
	}

	@Then("^user add contact details$")
	public void user_add_contact_details() {
	WebElement title = driver.findElement(By.xpath("//select[@name='title']")); 
	Select select = new Select(title);
	select.selectByVisibleText("Mr.");
	driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Tuktuk");
	driver.findElement(By.xpath("//input[@id='surname']")).sendKeys("Sexa");
	 
	// Use assertion to verify on the page that this is added or not alwz while entering the data.
	}

	@Then("^user click on save button$")
	public void user_click_on_save_button()  {

	driver.findElement(By.xpath("//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/fieldset[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/input[2]")).click();	
		
	}

	@Then("^user close the browser$")
	public void user_close_the_browser()
	{
		driver.quit();
	}
	
	
}
