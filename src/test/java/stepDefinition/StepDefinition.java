package stepDefinition;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


import FullAutomation.FirstPage;
import FullAutomation.LoginPage;
import FullAutomation.base;

@RunWith(Cucumber.class)
public class StepDefinition extends base {

    @Given("^driver and browser detals and \"([^\"]*)\"$")
    public void driver_and_browser_detals_and_something(String strArg1) throws Throwable {
    	driver = driverinfo();
    	driver.get(strArg1);
    	FirstPage fp = new FirstPage(driver);
		fp.loginbutton().click();
    }

    @When("^entering (.+) and (.+)$")
    public void entering_something_and_something(String strArg1, String strArg2) throws Throwable {
    	LoginPage lp = new LoginPage(driver);
		lp.emailspace().sendKeys(strArg1);
		lp.passwordspace().sendKeys(strArg2);
		lp.submitbutton().click();
    }

    @Then("^Validate the login$")
    public void validate_the_login() throws Throwable {
        System.out.println("success");
    }

    @And("^Navigating back and closing the browser$")
    public void navigating_back_and_closing_the_browser() throws Throwable {
        driver.close();
    }

}