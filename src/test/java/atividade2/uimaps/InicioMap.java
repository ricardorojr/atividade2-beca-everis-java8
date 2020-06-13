package atividade2.uimaps;

import org.openqa.selenium.WebDriver;

import atividade2.core.Element;
import atividade2.enums.ByValue;

public class InicioMap {
WebDriver driver;
	
	public InicioMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public Element selectTipoFormulario = new Element(driver, ByValue.XPATH, "//div[@class='nav']/select");
	
	public Element btnViewDemo(String string) {
		return new Element(driver, ByValue.XPATH, "(//a[text()='"+string+"']//following::a[text()='View Demo'])[1]");
	}

		
		
		
		//mapeia botao para enviar formulario
		public Element btnPurchaseFlight(String nomeBotao) {
			return new Element(driver, ByValue.XPATH, "//input[@value='"+nomeBotao+"']");
		}
		
}
