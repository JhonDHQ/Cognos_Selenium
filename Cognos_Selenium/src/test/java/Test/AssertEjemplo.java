package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEjemplo {
  @Test
  public void VerificarTituloPagina() 
  {
		String exePath = "./driver/chromedriver.exe";// Especificamos la ruta del chromedriver	
		System.setProperty("webdriver.chrome.driver", exePath); // agregar la propiedad con la ruta de chromedriver
		
		WebDriver driver = new ChromeDriver(); //objeto de Webdriver
		
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		String TituloActual = driver.getTitle();
		
		String TextEsperado = "The Internet";
		
		Assert.assertEquals(TituloActual, TextEsperado);
		
		
		
		
  }
}
