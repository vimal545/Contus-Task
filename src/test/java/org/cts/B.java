package org.cts;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B {

	public static WebDriver driver;
	public static final String USERNAME = "vimalraj12";
	public static final String AUTOMATE_KEY = "TzicSXx6PMLDHtpY3kgp";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public static void getBrowser(String Platform, String Browser) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();

		switch (Platform) {
		case "desktop":
			switch (Browser) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			default:
				System.out.println("invalid browser");
				break;
			}
			break;
		case "mobile":
			switch (Browser) {

			case "android":

				caps.setCapability("browserName", "android");
				caps.setCapability("device", "Nexus 6");
				caps.setCapability("realMobile", "true");
				caps.setCapability("os_version", "6.0");
				caps.setCapability("name", "vimalraj12's First Test");
				driver = new RemoteWebDriver(new java.net.URL(URL), caps);
				break;
			case "ios":

				caps.setCapability("browserName", "iPhone");
				caps.setCapability("device", "iPhone XS");
				caps.setCapability("realMobile", "true");
				caps.setCapability("os_version", "13");
				caps.setCapability("name", "vimalraj12's First Test");
				driver = new RemoteWebDriver(new java.net.URL(URL), caps);

				break;
			default:
				System.out.println("invalid browser");
				break;
			}
		default:
			System.out.println("invalid platform");
			break;
		}

	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

	public static void type(WebElement e, String value) {
		e.sendKeys(value);
		// TODO Auto-generated method stub

	}

}
