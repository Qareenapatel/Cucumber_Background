package stepDefinitions_background;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Steps_Background {

	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/patel/Webdriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("user enters usename and password on login page")
	public void user_enters_usename_and_password_on_login_page() {
	    driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
	}

	@When("clicks on login button on page")
	public void clicks_on_login_button_on_page() {
		 driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
	    System.out.println("After login homepage will display");
	}

	@When("user clicks on welcome link")
	public void user_clicks_on_welcome_link() {
		driver.findElement(By.xpath("//a[@id='welcome']")).click(); 
	}

	@When("logout link displayed")
	public void logout_link_displayed() {
		driver.findElement(By.xpath("//a[text()='Logout']")).isDisplayed(); 
	
	}

	@When("user clicks on dashboard link")
	public void user_xlicks_on_dashboard_link() {
	    driver.findElement(By.xpath("//b[text()='Dashboard']")).click();
	}

	@Then("quick launch toolbar is displayed")
	public void quick_launch_toolbar_is_displayed() {
	    driver.findElement(By.xpath("//fieldset[@id='panel_resizable_0_0']")).isDisplayed();
	    
	}
	
	@Then("close the browser")
	public void close_the_browser() {
		driver.quit(); 
	}


}
