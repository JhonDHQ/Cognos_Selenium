package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	
	SoftAssert softAssert = new SoftAssert();
  @Test
  public void softAssertEquals() 
  {
	  int a = 10;
	  int b = 12;
	  int c = 8;
	  int d = 8;
	  
	  softAssert.assertEquals(a,b);
	  softAssert.assertEquals(c,d);
	  
	  softAssert.assertAll();
  }

  
  @Test
  public void verificarTitulo() 
  {
	  	String exePath = "./driver/chromedriver.exe";// Especificamos la ruta del chromedriver
	  
		System.setProperty("webdriver.chrome.driver", exePath); // agregar la propiedad con la ruta de chromedriver
		
		WebDriver driver = new ChromeDriver(); //objeto de Webdriver
		
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		
		String TituloActual = driver.getTitle();
		
		String Esperado = "The Internet";
		
		String Malo = "asd";
		
		softAssert.assertEquals(TituloActual,Malo);
		softAssert.assertEquals(TituloActual,Esperado);
		
		softAssert.assertAll();
		
		
  }
  
}
