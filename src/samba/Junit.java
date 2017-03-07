package samba;

import java.io.File;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Junit {

	@Test
	public void teste() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		
		
		File pathBinary = new File("C:\\program files\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();       
//		WebDriver driver = new FirefoxDriver(firefoxBinary, firefoxProfile);
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.co.uk");
		
		
		
		PaginaGoogle google = new PaginaGoogle(driver);
		ResultadoPesquisa pesquisa = google.pesquisa("fernanda");
		
		pesquisa.clicaResultado(2);

		
		driver.close();  
		driver.quit();  
	}
}
