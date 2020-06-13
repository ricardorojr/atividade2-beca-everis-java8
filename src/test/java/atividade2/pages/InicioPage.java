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



}
