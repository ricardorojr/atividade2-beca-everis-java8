package atividade2.uimaps;

import org.openqa.selenium.WebDriver;

import atividade2.core.Element;
import atividade2.enums.ByValue;

public class FormularioMap {
	
	WebDriver driver;
	public FormularioMap(WebDriver driver) {
		this.driver = driver;
	}
	
	//Selecionar campos CT1
	public Element select1 = new Element(driver, ByValue.XPATH, "//*[@class='form-inline']//following-sibling::option[5]");
	public Element select2 = new Element(driver, ByValue.XPATH, "//*[@name='toPort']//following-sibling::option[5]");
	public Element btnFindFlight = new Element(driver, ByValue.XPATH, "//*[@value='Find Flights']");
	
	
	//validar Mensagem CT1
	public Element mensagem1 = new Element(driver, ByValue.XPATH, "//th[text()='Departs: San Diego']");
	public Element mensagem2 = new Element(driver, ByValue.XPATH, "//th[text()='Arrives: New York']");
	
	
}
