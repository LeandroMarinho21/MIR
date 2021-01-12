package configuracoes.alarmes.sla;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import metodos.mir.ViewBTDTO;

public class MetodosSLA {

	WebDriver driver;

	public MetodosSLA(WebDriver driver) {
		this.driver = driver;
	}

		public void waitemcimacss(String esperar) {
			WebElement element = driver.findElement(By.cssSelector(esperar));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}

		public void login(){
			click("details-button");
			click("proceed-link");
			waitingtoclick("formLogin:txtUsuario");
			click("formLogin:txtUsuario");
			escreverlogin("formLogin:txtUsuario");
			waitingtoclick("formLogin:txtPassword");
			escreversenhaenter("formLogin:txtPassword");
		}
			
		public void login2(){
			waitingtoclick("formLogin:txtUsuario");
			click("formLogin:txtUsuario");
			escreverlogin("formLogin:txtUsuario");
			waitingtoclick("formLogin:txtPassword");
			escreversenhaenter("formLogin:txtPassword");
		}

		public WebElement findElement(String element) {
			return driver.findElement(By.xpath(element));
		}
		
		public void write(String id_campo, String texto) {
			driver.findElement(By.id(id_campo)).sendKeys(texto);
			}
		
		public void writeclass(String id_campo, String texto) {
			driver.findElement(By.className(id_campo)).sendKeys(texto);
			}
		
		public void writex(String id_campo, String texto) {
			driver.findElement(By.xpath(id_campo)).sendKeys(texto);
			}
		
		public void writecss(String id_campo, String texto) {
			driver.findElement(By.cssSelector(id_campo)).sendKeys(texto);
			}
		
		
		public String obteinValue(String id_campo) {
			 return driver.findElement(By.id(id_campo)).getAttribute("value");
			}
		
		public String obteinValuex(String id_campo) {
			 return driver.findElement(By.xpath(id_campo)).getAttribute("value");
			}
		
		public void click(String clicar) {
			driver.findElement(By.id(clicar)).click();
			}
		
		public void clickx(String clicar) {
			driver.findElement(By.xpath(clicar)).click();
			}
		
		public void clickcss(String clicar) {
			driver.findElement(By.cssSelector(clicar)).click();
			}
		
		public void clickclass(String clicar) {
			driver.findElement(By.className(clicar)).click();
			}
		
		public void clear(String clicar) {
			driver.findElement(By.id(clicar)).clear();
			}
		
		public void clearx(String clicar) {
			driver.findElement(By.xpath(clicar)).clear();
			}
		
		public void clearcss(String clicar) {
			driver.findElement(By.cssSelector(clicar)).clear();
			}

		public void escreverlogin(String escrever) {
			driver.findElement(By.id(escrever)).sendKeys("qa");
		}

		public void escreversenhaenter(String escrever) {
			driver.findElement(By.id(escrever)).sendKeys("Unicom@10", Keys.ENTER);
		}

		public void waiting(String id_waiting) {

			WebDriverWait wait = new WebDriverWait(driver, 180);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id_waiting)));
		}

		public void waiting2(String id_waiting2) {

			WebDriverWait wait = new WebDriverWait(driver, 180);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id_waiting2)));
		}
		public void waitingtoVisible(String Visivel) {

			WebDriverWait wait = new WebDriverWait(driver, 180);
			wait.until(ExpectedConditions.visibilityOf((WebElement)By.id(Visivel)));
		}
		
		public void waitingtoclick(String id_waitingV) {
			WebDriverWait wait = new WebDriverWait(driver, 180);
			wait.until(ExpectedConditions.elementToBeClickable(By.id(id_waitingV)));
		}

		public void waitingtoclickx(String xpath) {
			WebDriverWait wait = new WebDriverWait(driver, 180);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		}
		public void waitingtoclickcss(String css_waitingclick) {

			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(css_waitingclick)));
		}

		public void changewindow(String change) {
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(0));
			driver.switchTo().window(tabs2.get(1));
		}

		public void equals(String igual) {
			String textoElement = driver.findElement(By.cssSelector(igual)).getText();
			assertEquals("Mensagem enviada com sucesso", textoElement);
		}
		
		public void waitingrelatorio(String id_waiting3) {

			WebDriverWait wait = new WebDriverWait(driver, 180);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id_waiting3)));
		}
		
		public void waitingtextpresentx(String esperatexto) {
			WebDriverWait wait = new WebDriverWait(driver, 180);
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(esperatexto), "Nenhum registro encontrado."));
		}
		
		public void waitingElementBeClickableid(String ElementoClicavel) {
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
		
		public void waitingelementid(String ElementoVisivel) {
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
		
		public void waitingelementxpath(String ElementoVisivel) {
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
		
		public void verificarelementox(String notrue) {
			String textoElement = driver.findElement(By.xpath(notrue)).getText();
			Assert.assertNotSame("Nenhum registro encontrado.", "Nenhum registro encontrado.", textoElement);
		}
		
		public void wait3(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
		
		public void notequals(String notrue) {
			String textoElement = driver.findElement(By.xpath(notrue)).getText();
			System.out.println(textoElement);
			Assert.assertNotEquals("Nenhum registro encontrado.", textoElement);
		}
		
		public void notequalsclass(String notrue) {
			String textoElement = driver.findElement(By.className(notrue)).getText();
			System.out.println(textoElement);
			Assert.assertNotEquals("Nenhum registro encontrado.", textoElement);
		}
		
		public void notequals2(String notrue) {
			String textoElement = driver.findElement(By.xpath(notrue)).getText();
			System.out.println(textoElement);
			Assert.assertNotEquals("", textoElement);
		}
		
		public void notequalsid(String notrue) {
			String textoElement = driver.findElement(By.id(notrue)).getText();
			Assert.assertNotEquals("Nenhum registro encontrado.", textoElement);
		}
		public void notequalserro(String notrue) {
			String textoElement = driver.findElement(By.xpath(notrue)).getText();
			Assert.assertNotEquals("Ocorreu um erro desconhecido, consulte o administrador.", textoElement);
		}

		public void erroDesc (String erro) {
			try
			{
			 if(driver.findElement(By.xpath(erro)).isDisplayed() )      
				{ 
				 fail();
				}
			}
			 catch (Exception e) {}		 
		}
		
		public void notequalscss(String notrue) {
			String textoElement = driver.findElement(By.cssSelector(notrue)).getText();
			assertNotEquals("Nenhum registro encontrado.", textoElement);
		}    

		//// Referentes a tela
		
		public void writeperiod1x(String escreverperiodo1) {
			driver.findElement(By.xpath(escreverperiodo1)).sendKeys("080920201100");
		}
		
		public void writeperiod2x(String escreverperiodo2) {
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
		


		public void check3x(String lista) {
			WebElement element = driver.findElement(By.xpath(lista));
			Select combo = new Select(element);
			combo.selectByVisibleText("Alelo(78)");
			combo.selectByVisibleText("VR(55)");
			combo.selectByVisibleText("VR(79)");
			List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
			Assert.assertEquals(3, allSelectedOptions.size());
		}
		
		public void writeimei(String escreverimei) {
			driver.findElement(By.xpath(escreverimei)).sendKeys("0");
			Assert.assertEquals("0", driver.findElement(By.xpath(escreverimei)).getAttribute("value"));
		}
		public void writesimcard(String escreversimcard) {
			driver.findElement(By.xpath(escreversimcard)).sendKeys("0");
			Assert.assertEquals("0", driver.findElement(By.xpath(escreversimcard)).getAttribute("value"));
		}
		
		public void writeoperadora(String escreveroperadora) {
			driver.findElement(By.xpath(escreveroperadora)).sendKeys("V");
			Assert.assertEquals("V", driver.findElement(By.xpath(escreveroperadora)).getAttribute("value"));
		}
		
		
		public void writemacaddress(String escrevermacaddress) {
			driver.findElement(By.xpath(escrevermacaddress)).sendKeys("0");
			Assert.assertEquals("0", driver.findElement(By.xpath(escrevermacaddress)).getAttribute("value"));
		}
		
		public void writeipterminal(String escreveripterminal) {
			driver.findElement(By.xpath(escreveripterminal)).sendKeys("0");
			Assert.assertEquals("0", driver.findElement(By.xpath(escreveripterminal)).getAttribute("value"));
		}
		
		public void writecodpais(String escrevercodpais) {
			driver.findElement(By.xpath(escrevercodpais)).sendKeys("0");
			Assert.assertEquals("0", driver.findElement(By.xpath(escrevercodpais)).getAttribute("value"));
		}
		
		public void writecodrede(String escrevercodrede) {
			driver.findElement(By.xpath(escrevercodrede)).sendKeys("0");
			Assert.assertEquals("0", driver.findElement(By.xpath(escrevercodrede)).getAttribute("value"));
		}
		
		public void writecodarea(String escrevercodarea) {
			driver.findElement(By.xpath(escrevercodarea)).sendKeys("0");
			Assert.assertEquals("0", driver.findElement(By.xpath(escrevercodarea)).getAttribute("value"));
		}
		
		public void writeidtcel(String escreveridtcel) {
			driver.findElement(By.xpath(escreveridtcel)).sendKeys("0");
			Assert.assertEquals("0", driver.findElement(By.xpath(escreveridtcel)).getAttribute("value"));
		}
		
		public void writeversionplat(String escreverversaodaplataforma) {
			driver.findElement(By.xpath(escreverversaodaplataforma)).sendKeys("0");
			Assert.assertEquals("0", driver.findElement(By.xpath(escreverversaodaplataforma)).getAttribute("value"));
		}
		public void writeversionca(String escreverversaoca) {
			driver.findElement(By.xpath(escreverversaoca)).sendKeys("0");
			Assert.assertEquals("0", driver.findElement(By.xpath(escreverversaoca)).getAttribute("value"));
		}
		
		public void writepanx(String escreverpanx) {
			driver.findElement(By.xpath(escreverpanx)).sendKeys("0");
			Assert.assertEquals("0", driver.findElement(By.xpath(escreverpanx)).getAttribute("value"));
		}
		
		public void writecvvx(String escrevercvvx) {
			driver.findElement(By.xpath(escrevercvvx)).sendKeys("0");
			Assert.assertEquals("0", driver.findElement(By.xpath(escrevercvvx)).getAttribute("value"));
		}

		public void writedescx(String escreverdescx) {
			driver.findElement(By.xpath(escreverdescx)).sendKeys("m");
			Assert.assertEquals("m", driver.findElement(By.xpath(escreverdescx)).getAttribute("value"));
		}

		public void writeportx(String escreverportx) {
			driver.findElement(By.xpath(escreverportx)).sendKeys("0");
			Assert.assertEquals("0", driver.findElement(By.xpath(escreverportx)).getAttribute("value"));
		}


	}
		



