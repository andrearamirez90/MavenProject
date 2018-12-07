package com.maven;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class BaseClass {
	
	@Test
	public void setup() {
		//System.setProperty("webdriver.chrome.driver", "/Users/AndreaRamirez/eclipse-workspace/com.maven/Drivers/chromedriver");
        WebDriver driver = new HtmlUnitDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://Opensource-Demo.Orangehrmlive.Com/");
	}

}






