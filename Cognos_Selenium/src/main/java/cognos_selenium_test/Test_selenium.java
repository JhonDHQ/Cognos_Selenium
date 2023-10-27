package cognos_selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String exePath = "./driver/chromedriver.exe";// Especificamos la ruta del chromedriver	
	System.setProperty("webdriver.chrome.driver", exePath); // agregar la propiedad con la ruta de chromedriver
	
	WebDriver driver = new ChromeDriver(); //objeto de Webdriver
	driver.get("https://www.google.com");
	

	}

}
