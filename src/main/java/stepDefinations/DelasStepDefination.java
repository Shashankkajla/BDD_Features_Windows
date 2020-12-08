/*package stepDefinations;

import java.util.List;

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

public class DelasStepDefination {
	WebDriver driver;

	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\Driv\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html?e=1");
	}

	@When("^title of page is Free CRM$")
	public void title_of_page_is_Free_CRM(){
	String titleIs = driver.getTitle();	
	System.out.println("titleIs");
	Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", titleIs);
	}

	@Then("^user enters user name and password$")
	public void user_enters_user_name_and_password(DataTable credentials) {
	  List<List<String>> data = credentials.raw();	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get(0).get(0)); // rows -> 0, obj-> 0
	driver.findElement(By.xpath("//body/div[2]/div[1]/div[3]/form[1]/div[1]/input[2]")).sendKeys(data.get(0).get(1)); // rows -> 0, obj -> 1
	
	}
	@Then("^user select on to login button$")
	public void user_select_on_to__login_button()
	{
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@Then("^user lands on to Home Page$")
	public void user_lands_on_to_Home_Page()
	{
	// Steps matched in feature file DuplicateStepsDefinationExceptions 
		String title_Home = driver.getTitle();
		System.out.println(title_Home);
		Assert.assertEquals("CRMPRO", title_Home);
		
	}
	@Then("^user mouse over to new Deals Link$")
	public void user_mouse_over_to_new_Deals_Link() throws InterruptedException
	{
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000);
		WebElement contactsLink = driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
	}
	
	@Then("^user need to click on new Deals link$")
	public void user_need_to_click_on_new_Deals_link()
	{
		WebElement newContactLink = driver.findElement(By.xpath("//a[contains(text(),'New Deal')]"));
	     newContactLink.click();
	}
	@Then("^user enters deals details$")
	public void user_enters_deals_details(DataTable dealsData)
	{
		List<List<String>> vlaue_store = dealsData.raw();
		
	  driver.findElement(By.xpath("//input[@id='title']")).sendKeys(vlaue_store.get(0).get(0));
	  driver.findElement(By.xpath("//input[@id='amount']")).sendKeys(vlaue_store.get(0).get(1));
	  driver.findElement(By.xpath("//input[@id='probability']")).sendKeys(vlaue_store.get(0).get(2));
	  driver.findElement(By.xpath("//input[@id='commission']")).sendKeys(vlaue_store.get(0).get(3));
	}	  
	@Then("^close the browser$")
	public void close_the_browser()
	{
		driver.quit();
	}
	

}

*/