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

	//seleciona cidade de partida
		public Element selecionar1(String departureCity) {
			return new Element(driver, ByValue.XPATH, "//select[@name='fromPort']//following-sibling::option[@value='"+departureCity+"']");
		}
		
		//seleciona cidade de chegada
		public Element selecionar2(String destinationCity) {
			return new Element(driver, ByValue.XPATH, "//select[@name='toPort']//following-sibling::option[@value='"+destinationCity+"']");
		}
		
		//clica no botao Find Flight
		public Element btnFindFlight(String nomeDoBotao) {
			return new Element(driver, ByValue.XPATH, "//input[@value='"+nomeDoBotao+"']");
		}
		
		//clica no botao Chose This Flight do voo selecionado
		public Element btnChoseThisFlight(String numeroVoo) {
			return new Element(driver, ByValue.XPATH, "(//td[text()='"+numeroVoo+"']/..//input)");
		}
		
		//preenche o nome
		public Element preencherNome(String label) {
			return new Element(driver, ByValue.XPATH, "//label[text()='"+label+"']//following-sibling::div//input[@type='text']");
		}
		
		//preenche o endereco
		public Element preencherAddress(String label) {
			return new Element(driver, ByValue.XPATH, "//div[@class='controls']//..//label[text()='"+label+"']//following-sibling::div//input");
		}
		
		//preenche a cidade
		public Element preencherCity(String label) {
			return new Element(driver, ByValue.XPATH, "//label[text()='"+label+"']//following-sibling::div//input");
		}
		
		//preenche o estado
		public Element preencherState(String label) {
			return new Element(driver, ByValue.XPATH, "//label[text()='"+label+"']//following-sibling::div//input");
		}
		
		//preenche o codigo postal
		public Element preencherZipCode(String label) {
			return new Element(driver, ByValue.XPATH, "//label[text()='"+label+"']//following-sibling::div//input");
		}
		
		//seleciona o cartao
		public Element selecionarCartao(String nomedoCartao) {
			return new Element(driver, ByValue.XPATH, "//select[@class='form-inline']//option[text()='"+nomedoCartao+"']");
		}
		
		//numero do cartao
			public Element preencheNUmeroCartao(String label) {
				return new Element(driver, ByValue.XPATH, "//label[text()='"+label+"']//following-sibling::div//input");
			}
		
		//preenche o mes
		public Element preencherMonth(String label) {
			return new Element(driver, ByValue.XPATH, "//label[text()='"+label+"']//following-sibling::div//input");
		}
			
		//preenche o ano
		public Element preencherYear(String label) {
			return new Element(driver, ByValue.XPATH, "//label[text()='"+label+"']//following-sibling::div//input");
		}
		
		//preenche nome do cartao
		public Element nameOnCard(String label) {
			return new Element(driver, ByValue.XPATH, "//label[text()='"+label+"']//following-sibling::div//input");
		}
		
		
		//clica no botao para enviar formulario
		public Element btnPurchaseFlight(String nomeBotao) {
			return new Element(driver, ByValue.XPATH, "//input[@value='"+nomeBotao+"']");
		}
		
}
