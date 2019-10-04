package dduar;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Number_Of_Items{
	
	public void get(ChromeDriver driver) {
		
		final String ebayUrl = "https://www.ebay.com/";
		
		Ebay_Home ebay = new Ebay_Home();
		
		//Ingreso a la página
		driver.get(ebayUrl);
		//Uso la barra de búsqueda y obtengo la cantidad de resultados
		String numberOfProducts = ebay.search(driver);
		
		System.out.println("Se encontraron un total de " + numberOfProducts);
	}
}
