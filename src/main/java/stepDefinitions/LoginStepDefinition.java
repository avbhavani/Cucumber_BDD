package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefinition {
	WebDriver driver;
	
	@Given("^user is already on login page$")
	public void user_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\avsub\\Downloads\\chromedriver_win32.\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://classic.crmpro.com/");
		  driver.manage().window().maximize();	
	}
	@When("^when title of login page is Free CRM$")
	public void when_title_of_login_page_is_Free_CRM()  {
	    // Write code here that turns the phrase above into concrete actions
	   String title = driver.getTitle();
	   System.out.println(title);

Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("Batchautomation");
        driver.findElement(By.name("password")).sendKeys("Test@12345");
	    
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		WebElement loginBtn =
			 driver.findElement(By.xpath("//input[@type='submit']"));
				 JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", loginBtn);
	} 
	

	@Then("^user is on homepage$")
	public void user_is_on_homepage()  {
		String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
	 Assert.assertEquals("CRMPRO", title);
	   
	}
}

