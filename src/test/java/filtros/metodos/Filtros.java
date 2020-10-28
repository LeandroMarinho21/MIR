package filtros.metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Filtros {
	public void waitemcimacss(WebDriver driver, String esperar) {
		WebElement element = driver.findElement(By.cssSelector(esperar));
		Actions builder = new Actions(driver);
		builder.moveToElement(element).perform();
	}
	public void click(WebDriver driver, String clicar) {
		driver.findElement(By.id(clicar)).click();
	}

	public void clickx(WebDriver driver, String clicar) {
		driver.findElement(By.xpath(clicar)).click();
	}
	public void clickcss(WebDriver driver, String clicar) {
		driver.findElement(By.cssSelector(clicar)).click();
	}

	public void escreverlogin(WebDriver driver, String escrever) {
		driver.findElement(By.id(escrever)).sendKeys("qa");
	}

	public void escreversenhaenter(WebDriver driver, String escrever) {
		driver.findElement(By.id(escrever)).sendKeys("Unicom@10", Keys.ENTER);
	}

	public void waiting(WebDriver driver, String id_waiting) {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id_waiting)));
	}

	public void waiting2(WebDriver driver, String id_waiting2) {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id_waiting2)));
	}

	public void waitingtoclick(WebDriver driver, String id_waitingV) {

		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(id_waitingV)));
	}

	public void waitingtoclickx(WebDriver driver, String id_waitingclick) {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(id_waitingclick)));
	}
	public void waitingtoclickcss(WebDriver driver, String css_waitingclick) {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(css_waitingclick)));
	}

	public void changewindow(WebDriver driver, String change) {
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));
		driver.switchTo().window(tabs2.get(1));
	}

	public void equals(WebDriver driver, String igual) {
		String textoElement = driver.findElement(By.cssSelector(igual)).getText();
		assertEquals("Mensagem enviada com sucesso", textoElement);
	}

	//// Referentes a tela
	public void writeperiod1x(WebDriver driver, String escreverix) {
		driver.findElement(By.xpath(escreverix)).sendKeys("08/09/2020 10:00:00");
	}

	public void writeperiod2x(WebDriver driver, String escreverex) {
		driver.findElement(By.xpath(escreverex)).sendKeys("08/09/2020 11:00:00");
	}

	public void writepanx(WebDriver driver, String escreverpanx) {
		driver.findElement(By.xpath(escreverpanx)).sendKeys("0");
	}

	public void writecvvx(WebDriver driver, String escrevercvvx) {
		driver.findElement(By.xpath(escrevercvvx)).sendKeys("0");
	}

	public void writedescx(WebDriver driver, String escreverdescx) {
		driver.findElement(By.xpath(escreverdescx)).sendKeys("m");
	}

	public void writeportx(WebDriver driver, String escreverportx) {
		driver.findElement(By.xpath(escreverportx)).sendKeys("0");
	}

	public void waitingrelatorio(WebDriver driver, String id_waiting3) {

		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id_waiting3)));
	}

	public void notequals(WebDriver driver, String notrue) {
		String textoElement = driver.findElement(By.xpath(notrue)).getText();
		assertNotEquals("Nenhum registro encontrado.", textoElement);
	}
	
	public void notequalsid(WebDriver driver, String notrue) {
		String textoElement = driver.findElement(By.xpath(notrue)).getText();
		assertNotEquals("Nenhum registro encontrado.", textoElement);
	}
	public void notequalserro(WebDriver driver, String notrue) {
		String textoElement = driver.findElement(By.xpath(notrue)).getText();
		assertNotEquals("Ocorreu um erro desconhecido, consulte o administrador.", textoElement);
	}
	public void erroDesc (WebDriver driver, String erro) {
		if (driver.findElement(By.xpath(erro)).isDisplayed())
			new AssertionError("Ocorreu um erro desconhecido.");
	}	
		
	public void notequalscss(WebDriver driver, String notrue) {
		String textoElement = driver.findElement(By.cssSelector(notrue)).getText();
		assertNotEquals("Nenhum registro encontrado.", textoElement);
	}    
		
}
		
	

