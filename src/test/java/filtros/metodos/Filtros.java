package filtros.metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import filtros.todos.ViewBTDTO;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Filtros {
	
	public void waitemcimacss(WebDriver driver, String esperar) {
		WebElement element = driver.findElement(By.cssSelector(esperar));
		Actions builder = new Actions(driver);
		builder.moveToElement(element).perform();
	}

	public void login(WebDriver driver, String link){
		driver.get(link);
		click(driver, "details-button");
		click(driver, "proceed-link");
		waitingtoclick(driver, "formLogin:txtUsuario");
		click(driver, "formLogin:txtUsuario");
		escreverlogin(driver, "formLogin:txtUsuario");
		escreversenhaenter(driver, "formLogin:txtPassword");
	}
		
	public void login2(WebDriver driver, String link){
		driver.get(link);
		waitingtoclick(driver, "formLogin:txtUsuario");
		click(driver, "formLogin:txtUsuario");
		escreverlogin(driver, "formLogin:txtUsuario");
		escreversenhaenter(driver, "formLogin:txtPassword");
	}

	public List<ViewBTDTO> getViews(){
		List<ViewBTDTO> test = new ArrayList<>();
		ViewBTDTO bt = new ViewBTDTO();
		bt.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewbtbrand.jsf");
		bt.setTable("treeViewBTBrandDTO_data");
		test.add(bt);
		ViewBTDTO bt2 = new ViewBTDTO();
		bt2.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewissuer.jsf");
		bt2.setTable("listViewBTIssuerDTO_data");
		test.add(bt2);
		ViewBTDTO bt3 = new ViewBTDTO();
		bt3.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewproduct.jsf");
		bt3.setTable("treeViewBTSubProductDTO_data");
		test.add(bt3);
		ViewBTDTO bt4 = new ViewBTDTO();
		bt4.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewprivatelabel.jsf");
		bt4.setTable("listViewBTSubProductDTO_data");
		test.add(bt4);
		ViewBTDTO bt5 = new ViewBTDTO();
		bt5.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewnet.jsf");
		bt5.setTable("listViewBTNetDTO_data");
		test.add(bt5);
		return test;
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
	
	public void waitingrelatorio(WebDriver driver, String id_waiting3) {

		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id_waiting3)));
	}

	public void notequals(WebDriver driver, String notrue) {
		String textoElement = driver.findElement(By.xpath(notrue)).getText();
		assertNotEquals("Nenhum registro encontrado.", textoElement);
	}
	
	public void notequalsid(WebDriver driver, String notrue) {
		String textoElement = driver.findElement(By.id(notrue)).getText();
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

	//// Referentes a tela
	public void writeperiod1x(WebDriver driver, String escreverperiodo1) {
		driver.findElement(By.xpath(escreverperiodo1)).sendKeys("08092020 1020");
	}
	public void writeperiod1css(WebDriver driver, String escreverperiodo1) {
		driver.findElement(By.cssSelector(escreverperiodo1)).sendKeys("08092020 1020");
	}

	public void writeperiod2x(WebDriver driver, String escreverperiodo2) {
		driver.findElement(By.xpath(escreverperiodo2)).sendKeys("08092020 1030");
	}

	public void writepanx(WebDriver driver, String escreverpanx) {
		driver.findElement(By.xpath(escreverpanx)).sendKeys("0");
		assertEquals("0", driver.findElement(By.xpath(escreverpanx)).getAttribute("value"));
	}
	
	public void writecvvx(WebDriver driver, String escrevercvvx) {
		driver.findElement(By.xpath(escrevercvvx)).sendKeys("0");
		assertEquals("0", driver.findElement(By.xpath(escrevercvvx)).getAttribute("value"));
	}

	public void writedescx(WebDriver driver, String escreverdescx) {
		driver.findElement(By.xpath(escreverdescx)).sendKeys("m");
		assertEquals("m", driver.findElement(By.xpath(escreverdescx)).getAttribute("value"));
	}

	public void writeportx(WebDriver driver, String escreverportx) {
		driver.findElement(By.xpath(escreverportx)).sendKeys("0");
		assertEquals("0", driver.findElement(By.xpath(escreverportx)).getAttribute("value"));
	}

	public void SelectAllCombo(WebDriver driver, String SelecionarTodos){
		WebElement element = driver.findElement(By.xpath(SelecionarTodos));
		Select combo = new Select(element);
		List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
		Assert.assertEquals(3, allSelectedOptions.size());
		
		assertEquals("0", driver.findElement(By.xpath(SelecionarTodos)).getAttribute("value"));
}
}
	

