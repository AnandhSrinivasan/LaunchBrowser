package Selenium_Packages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\Chromedriver116\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?gs_ssp=eJzj4tVP1zc0TKnMTbEsK8hRYDRgdGDwYkkvLcsEAF3xBxM&q=guvi&oq=guv&aqs=chrome.1.69i60j46i199i433i465i512j0i131i433i512j69i57j0i131i433i512j69i60l3.2206j0j7&sourceid=chrome&ie=UTF-8"
				+ "");
	}

}
