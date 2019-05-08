package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class AddTariff {
static WebDriver driver;


	@Given("I neeed to open the Add Tariff Page")
	public void i_neeed_to_open_the_Add_Tariff_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jack\\Desktop\\mani\\Samples programs\\Lib\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
driver.get("http://demo.guru99.com/telecom/addtariffplans.php");	
driver.manage().window().maximize();
	}

	@When("i need to pass the arguments")
	public void i_need_to_pass_the_arguments() {
		
		driver.findElement(By.xpath("//input[@id='rental1']")).sendKeys("130");
		driver.findElement(By.id("local_minutes")).sendKeys("125"); 
		driver.findElement(By.id("inter_minutes")).sendKeys("135");  
		
		
		driver.findElement(By.id("sms_pack")).sendKeys("569"); 
		
		
		driver.findElement(By.id("minutes_charges")).sendKeys("570"); 
		
		
		driver.findElement(By.id("inter_charges")).sendKeys("154"); 
		
		
		driver.findElement(By.id("sms_charges")).sendKeys("762"); 
		
	
			}
	
	@Then("i should click the submit form")
	public void i_should_click_the_submit_form() {
		WebElement submit =driver.findElement(By.name("submit"));
		submit.click();
	}}



 

