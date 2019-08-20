package mystepdefenitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestMeapplogin {
	WebDriver driver;
	@Given("Launch Application TestMeapp")
	public void launch_Application_TestMeapp() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
		  driver=new ChromeDriver();
	}

	@Given("Test me is launched in browser")
	public void test_me_is_launched_in_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("User click on signin")
	public void user_click_on_signin() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	
		driver.findElement(By .xpath("	//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}
	@Then("Enters valid username <{string}>")
	public void enters_valid_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	    driver.findElement(By .name("userName")).sendKeys(string);
	}

	@Then("Enters vaild password <{string}>")
	public void enters_vaild_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("password")).sendKeys(string);
	}


	@Then("click on subit")
	public void click_on_subit() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new cucumber.api.PendingException();
		driver.findElement(By .name("Login")).click();
		driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).click();
	}

	@Then("verify the login status")
	public void verify_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		String a=driver.findElement(By .xpath("//*[@id=\\\"header\\\"]/div[1]/div/div/div[2]/div/ul/a")).getText();
		  System.out.println(a);
		  String b="SignOut";
		  Assert.assertEquals(a,b);
	}

}
