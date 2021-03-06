package atividade2.core;

import javax.swing.JFrame;
import javax.swing.JTextField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import atividade2.enums.ByValue;

public class Element  {
	private WebDriver driver;
	private String value;
	private ByValue byvalue;
	private Object m;

	
	
	public Element(WebDriver driver, ByValue byvalue, String value) {
		super();
		this.driver = driver;
		this.byvalue = byvalue;
		this.value = value;
	}

	public WebElement criarElemento(WebDriver driver) {
		try {
			Thread.sleep(1000);
			WebDriverWait wait = new WebDriverWait(driver, 10);
			switch (byvalue) {
			case XPATH:
				return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(value)));
			case ID:
				return wait.until(ExpectedConditions.presenceOfElementLocated(By.id(value)));
			case CLASS_NAME:
				return wait.until(ExpectedConditions.presenceOfElementLocated(By.className(value)));
			default:
				return null;
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void click(WebDriver driver) {
		criarElemento(driver).click();
	}

	public void sendKeys(WebDriver driver, String string) {
		criarElemento(driver).clear();
		criarElemento(driver).sendKeys(string);
	}

	public void select(WebDriver driver, String visibleText) {
		Select select = new Select(criarElemento(driver));
		select.selectByVisibleText(visibleText);
	}

	public String getValue() {
		return this.value;
	}
		
		
}
