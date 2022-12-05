package org.kkem.script;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.kkem.Viewal;
import org.kkem.loginpage;
import org.kkem.utilties.Excelutility;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tmsmain {
	 WebDriver driver;
	@Test
	 
	 public void f() throws IOException {

				Excelutility oexxcelutility = new Excelutility("G:\\kkemjavaprojects\\trainerms\\src\\main\\resources\\TMS.xlsx", "Sheet1");
				for (int rowN0 = 1; rowN0 <= oexxcelutility.getTotalRows(); rowN0++) {
					driver.navigate().to("https://trainerman\r\n" + "agement.herokua\r\n" + "pp.com/");
					String username = oexxcelutility.getExcelData(rowN0, "username");
					String pwd = oexxcelutility.getExcelData(rowN0, "Password");
					String fname = oexxcelutility.getExcelData(rowN0, "fname");

					loginpage ologin = new loginpage(driver);
					ologin.logindetails2(username, pwd);
					Viewal oview = new Viewal(driver);
					oview.trainerdetails2(fname);
				}
			}
	  
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "F:\\AutomationUtils\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	  

	  @AfterTest
	  public void afterTest() {
		  driver.close();
		}
	  

	}


