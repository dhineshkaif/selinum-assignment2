package com.leafff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("dhinesh");
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[9]")).click();
		String tittle1=driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(tittle1);
		String tittle2 ="View Lead";
		if(tittle2==tittle1){
			System.out.println("verified");
		}else {
			System.out.println("not same");
		}
		driver.findElement(By.xpath("//a[@class='subMenuButton'][3]")).click();
		WebElement companyName = driver.findElement(By.xpath("//input[@class='inputBox']"));
		companyName.clear();
		companyName.sendKeys("Honda");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String recompanyname =driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(recompanyname);
		
		Thread.sleep(5000);
		driver.close();
		

	}
	
}
