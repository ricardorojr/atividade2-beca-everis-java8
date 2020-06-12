package atividade2.scenario;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import atividade2.core.Driver;
import atividade2.pages.FormularioPage;
import atividade2.pages.InicioPage;

public class CT2 {
	WebDriver driver;
	InicioPage inicioPage;
	FormularioPage formularioPage;
		
	//carrega a pagina
	@Before
	public void before() {
		driver = new Driver().getDriver();
		Driver.acessoURL(driver, "https://blazedemo.com/");
		inicioPage = new InicioPage(driver);
		formularioPage = new FormularioPage(driver);
	}
		
	//executa o teste
	@Test
	public void test() {
		formularioPage.preencherFormulario();
		formularioPage.preencerFormularioCT2();
		formularioPage.validarMensagem();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	//finaliza a pagina
	@After	
	public void after() {
		Driver.close(driver);
	}
}
