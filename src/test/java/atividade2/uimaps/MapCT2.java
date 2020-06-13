package atividade2.uimaps;

import org.openqa.selenium.WebDriver;

import atividade2.core.Element;
import atividade2.enums.ByValue;

public class MapCT2 {
WebDriver driver;
	
	public MapCT2(WebDriver driver) {
		this.driver = driver;
	}
	
	//selecionar campos CT2
		public Element select1 = new Element(driver, ByValue.XPATH, "//*[@class='form-inline']//following-sibling::option[5]");
		public Element select2 = new Element(driver, ByValue.XPATH, "//*[@name='toPort']//following-sibling::option[5]");
		public Element btnFindFlight = new Element(driver, ByValue.XPATH, "//*[@value='Find Flights']");
		public Element btnChoseThisFlight = new Element(driver, ByValue.XPATH, "(//form[@name='VA43']//following::input[1])");
		public Element preencherName = new Element(driver, ByValue.ID, "inputName");
		public Element preencherAdress = new Element(driver, ByValue.ID, "address");
		public Element preeencherCity = new Element(driver, ByValue.ID, "city");
		public Element preencherState = new Element(driver, ByValue.ID, "state");
		public Element preencherCardType = new Element(driver, ByValue.XPATH, "//select[@id='cardType']//following::option[2]");
		public Element preeencherZipCode = new Element(driver, ByValue.ID, "zipCode");
		public Element preencherNCartao = new Element(driver, ByValue.ID, "creditCardNumber");
		public Element preencherMes = new Element(driver, ByValue.ID, "creditCardMonth");
		public Element preencherAno = new Element(driver, ByValue.ID, "creditCardYear");
		public Element preencherMCartao = new Element(driver, ByValue.ID, "nameOnCard");
		public Element preencherRemember = new Element(driver, ByValue.ID, "rememberMe");
		public Element btnPurchaseFlight = new Element(driver, ByValue.XPATH, "//input[@class='btn btn-primary']");
		

		
		//validar Mensagem CT2
		public Element mensagem3 = new Element(driver, ByValue.XPATH, "//h1[text()='Thank you for your purchase today!']");
}
