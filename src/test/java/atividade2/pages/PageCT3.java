package atividade2.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import atividade2.uimaps.MapCT3;

public class PageCT3 {

	WebDriver driver;

	public PageCT3(WebDriver driver) {
		this.driver = driver;
	}

	MapCT3 mapCT3 = new MapCT3(driver);

	public void preencherVoo() {
		mapCT3.selecionar1("Mexico City").click(driver);
		
		mapCT3.selecionar2("Berlin").click(driver);

		mapCT3.btnFindFlight("Find Flights").click(driver);

		mapCT3.btnChoseThisFlight("12").click(driver);

		mapCT3.preencherNome("Name").sendKeys(driver, "Ricardo");

		mapCT3.preencherAddress("Address").sendKeys(driver, "Travessa");

		mapCT3.preencherCity("City").sendKeys(driver, "Uberlândia");

		mapCT3.preencherState("State").sendKeys(driver, "Minas Gerais");

		mapCT3.preencherZipCode("Zip Code").sendKeys(driver, "38400000");

		mapCT3.selecionarCartao("Visa").click(driver);

		mapCT3.preencheNUmeroCartao("Credit Card Number").sendKeys(driver, "1111111111111111");

		mapCT3.preencherMonth("Month").sendKeys(driver, "05");

		mapCT3.preencherMonth("Year").sendKeys(driver, "1987");

		mapCT3.nameOnCard("Name on Card").sendKeys(driver, "visa");

		mapCT3.btnPurchaseFlight("Purchase Flight").click(driver);

	}
	public void validarMensagem() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mapCT3.mensagem4.getValue())));
			String resultado4 = driver.findElement(By.xpath(mapCT3.mensagem4.getValue())).getText();
			System.out.println(resultado4);
			Assert.assertEquals("Erro ao ao validar botao da mensagem de sucesso!",
					"Thank you for your purchase today!", resultado4);

			System.out.println("Sucesso");
		} catch (Exception e) {
			System.out.println("Falha");
		}

	}
}
