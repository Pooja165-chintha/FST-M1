package automationframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new FirefoxDriver();	
		driver.get("https://training-support.net/selenium/simple-form");
		String pageTitle =driver.getTitle();
		System.out.println(pageTitle);
		WebElement firstName =driver.findElement(By.id("firstName"));
		WebElement lastName = driver.findElement(By.id("lastName"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement contact = driver.findElement(By.id("number"));
		WebElement formSubmit = driver.findElement(By.xpath("//input[@value='submit']"));
		
		//Sending values to webElement
		firstName.sendKeys("Pooja");
		Thread.sleep(1000);
		lastName.sendKeys("Chintha");
		email.sendKeys("wj@test.com");
		Thread.sleep(1000);
		contact.sendKeys("9843267890");
		Thread.sleep(1000);
		formSubmit.submit();
		driver.close();
		


	}

}