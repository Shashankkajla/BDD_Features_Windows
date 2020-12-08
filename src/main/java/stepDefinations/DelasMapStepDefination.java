package stepDefinations;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DelasMapStepDefination {

	WebDriver driver;

	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\Driv\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html?e=1");
	}

	@When("^page title is Free CRM$")
	public void page_title_is_Free_CRM(){
	String titleIs = driver.getTitle();	
	System.out.println("titleIs");
	Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", titleIs);
	}

	@Then("^user enter the credentials$")
	public void user_enter_the_credentials(DataTable credentials) {
		for(Map<String, String> login_data : credentials.asMaps(String.class, String.class)){// Alwz do for parameterization d/f set of data
			                                                    //Key type obj. val,   // Holding val.  data
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(login_data.get("Username")); 
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[3]/form[1]/div[1]/input[2]")).sendKeys(login_data.get("Password"));
		}
	}
	
	@Then("^user check on to login button$")
	public void user_check_on_to_login_button()
	{
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@Then("^user navigates to Home Page$")
	public void user_navigates_to_Home_Page()
	{
	// Steps matched in feature file DuplicateStepsDefinationExceptions 
		String title_Home = driver.getTitle();
		System.out.println(title_Home);
		Assert.assertEquals("CRMPRO", title_Home);
		
	}
	@Then("^user put on cursor to new Deals Link$")
	public void user_put_on_cursor_to_new_Deals_Link() throws InterruptedException
	{
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000);
		WebElement contactsLink = driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
	}
	
	@Then("^user select new Deals Link$")
	public void user_select_new_Deals_Link()
	{
		WebElement newContactLink = driver.findElement(By.xpath("//a[contains(text(),'New Deal')]"));
	     newContactLink.click();
	}
	@Then("^user enters deals details$")
	public void user_enters_deals_details(DataTable dealsData)
	{  // Using for each loop
	 for(Map<String, String> value : dealsData.asMaps(String.class, String.class)){
		
		  driver.findElement(By.xpath("//input[@id='title']")).sendKeys(value.get("Title"));
		  driver.findElement(By.xpath("//input[@id='amount']")).sendKeys(value.get("Amount"));
		  driver.findElement(By.xpath("//input[@id='probability']")).sendKeys(value.get("Probability"));
		  driver.findElement(By.xpath("//input[@id='commission']")).sendKeys(value.get("Commission"));
		  // If not save it will execute and type entire data in 1 step
		  
          driver.findElement(By.xpath("//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/"
		+ "td[1]/fieldset[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")).
		  click();
          
  		  WebElement contactsLink = driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
          Actions action = new Actions(driver);
  		  action.moveToElement(contactsLink).build().perform();
  		  WebElement newContactLink = driver.findElement(By.xpath("//a[contains(text(),'New Deal')]"));
	      newContactLink.click();
	 
	 }
	  
	}	  
	@Then("^user needs to quit from the browser$")
	public void user_needs_to_quit_from_the_browser()
	{
		driver.quit();
	}
			
 }
