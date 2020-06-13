package atividade2.scenario;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import atividade2.core.Driver;
import atividade2.pages.FormularioPage;
import atividade2.pages.InicioPage;
import atividade2.pages.PageCT2;

public class CT2 {
	WebDriver driver;
	InicioPage inicioPage;
	PageCT2 formularioPage;
		
	//carrega a pagina
	@Before
	public void before() {
		driver = new Driver().getDriver();
		Driver.acessoURL(driver, "https://blazedemo.com/");
		inicioPage = new InicioPage(driver);
		formularioPage = new PageCT2(driver);
	}
		
	//executa o teste
	@Test
	public void test() {
		formularioPage.preencherFormularioCT2();
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
