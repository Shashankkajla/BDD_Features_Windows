package stepDefinations;

//import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {

	public static WebDriver driver;
	
	@Given("^user is already on login Page$")
	public void user_already_on_login_page() // make it more systematic 
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\Driv\\chromedriver.exe");
		driver= new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://classic.freecrm.com/index.html?e=1");				
	
	
	
	}
	
	@When("^user title of login page is Free CRM$")
	public void user_of_title_login_page_Free_Crm()
	{
	    String titleIs = driver.getTitle();	
	    System.out.println("titleIs");
	    Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", titleIs);
	    
	}
	
	/*@Then("^user enters user name and password$")
	public void user_enters_user_name_and_password()
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("shashankk");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test123");
	}
	
	* --> Converting Hardcoded value to Dynamic using DAta Driven Approach
	* 1 --> RegularExpression
	*  //1. \"([^\"]*)\"	
	*   //2. \"(.*)\"
	*
	*/
	
	/*@Then("^user enters \"(.*)\" and \"(.*)\"$") // RegularExpression  data driven approach --> 1
	public void user_enters_user_name_and_password(String un, String pwd)
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	}
	*/
	
	// Using Examples keyword for Data driven when their  are multiple values
	@Then("^user enters \"(.*)\" and \"(.*)\"$") // Examples Keyword  data driven approach --> 2, lwz write Examples Keyword after the all Steps.
	// ComparisionFailure --> Tom username & pwd doesn't exist 
	public void user_enters_user_name_and_password(String un, String pwd)
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	}
	
	
	
	@Then("^user click on login button$")
	public void user_click_on_login_button()
	{
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	// Done Home Page later, coz And Keyword will not work at the end we will need to adjust in somewhere between note it.
	
	@Then("^user is on Home Page$")
	public void user_is_on_Home_Page()
	{
		String title_Home = driver.getTitle();
		System.out.println(title_Home);
		Assert.assertEquals("CRMPRO", title_Home);
		
	}
	
	@Then("^user quit browser$")
	public void user_quit_browser()
	{
		driver.quit();
	}
	
		
}
