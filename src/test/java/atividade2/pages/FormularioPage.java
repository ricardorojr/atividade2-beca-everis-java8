package atividade2.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import atividade2.uimaps.FormularioMap;

public class FormularioPage {
	WebDriver driver;

	public FormularioPage(WebDriver driver) {
		this.driver = driver;
	}

	FormularioMap formularioMap = new FormularioMap(driver);
	
	//formulario caso de teste 1 
	public void preencherFormulario() {
		formularioMap.select1.click(driver);
		formularioMap.select2.click(driver);
		formularioMap.btnFindFlight.click(driver);

	}
	
	/** metodo que valida a mensagem de sucesso 
	 */
	public void validarMensagemSucesso() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(formularioMap.mensagem1.getValue())));
			String resultado = driver.findElement(By.xpath(formularioMap.mensagem1.getValue())).getText();
			System.out.println(resultado);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(formularioMap.mensagem2.getValue())));
			String resultado1 = driver.findElement(By.xpath(formularioMap.mensagem2.getValue())).getText();
			System.out.println(resultado1);
			Assert.assertEquals("Erro ao ao validar botao da mensagem de sucesso!", "Departs: San Diego", resultado);
			Assert.assertEquals("Erro ao ao validar botao da mensagem de sucesso!", "Arrives: New York", resultado1);
			
			System.out.println("Sucesso");
		} catch (Exception e) {
			System.out.println("Falha");
		}
	}
		
}
