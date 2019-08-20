package mystepdefenitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mercuryapp {
	WebDriver driver;
	@Given("User has launced the app")
	public void user_has_launced_the_app() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
	}

	@Then("User enters the valid credentials")
	public void user_enters_the_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("demo");
		  driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")).sendKeys("demo");
		  
	}

	@Then("User clicks on submit button")
	public void user_clicks_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By .name("login")).click();
	}

	@Then("User verfies the login status")
	public void user_verfies_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		String a=driver.findElement(By .linkText("SIGN-OFF")).getText();
		  System.out.println(a);
		  String b="SIGN-OFF";
		  Assert.assertEquals(a,b);
		  driver.close();
	}

	@Given("User launched th app of mercury tours")
	public void user_launched_th_app_of_mercury_tours() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		
	}

	@Then("User clicks on SignUp link")
	public void user_clicks_on_SignUp_link() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	
		driver.findElement(By .linkText("REGISTER")).click();
	}

	@When("User enters the valid data in the form")
	public void user_enters_the_valid_data_in_the_form() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By .name("firstName")).sendKeys("bayek");
		  driver.findElement(By .name("lastName")).sendKeys("ven");
		  driver.findElement(By .name("phone")).sendKeys("879654123");
		  driver.findElement(By .name("userName")).sendKeys("bayek@gmail.com");
		  driver.findElement(By .name("address1")).sendKeys("himakafjfjsjidjkasdjadj");
		  driver.findElement(By .name("address2")).sendKeys("ijklsjadskasjijawdjia");
	
		  driver.findElement(By .name("city")).sendKeys("ballari");
		  driver.findElement(By .name("state")).sendKeys("karnatka");
		  driver.findElement(By .name("postalCode")).sendKeys("583103");
		  Select con= new Select(driver.findElement(By .name("country")));
		  con.selectByVisibleText("INDIA");
		  driver.findElement(By .name("email")).sendKeys("bayek@gmail.com");
		  driver.findElement(By .name("password")).sendKeys("123456789");
		  driver.findElement(By .name("confirmPassword")).sendKeys("123456789");
	}

	@When("User clicks on submit button available")
	public void user_clicks_on_submit_button_available() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By .name("register")).click();
		
	}

	@Then("User Verifies the registration status")
	public void user_Verifies_the_registration_status() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		String a=driver.findElement(By .linkText("sign-in")).getText();
		  System.out.println(a);
		  String b="sign-in";
		  Assert.assertEquals(a,b);
	}

}
