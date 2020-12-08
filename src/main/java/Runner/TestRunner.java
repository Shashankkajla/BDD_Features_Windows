package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; // Add it manually 

/*@RunWith(Cucumber.class)
@CucumberOptions(  
		features = "Feature" , // The path of the feature file, Initilizations error the feature is not the path
		glue = {"stepDefinations"}, // The path of the stepDefinations file
		format = {"pretty","html:test-outout"}
	
		
		// IllegalArgumentException : Not a file or Directory.
		 * 
		
		)*/

/*@RunWith(Cucumber.class)
@CucumberOptions(  
		features = "D:\\FrameWorks\\CRMBDDTEST\\src\\main\\java\\Features" , Also give the position where file 
		located or directly package name where file associated
		glue = {"stepDefinations"} // The path of the stepDefinations file
		format = {"pretty","html:test-outout"}
		
		)*/

/*You can implement missing steps with the snippets below:

@Given("^user is already on login Page$")
public void user_is_already_on_login_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^user enters user name and password$")
public void user_enters_user_name_and_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^user click on login button$")
public void user_click_on_login_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^user is on Home Page$")
public void user_is_on_Home_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}*/


@RunWith(Cucumber.class)
@CucumberOptions(  
		features = "D:\\FrameWorks\\CRMBDDTEST\\src\\main\\java\\Features\\taggedhooks.feature", 
		          // The path of the feature file, 
		glue = {"stepDefinations"},  // The path of the stepDefinations file, or where excatly 
		// your step definition file.
		format = {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, // json_output is a directory create by json
		// Scenarios file is missing means its skipped, coz. you didn't right anything in step definitions file.
		dryRun = false, // Once dry run becomes true than make it false than it will execute all tc's  // dryRun = true, false
		//The dryRun will not executes the test cases on running it immediately it will check 1:1 mapping b/w feature file & step deviation class.
		// it will test the mapping is correct or not 
		// Run it and see all the mapping is doen it will show green.
		// error give if mapping remain, it will show in console not in jUnit report error "MISSING STEP"
		//: --> You can implement missing steps with the snippets below:
        monochrome = true, // Display the console output in proper readable format, now 35@m, 90m is not coming on console
        strict = true // it will fail the execution if there are any pending & undefine steps are their. 
        // PendingException generates
        // strict = true , it will check if any steps is missing in step definition file
        //tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}
		// tags = {"@SmokeTest , @RegressionTest"}   // OR Tag , : Executes all scenarios which having tags smoke or Regression.
		// tags = {"@SmokeTest" , "@RegressionTest"} // And tag :Executes scenarios which having both Smoke & Regression only.
		// tags = {"~@SmokeTest" , @RegressionTest, @End2End"} // using ~ to ignore which contains smoke only scenarios.
		
		)


public class TestRunner {

}
