package dduar;

import org.openqa.selenium.chrome.ChromeDriver;

class Main {
	
	public static void main (String[] args) {
		final String chromeDriverPath = "C:\\chromedriver.exe";
		Test_Number_Of_Items numberOfItems = new Test_Number_Of_Items();
		
		ChromeDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		
		//Se ejecuta la "prueba" de obtener cantidad de resultados
		numberOfItems.get(driver);
		
		driver.quit();
		}
}
