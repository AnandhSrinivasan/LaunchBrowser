package com.Wrappers.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static WebDriver driver = null;
	public static void main(String[] args) throws IOException {
		
			driver= new ChromeDriver();
			driver.get("https://www.samsung.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//File dest = new File("./screenshots/sample.png");
			File dest = new File(System.getProperty("user.dir") + "/screenshots/sssample.png");
			FileUtils.copyFile(src, dest);
	}
}
