package atividade2.scenario;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import atividade2.core.Driver;
import atividade2.pages.FormularioPage;
import atividade2.pages.InicioPage;
import atividade2.pages.PageCT3;

public class CT3 {

	WebDriver driver;
	InicioPage inicioPage;
	PageCT3 formulario3;

	// carrega a pagina
	@Before
	public void before() {
		driver = new Driver().getDriver();
		Driver.acessoURL(driver, "https://blazedemo.com/");
		inicioPage = new InicioPage(driver);
		formulario3 = new PageCT3(driver);
	}

	// executa o teste
	@Test
	public void test() {
		formulario3.preencherVoo();
		formulario3.validarMensagem();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// finaliza a pagina
	@After
	public void after() {
		Driver.close(driver);
	}
}
