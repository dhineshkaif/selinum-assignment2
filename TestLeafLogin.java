package com.leafff;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/login");
		driver.findElement(By.xpath("//div[@class='form-group control-group']//input[@id='email']"))
				.sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//div[@class='control-group form-group']//input[@id='password']"))
				.sendKeys("leaf@12");
         driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
         driver.get("https://acme-test.uipath.com/home");
         String tittle = driver.findElement(By.tagName("h1")).getText();
         driver.findElement(By.tagName("li")).click();
         System.out.println(tittle);
//         driver.findElement(Byx);
         driver.close();
        
	}

}
