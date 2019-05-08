package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberLogin {
static WebDriver driver;
	@Given("I need to open the AddTariff Page")
	public void i_need_to_open_the_AddTariff_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jack\\Desktop\\mani\\Samples programs\\Lib\\chromedriver.exe" );
	driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/telecom/addtariffplans.php");	
	
		}
	

	@When("i need to pass the arguments values")
	public void i_need_to_pass_the_arguments_values() {
		driver.findElement(By.xpath("//input[@id='rental1']")).sendKeys("130");
		driver.findElement(By.id("local_minutes")).sendKeys("125");
		driver.findElement(By.xpath("//input[@id='inter_minutes']")).sendKeys("135");
		driver.findElement(By.xpath("//input[@id='sms_pack']")).sendKeys("560");
		driver.findElement(By.xpath("//input[@id='minutes_charges']")).sendKeys("570");
		driver.findElement(By.id("inter_charges")).sendKeys("570");
		driver.findElement(By.id("sms_charges")).sendKeys("570");
		
		
	}

	@Then("i should click the submit login")
	public void i_should_click_the_submit_login() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
	}


	
	
	
}
