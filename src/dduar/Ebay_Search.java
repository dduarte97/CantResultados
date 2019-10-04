package dduar;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay_Search {
	
	private int numberOfItems;
	private Boolean elementExist;
	
	public int count(ChromeDriver driver) {
		numberOfItems = 0;
		elementExist = driver.findElements(By.id("srp-river-results-listing1")).size() > 0;
		do {
			numberOfItems++;
			elementExist = driver.findElements(By.id("srp-river-results-listing" + numberOfItems)).size() > 0;
		}while(elementExist);
		return numberOfItems - 1;
	}
}
