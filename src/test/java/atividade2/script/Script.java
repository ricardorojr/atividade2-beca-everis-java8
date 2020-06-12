package atividade2.script;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver" + File.separator + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://blazedemo.com/");
		
		driver.findElement(By.xpath("//*[@class='form-inline']//following-sibling::option[5]")).click();
		
		driver.findElement(By.xpath("//*[@name='toPort']//following-sibling::option[5]")).click();
		
		driver.findElement(By.xpath("//*[@value='Find Flights']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//th[text()='Departs: San Diego']")));
			String sanDiego = driver.findElement(By.xpath("//th[text()='Departs: San Diego']")).getText();
			System.out.println(sanDiego);
			Assert.assertEquals("Erro ao ao validar botao da mensagem de sucesso!", "Departs: San Diego", sanDiego);
			
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//th[text()='Arrives: New York']")));
			String newYork = driver.findElement(By.xpath("//th[text()='Arrives: New York']")).getText();
			System.out.println(newYork);
			Assert.assertEquals("Erro ao ao validar botao da mensagem de sucesso!", "Arrives: New York", newYork);
			
			System.out.println("Sucesso");
		} catch (Exception e) {
			System.out.println("Falha");
		}

	}

}
