package dduar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay_Home {
	private static final String product = "Pilas";
	
	Ebay_Search searchResults = new Ebay_Search();

	
	public String search(ChromeDriver driver) {
		//Barra de b�squeda
		WebElement searchBar = driver.findElementById("gh-ac");
		searchBar.sendKeys(product);
		//Bot�n Buscar
		WebElement searchButton = driver.findElementById("gh-btn");
		searchButton.click();
		//Obtengo texto que informa cantidad de resultados
		String numberOfProducts = searchResults.count(driver);
		
		return numberOfProducts;
	}
}
