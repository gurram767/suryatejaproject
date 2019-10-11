package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PulseLogin {

	public static WebDriver driver;

	public static By username = By.id("P101_USERNAME");
	public static By password = By.id("P101_PASSWORD");
	public static By loginbutton = By.xpath("//*[@id=\"B2188001518354150704\"]/span[2]");

	public static void pulselogin() throws Exception {
		System.out.println("pulselogin");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://183.82.125.132:8460/ords/f?p=333:LOGIN_DESKTOP::::::");
		driver.manage().window().maximize();
		System.out.println("Browser lanuched");
		Thread.sleep(5000);
		System.out.println("Titile of page :- "+ driver.getTitle());
		driver.findElement(username).sendKeys("stgurram");
		driver.findElement(password).sendKeys("pulse456");
		driver.findElement(loginbutton).click();
		System.out.println("Login button clicked");
		Thread.sleep(10000);
		System.out.println("Navigated to dashboard");
		driver.close();
			
		}
		

	}

