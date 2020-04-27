package Cucumber.StepDefinitions;

import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStepDef {
	
	WebDriver driver;
	
	@Given("Open the Chrome and launch the application")
	public void open_the_Chrome_and_launch_the_application() {	  
		System.out.println("This Step open the Firefox and launch the application.");
		System.setProperty("webdriver.chrome.driver",
				"E:\\Kunal WorkSpace\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();			
	     driver.get("http://demo.guru99.com/v4");	
	}

	@When("Enter the Username {string} and Password {string}")
	public void enter_the_Username_and_Password(String username, String password) {
		System.out.println("This Step open the Firefox and launch the application.");
		System.setProperty("webdriver.chrome.driver",
				"E:\\Kunal WorkSpace\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();			
	     driver.get("http://demo.guru99.com/v4");	System.out.println("This step enter the Username and Password on the login page.");
		driver.findElement(By.name("uid")).sendKeys(username);							
	    driver.findElement(By.name("password")).sendKeys(password);
   
	}

	@Then("Reset the credential")
	public void reset_the_credential() {
		// Write code here that turns the phrase above into concrete actions
				 System.out.println("This step click on the Reset button.");
				 driver.findElement(By.name("btnReset")).click();
	}
}
