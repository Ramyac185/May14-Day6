package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMobilePrices {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles", Keys.ENTER);
		
		List<WebElement> pricetext = driver.findElements(By.className("a-price-whole"));
		List<Integer> mobilePrice = new ArrayList<>();
		
		for (WebElement i : pricetext) {
			String priceText = i.getText();
			String replacedString = priceText.replaceAll(",", "");
			if(!replacedString.isEmpty()) {
				int priceValue = Integer.parseInt(replacedString);
				System.out.println(priceValue);
				mobilePrice.add(priceValue);
			}
		}
		Collections.sort(mobilePrice);
		System.out.println(mobilePrice);
		System.out.println("The least price of the searched mobile is "+mobilePrice.get(0));		
	}
}
