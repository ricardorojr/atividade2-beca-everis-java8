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

	public void preencherFormulario() {
		formularioMap.select1.click(driver);
		formularioMap.select2.click(driver);
		formularioMap.btnFindFlight.click(driver);

	}

	public void preencerFormularioCT2() {

		formularioMap.btnChoseThisFlight.click(driver);
		formularioMap.preencherName.sendKeys(driver, "Ricardo");
		formularioMap.preencherAdress.sendKeys(driver, "Travessa");
		formularioMap.preeencherCity.sendKeys(driver, "Uberlândia");
		formularioMap.preencherState.sendKeys(driver, "MG");
		formularioMap.preeencherZipCode.sendKeys(driver, "38400000");
		formularioMap.preencherCardType.click(driver);
		formularioMap.preencherNCartao.sendKeys(driver, "1111111111111111");
		formularioMap.preencherMes.sendKeys(driver, "05");
		formularioMap.preencherAno.sendKeys(driver, "2020");
		formularioMap.preencherMCartao.sendKeys(driver, "13550");
		formularioMap.preencherRemember.click(driver);
		formularioMap.btnPurchaseFlight.click(driver);
	}

	public void validarMensagemSucesso() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formularioMap.mensagem1.getValue())));
			String resultado1 = driver.findElement(By.xpath(formularioMap.mensagem1.getValue())).getText();
			System.out.println(resultado1);
			Assert.assertEquals("Erro ao ao validar botao da mensagem de sucesso!", "Departs: San Diego", resultado1);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formularioMap.mensagem2.getValue())));
			String resultado2 = driver.findElement(By.xpath(formularioMap.mensagem2.getValue())).getText();
			System.out.println(resultado2);
			Assert.assertEquals("Erro ao ao validar botao da mensagem de sucesso!", "Arrives: New York", resultado2);

			System.out.println("Sucesso");
		} catch (Exception e) {
			System.out.println("Falha");
		}
	}

	public void validarMensagem() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formularioMap.mensagem3.getValue())));
			String resultado3 = driver.findElement(By.xpath(formularioMap.mensagem3.getValue())).getText();
			System.out.println(resultado3);
			Assert.assertEquals("Erro ao ao validar botao da mensagem de sucesso!",
					"Thank you for your purchase today!", resultado3);

			System.out.println("Sucesso");
		} catch (Exception e) {
			System.out.println("Falha");
		}

	}
}
