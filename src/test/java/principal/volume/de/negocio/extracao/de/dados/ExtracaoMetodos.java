package principal.volume.de.negocio.extracao.de.dados;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExtracaoMetodos {
	public void click (WebDriver driver, String clicar) {
		driver.findElement(By.id(clicar)).click();
	}
	public void clickx (WebDriver driver, String clicar) {
		driver.findElement(By.xpath(clicar)).click();
	}
	public void escreverlogin (WebDriver driver, String escrever) {
		driver.findElement(By.id(escrever)).sendKeys("qa");	
	}
	public void escreversenhaenter (WebDriver driver, String escrever) {
		driver.findElement(By.id(escrever)).sendKeys("Unicom@10", Keys.ENTER);	
	}
	public void waiting (WebDriver driver, String id_waiting) {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id_waiting)));
	}
	public void waiting2 (WebDriver driver, String id_waiting2) {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id_waiting2)));
	}
	public void waitingtoclick (WebDriver driver, String id_waitingV) {
		
		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(id_waitingV)));
	}
	public void waitingtoclickx (WebDriver driver, String id_waitingclick) {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(id_waitingclick)));
	}
	public void changewindow (WebDriver driver, String change) {
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));
		driver.switchTo().window(tabs2.get(1));
	}
	public void equals (WebDriver driver, String igual) {
	String textoElement = driver.findElement(By.cssSelector(igual)).getText();
    assertEquals("Mensagem enviada com sucesso", textoElement);
	}
	////Referentes a tela
	public void escreverperiodo1 (WebDriver driver, String escrever) {
		driver.findElement(By.id(escrever)).sendKeys("01/09/2020 00:00:00");
	}
	public void escreverperiodo2 (WebDriver driver, String escrever) {
		driver.findElement(By.id(escrever)).sendKeys("01/09/2020 00:02:00");
	}
	public void escreverpan (WebDriver driver, String escrever10) {
		driver.findElement(By.id(escrever10)).sendKeys("C89CA");
	}
	public void escrevercvv (WebDriver driver, String escrever9) {
		driver.findElement(By.id(escrever9)).sendKeys("A1121");
	}
	public void escreverdesc (WebDriver driver, String escrever8) {
		driver.findElement(By.id(escrever8)).sendKeys("Boa");
	}
	public void escreverport (WebDriver driver, String escrever7) {
		driver.findElement(By.id(escrever7)).sendKeys("28A38");
	}
	public void waitingrelatorio (WebDriver driver, String id_waiting3) {
		
		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id_waiting3)));
	}
}
