package samba;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaGoogle {

	private WebDriver driver;

	public PaginaGoogle(WebDriver driver) {
		this.driver = driver;
	}

	public ResultadoPesquisa pesquisa(String query) {
		getInputField().sendKeys(query);
		getInputField().sendKeys(Keys.RETURN);
		
		return new ResultadoPesquisa(driver);
	}

	private WebElement getInputField() {
		return driver.findElement(By.id("lst-ib"));
	}
}
