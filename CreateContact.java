package com.leafff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Madra");
		driver.findElement(By.id("lastNameField")).sendKeys("uchiga");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("ghost");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("of uchiga");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("martial arts");

		driver.findElement(By.name("description")).sendKeys("he use to fight with other clan");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("dhineshkaif@gmail.com");
		driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")).sendKeys("California");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
		
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("he use to fight with other clan");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		driver.findElement(By.id("sectionHeaderTitle_contacts")).getText();
		String tittle =driver.findElement(By.id("sectionHeaderTitle_contacts")).getText();
		
		System.out.println(tittle);
		

		Thread.sleep(5000);

		driver.close();

	}

}
