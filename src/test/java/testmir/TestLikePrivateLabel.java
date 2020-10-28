package testmir;

import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLikePrivateLabel {
	/// TesteFiltros
		@Test
		public void TestFiltrosLike() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://192.168.80.18:8081/mir.console");
			//driver.get("https://10.59.184.60/mir.console/index.jsf");
			/// Erro de Privacidade
			driver.findElement(By.id("details-button")).click();
			driver.findElement(By.id("proceed-link")).click();
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.elementToBeClickable(By.id("formLogin:txtUsuario")));
			}
			/// Login
			driver.findElement(By.id("formLogin:txtUsuario")).click();
			driver.findElement(By.id("formLogin:txtUsuario")).sendKeys("qa");
			driver.findElement(By.id("formLogin:txtPassword")).sendKeys("Unicom@10");
			driver.findElement(By.id("formLogin:linkLogin")).click();
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ui-mnu-bt")));
			}
			{
				WebElement element = driver.findElement(By.cssSelector(".ui-mnu-bt"));
				Actions builder = new Actions(driver);
				builder.moveToElement(element).perform();
			}
			/// Menu Private Label
			{
				driver.findElement(By.linkText("Visão - Private Label")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			/// Pause
			driver.findElement(By.id("btnPause")).click();
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			/// Teste novos filtros Like
			driver.findElement(By.id("btnFilter1")).click();
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.elementToBeClickable(By.id("dt_transaction_ini_input")));
			}
			/// Teste Periodo
			{
			driver.findElement(By.id("dt_transaction_ini_input")).click();
			driver.findElement(By.id("dt_transaction_ini_input")).sendKeys("16/07/2020 10:00");	
			}
			{
				driver.findElement(By.id("filterpanel_header")).click();
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
			driver.findElement(By.id("dt_transaction_fin_input")).click();
			driver.findElement(By.id("dt_transaction_fin_input")).sendKeys("16/07/2020 11:00");		
			}
			{
			driver.findElement(By.id("filterpanel_header")).click();
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("input_imei")).sendKeys("0");
				driver.findElement(By.id("input_simCard")).sendKeys("0");
				driver.findElement(By.id("input_nmOpe")).sendKeys("V");
				driver.findElement(By.id("input_macAdr")).sendKeys("0");
				driver.findElement(By.id("input_ipTerm")).sendKeys("0");
				driver.findElement(By.id("input_cgiMcc")).sendKeys("0");
				driver.findElement(By.id("input_cgiMnc")).sendKeys("3");
				driver.findElement(By.id("input_cgiLac")).sendKeys("4");
				driver.findElement(By.id("input_cgiCI")).sendKeys("0");
				driver.findElement(By.id("input_vrsPlat")).sendKeys("0");
				driver.findElement(By.id("input_vrsCA")).sendKeys("0");
			}
			driver.findElement(By.id("btnSearch1")).click();
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				/// Verificar se o texto esta presente na pagina
					String textoElement = driver.findElement(By.xpath("//*[@id=\"listViewBTSubProductDTO_data\"]/tr/td")).getText();
			        assertNotEquals("Nenhum registro encontrado.", textoElement);
				}
		}

}
