package week4Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement men = driver.findElementByXPath("//a[text() = 'Men']");
		Actions bulider = new Actions(driver);
		bulider.moveToElement(men).perform();
		driver.findElementByXPath("//a[text()='Jackets'][1]").click();
		WebElement titlecount = driver.findElementByXPath("//span[@class='title-count']");
	

	}

}
