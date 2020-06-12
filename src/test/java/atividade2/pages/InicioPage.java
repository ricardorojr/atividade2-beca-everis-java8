package atividade2.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import atividade2.uimaps.InicioMap;

public class InicioPage {
	WebDriver driver;

	public InicioPage(WebDriver driver) {
		this.driver = driver;
	}

	InicioMap inicioMap = new InicioMap(driver);
	
	public void selecionarTipoFormulario() {
		inicioMap.selectTipoFormulario.select(driver, "Feedback");
		
		inicioMap.btnViewDemo("Neighborhood Events Questionnaire Form Demo").click(driver);
	}

	public void preencherVoo() {
		inicioMap.selecionar1("Mexico City").click(driver);
		
		inicioMap.selecionar2("Berlin").click(driver);
		
		inicioMap.btnFindFlight("Find Flights").click(driver);
		
		inicioMap.btnChoseThisFlight("234").click(driver);
		
		inicioMap.preencherNome("Name").sendKeys(driver, "Ricardo");
		
		inicioMap.preencherAddress("Address").sendKeys(driver, "Travessa");
		
		inicioMap.preencherCity("City").sendKeys(driver, "Uberlândia");
		
		inicioMap.preencherState("State").sendKeys(driver, "Minas Gerais");
		
		inicioMap.preencherZipCode("Zip Code").sendKeys(driver, "38400000");
		
		inicioMap.selecionarCartao("Visa").click(driver);;
		
		inicioMap.preencheNUmeroCartao("Credit Card Number").sendKeys(driver, "1111111111111111");
		
		inicioMap.preencherMonth("Month").sendKeys(driver, "05");
		
		inicioMap.preencherMonth("Year").sendKeys(driver, "1987");
		
		inicioMap.nameOnCard("Name on Card").sendKeys(driver, "visa");
		
		inicioMap.btnPurchaseFlight("Purchase Flight").click(driver);
		
	}

}
