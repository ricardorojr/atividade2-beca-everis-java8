package atividade2.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import atividade2.uimaps.MapCT2;

public class PageCT2 {
	WebDriver driver;

	public PageCT2(WebDriver driver) {
		this.driver = driver;
	}

	MapCT2 formularioMapCT2 = new MapCT2(driver);

	// formulario caso de teste 2
	public void preencherFormularioCT2() {
		formularioMapCT2.select1.click(driver);
		formularioMapCT2.select2.click(driver);
		formularioMapCT2.btnFindFlight.click(driver);
		formularioMapCT2.btnChoseThisFlight.click(driver);
		formularioMapCT2.preencherName.sendKeys(driver, "Ricardo");
		formularioMapCT2.preencherAdress.sendKeys(driver, "Travessa");
		formularioMapCT2.preeencherCity.sendKeys(driver, "Uberlândia");
		formularioMapCT2.preencherState.sendKeys(driver, "MG");
		formularioMapCT2.preeencherZipCode.sendKeys(driver, "38400000");
		formularioMapCT2.preencherCardType.click(driver);
		formularioMapCT2.preencherNCartao.sendKeys(driver, "1111111111111111");
		formularioMapCT2.preencherMes.sendKeys(driver, "05");
		formularioMapCT2.preencherAno.sendKeys(driver, "2020");
		formularioMapCT2.preencherMCartao.sendKeys(driver, "13550");
		formularioMapCT2.preencherRemember.click(driver);
		formularioMapCT2.btnPurchaseFlight.click(driver);
	}

	// comparar mensagem CT2
	public void validarMensagem() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formularioMapCT2.mensagem3.getValue())));
			String resultado3 = driver.findElement(By.xpath(formularioMapCT2.mensagem3.getValue())).getText();
			System.out.println(resultado3);
			Assert.assertEquals("Erro ao ao validar botao da mensagem de sucesso!",
					"Thank you for your purchase today!", resultado3);

			System.out.println("Sucesso");
		} catch (Exception e) {
			System.out.println("Falha");
		}

	}

}
