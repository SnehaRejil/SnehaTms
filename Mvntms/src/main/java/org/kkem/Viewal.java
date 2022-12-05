package org.kkem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Viewal {
	

		WebDriverWait wait;
		@FindBy(css ="input[type='text']") WebElement search;
		@FindBy(id="ViewAllocation") WebElement button;

		
		public Viewal(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
			//this.wait=new WebDriverWait(driver, 30);
			this.wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		}
		public  void trainerdetails2(String searchname)
		{try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("ViewAllocation"))).click();

			wait.until(ExpectedConditions.visibilityOf(search)).sendKeys("fname");
			search.clear();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		}
	}


