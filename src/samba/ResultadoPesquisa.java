package samba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadoPesquisa {
	
	private WebDriver driver;

	public ResultadoPesquisa(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clicaResultado(Integer resultado) {
		driver.findElements(By.className("_NId")).get(resultado).click();
	}

}
