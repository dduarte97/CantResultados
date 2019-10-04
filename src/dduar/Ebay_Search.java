package dduar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay_Search {
	
	public String count(ChromeDriver driver) {
		WebElement products = driver.findElement(By.className("srp-controls__count-heading"));
		String numberOfItems = products.getText();
		
		return numberOfItems;
	}
}
