package filtros.metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.internal.runners.statements.Fail;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		test.add(bt);
		ViewBTDTO bt2 = new ViewBTDTO();
		bt2.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewissuer.jsf");
		test.add(bt2);
		ViewBTDTO bt3 = new ViewBTDTO();
		bt3.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewproduct.jsf");
		test.add(bt3);
		ViewBTDTO bt4 = new ViewBTDTO();
		bt4.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewprivatelabel.jsf");
		test.add(bt4);
		ViewBTDTO bt5 = new ViewBTDTO();
		bt5.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewnet.jsf");
		test.add(bt5);
		ViewBTDTO bt6 = new ViewBTDTO();
		bt6.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewbtregion.jsf");
		test.add(bt6);
		ViewBTDTO bt7 = new ViewBTDTO();
		bt7.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewgraphic.jsf");
		test.add(bt7);
		ViewBTDTO bt8 = new ViewBTDTO();
		bt8.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewtypetransaction.jsf");
		test.add(bt8);
		ViewBTDTO bt9 = new ViewBTDTO();
		bt9.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewkomercitransaction.jsf");
		test.add(bt9);
		ViewBTDTO bt10 = new ViewBTDTO();
		bt10.setUrl("https://192.168.80.18:8081/mir.console/pages/view/slaMilestone.jsf");
		test.add(bt10);
		ViewBTDTO bt11 = new ViewBTDTO();
		bt11.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewWallet.jsf");
		test.add(bt11);
		ViewBTDTO bt12 = new ViewBTDTO();
		bt12.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewservicecode.jsf");
		test.add(bt12);
		ViewBTDTO bt13 = new ViewBTDTO();
		bt13.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewbtserasa.jsf");
		test.add(bt13);
		ViewBTDTO bt14 = new ViewBTDTO();
		bt14.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewGroupEstablishmentPDV.jsf");
		test.add(bt14);
		ViewBTDTO bt15 = new ViewBTDTO();
		bt15.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewPosOperatorNew.jsf");
		test.add(bt15);
		ViewBTDTO bt16 = new ViewBTDTO();
		bt16.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewpiloto.jsf");
		test.add(bt16);
		ViewBTDTO bt17 = new ViewBTDTO();
		bt17.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewServiceGraphic.jsf");
		test.add(bt17);
		return test;
	}

	
	public void write(WebDriver driver, String id_campo, String texto) {
		driver.findElement(By.id(id_campo)).sendKeys(texto);
		}
	
	public void writeclass(WebDriver driver, String id_campo, String texto) {
		driver.findElement(By.className(id_campo)).sendKeys(texto);
		}
	
	public void writex(WebDriver driver, String id_campo, String texto) {
		driver.findElement(By.xpath(id_campo)).sendKeys(texto);
		}
	
	public void writecss(WebDriver driver, String id_campo, String texto) {
		driver.findElement(By.cssSelector(id_campo)).sendKeys(texto);
		}
	
	
	public String obteinValue(WebDriver driver, String id_campo) {
		 return driver.findElement(By.id(id_campo)).getAttribute("value");
		}
	
	public String obteinValuex(WebDriver driver, String id_campo) {
		 return driver.findElement(By.xpath(id_campo)).getAttribute("value");
		}
	
	public void click(WebDriver driver, String clicar) {
		driver.findElement(By.id(clicar)).click();
		}
	
	public void clear(WebDriver driver, String clicar) {
		driver.findElement(By.id(clicar)).clear();
		}
	
	public void clearx(WebDriver driver, String clicar) {
		driver.findElement(By.xpath(clicar)).clear();
		}
	
	public void clearcss(WebDriver driver, String clicar) {
		driver.findElement(By.cssSelector(clicar)).clear();
		}
	
	public void clickx(WebDriver driver, String clicar) {
		driver.findElement(By.xpath(clicar)).click();
	}
	public void clickcss(WebDriver driver, String clicar) {
		driver.findElement(By.cssSelector(clicar)).click();
	}
	
	public void clickclass(WebDriver driver, String clicar) {
		driver.findElement(By.className(clicar)).click();
	}

	public void escreverlogin(WebDriver driver, String escrever) {
		driver.findElement(By.id(escrever)).sendKeys("qa");
	}

	public void escreversenhaenter(WebDriver driver, String escrever) {
		driver.findElement(By.id(escrever)).sendKeys("Unicom@10", Keys.ENTER);
	}

	public void waiting(WebDriver driver, String id_waiting) {

		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id_waiting)));
	}

	public void waiting2(WebDriver driver, String id_waiting2) {

		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id_waiting2)));
	}
	public void waitingtoVisible(WebDriver driver, String Visivel) {

		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOf((WebElement)By.id(Visivel)));
	}
	
	public void waitingtoclick(WebDriver driver, String id_waitingV) {
		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(id_waitingV)));
	}

	public void waitingtoclickx(WebDriver driver, String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
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
	
	public void waitingtextpresentx(WebDriver driver, String esperatexto) {
		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(esperatexto), "Nenhum registro encontrado."));
	}
	
	public void waitingElementBeClickableid(WebDriver driver, String ElementoClicavel) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
		wait.until(ExpectedConditions.elementToBeClickable(By.id(ElementoClicavel)));
		} 
		catch (TimeoutException t) {
			System.out.println(t.getMessage());
			driver.quit();
			throw t;
		}			
	}
	
	public void waitingelementid(WebDriver driver, String ElementoVisivel) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(ElementoVisivel)));
		} 
		catch (TimeoutException t) {
			System.out.println(t.getMessage());
			driver.quit();
			throw t;
		}	
	}
	
	public void waitingelementxpath(WebDriver driver, String ElementoVisivel) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ElementoVisivel)));
		} 
		catch (TimeoutException t) {
			System.out.println(t.getMessage());
			driver.quit();
			throw t;
		}	
	}
	
	public void verificarelementox(WebDriver driver, String notrue) {
		String textoElement = driver.findElement(By.xpath(notrue)).getText();
		Assert.assertNotSame("Nenhum registro encontrado.", "Nenhum registro encontrado.", textoElement);
	}
	
	public void wait3(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	public void notequals(WebDriver driver, String notrue) {
		String textoElement = driver.findElement(By.xpath(notrue)).getText();
		System.out.println(textoElement);
		Assert.assertNotEquals("Nenhum registro encontrado.", textoElement);
	}
	
	public void notequalsclass(WebDriver driver, String notrue) {
		String textoElement = driver.findElement(By.className(notrue)).getText();
		System.out.println(textoElement);
		Assert.assertNotEquals("Nenhum registro encontrado.", textoElement);
	}
	
	public void notequals2(WebDriver driver, String notrue) {
		String textoElement = driver.findElement(By.xpath(notrue)).getText();
		System.out.println(textoElement);
		Assert.assertNotEquals("", textoElement);
	}
	
	public void notequalsid(WebDriver driver, String notrue) {
		String textoElement = driver.findElement(By.id(notrue)).getText();
		Assert.assertNotEquals("Nenhum registro encontrado.", textoElement);
	}
	public void notequalserro(WebDriver driver, String notrue) {
		String textoElement = driver.findElement(By.xpath(notrue)).getText();
		Assert.assertNotEquals("Ocorreu um erro desconhecido, consulte o administrador.", textoElement);
	}

	public void erroDesc (WebDriver driver, String erro) {
		try
		{
		 if(driver.findElement(By.xpath(erro)).isDisplayed() )      
			{ 
			 fail();
			}
		}
		 catch (Exception e) {}		 
	}
	
	public void notequalscss(WebDriver driver, String notrue) {
		String textoElement = driver.findElement(By.cssSelector(notrue)).getText();
		assertNotEquals("Nenhum registro encontrado.", textoElement);
	}    

	//// Referentes a tela
	
	public void writeperiod1x(WebDriver driver, String escreverperiodo1) {
		driver.findElement(By.xpath(escreverperiodo1)).sendKeys("080920201100");
	}
	
	public void writeperiod2x(WebDriver driver, String escreverperiodo2) {
		driver.findElement(By.xpath(escreverperiodo2)).sendKeys("080920201200");
	}
	
	public void sendKeys(String keysToSend,WebElement element){
        for(char c:keysToSend.toCharArray()){
            element.sendKeys(Character.toString(c));
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
	


	public void check3x(WebDriver driver, String lista) {
		WebElement element = driver.findElement(By.xpath(lista));
		Select combo = new Select(element);
		combo.selectByVisibleText("Alelo(78)");
		combo.selectByVisibleText("VR(55)");
		combo.selectByVisibleText("VR(79)");
		List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
		Assert.assertEquals(3, allSelectedOptions.size());
	}
	
	public void writeimei(WebDriver driver, String escreverimei) {
		driver.findElement(By.xpath(escreverimei)).sendKeys("0");
		Assert.assertEquals("0", driver.findElement(By.xpath(escreverimei)).getAttribute("value"));
	}
	public void writesimcard(WebDriver driver, String escreversimcard) {
		driver.findElement(By.xpath(escreversimcard)).sendKeys("0");
		Assert.assertEquals("0", driver.findElement(By.xpath(escreversimcard)).getAttribute("value"));
	}
	
	public void writeoperadora(WebDriver driver, String escreveroperadora) {
		driver.findElement(By.xpath(escreveroperadora)).sendKeys("V");
		Assert.assertEquals("V", driver.findElement(By.xpath(escreveroperadora)).getAttribute("value"));
	}
	
	
	public void writemacaddress(WebDriver driver, String escrevermacaddress) {
		driver.findElement(By.xpath(escrevermacaddress)).sendKeys("0");
		Assert.assertEquals("0", driver.findElement(By.xpath(escrevermacaddress)).getAttribute("value"));
	}
	
	public void writeipterminal(WebDriver driver, String escreveripterminal) {
		driver.findElement(By.xpath(escreveripterminal)).sendKeys("0");
		Assert.assertEquals("0", driver.findElement(By.xpath(escreveripterminal)).getAttribute("value"));
	}
	
	public void writecodpais(WebDriver driver, String escrevercodpais) {
		driver.findElement(By.xpath(escrevercodpais)).sendKeys("0");
		Assert.assertEquals("0", driver.findElement(By.xpath(escrevercodpais)).getAttribute("value"));
	}
	
	public void writecodrede(WebDriver driver, String escrevercodrede) {
		driver.findElement(By.xpath(escrevercodrede)).sendKeys("0");
		Assert.assertEquals("0", driver.findElement(By.xpath(escrevercodrede)).getAttribute("value"));
	}
	
	public void writecodarea(WebDriver driver, String escrevercodarea) {
		driver.findElement(By.xpath(escrevercodarea)).sendKeys("0");
		Assert.assertEquals("0", driver.findElement(By.xpath(escrevercodarea)).getAttribute("value"));
	}
	
	public void writeidtcel(WebDriver driver, String escreveridtcel) {
		driver.findElement(By.xpath(escreveridtcel)).sendKeys("0");
		Assert.assertEquals("0", driver.findElement(By.xpath(escreveridtcel)).getAttribute("value"));
	}
	
	public void writeversionplat(WebDriver driver, String escreverversaodaplataforma) {
		driver.findElement(By.xpath(escreverversaodaplataforma)).sendKeys("0");
		Assert.assertEquals("0", driver.findElement(By.xpath(escreverversaodaplataforma)).getAttribute("value"));
	}
	public void writeversionca(WebDriver driver, String escreverversaoca) {
		driver.findElement(By.xpath(escreverversaoca)).sendKeys("0");
		Assert.assertEquals("0", driver.findElement(By.xpath(escreverversaoca)).getAttribute("value"));
	}
	
	public void writepanx(WebDriver driver, String escreverpanx) {
		driver.findElement(By.xpath(escreverpanx)).sendKeys("0");
		Assert.assertEquals("0", driver.findElement(By.xpath(escreverpanx)).getAttribute("value"));
	}
	
	public void writecvvx(WebDriver driver, String escrevercvvx) {
		driver.findElement(By.xpath(escrevercvvx)).sendKeys("0");
		Assert.assertEquals("0", driver.findElement(By.xpath(escrevercvvx)).getAttribute("value"));
	}

	public void writedescx(WebDriver driver, String escreverdescx) {
		driver.findElement(By.xpath(escreverdescx)).sendKeys("m");
		Assert.assertEquals("m", driver.findElement(By.xpath(escreverdescx)).getAttribute("value"));
	}

	public void writeportx(WebDriver driver, String escreverportx) {
		driver.findElement(By.xpath(escreverportx)).sendKeys("0");
		Assert.assertEquals("0", driver.findElement(By.xpath(escreverportx)).getAttribute("value"));
	}
}
	

