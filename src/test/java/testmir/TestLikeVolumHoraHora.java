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

public class TestLikeVolumHoraHora {
	/// TesteFiltros
	@Test
	public void TestFiltrosLike() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://192.168.80.18:8081/mir.console");
		driver.get("https://10.59.184.60/mir.console/index.jsf");
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
			driver.findElement(By.linkText("Visão - Volume hora/hora")).click();
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
		driver.findElement(By.id("btnSearch1")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("dataIni_input")));
		}
		/// Teste Periodo
		{
		driver.findElement(By.id("dataIni_input")).click();
		driver.findElement(By.id("dataIni_input")).sendKeys("16/07/2020");	
		}
		{
			driver.findElement(By.id("filterpanel_header")).click();
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		{
		//driver.findElement(By.id("input_imei")).sendKeys("2908029490");
		//driver.findElement(By.id("input_simCard")).sendKeys("2662641590168");
		//driver.findElement(By.id("input_nmOpe")).sendKeys("VI");
		//driver.findElement(By.id("input_macAdr")).sendKeys("F9F5D7C96");
		//driver.findElement(By.id("input_ipTerm")).sendKeys("0FE6000000000000AF1623501330");
		//driver.findElement(By.id("input_cgiMcc")).sendKeys("43");
		//driver.findElement(By.id("input_cgiMnc")).sendKeys("4");
		//driver.findElement(By.id("input_cgiLac")).sendKeys("953");
		//driver.findElement(By.id("input_cgiCI")).sendKeys("0268");
		//driver.findElement(By.id("input_vrsPlat")).sendKeys("317");
		//driver.findElement(By.id("input_vrsCA")).sendKeys("7203");
			driver.findElement(By.id("input_imei")).sendKeys("0");
			driver.findElement(By.id("input_simCard")).sendKeys("0");
			driver.findElement(By.id("input_nmOpe")).sendKeys("VI");
			driver.findElement(By.id("input_macAdr")).sendKeys("0");
			driver.findElement(By.id("input_ipTerm")).sendKeys("0");
			driver.findElement(By.id("input_cgiMcc")).sendKeys("4");
			driver.findElement(By.id("input_cgiMnc")).sendKeys("1");
			driver.findElement(By.id("input_cgiLac")).sendKeys("5");
			driver.findElement(By.id("input_cgiCI")).sendKeys("9");
			driver.findElement(By.id("input_vrsPlat")).sendKeys("9");
			driver.findElement(By.id("input_vrsCA")).sendKeys("0");
		}
		driver.findElement(By.id("btnSearch2")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		{
			/// Verificar se o texto esta presente na pagina
				String textoElement = driver.findElement(By.xpath("//*[@id=\"tblTransactionsDay_data\"]/tr/td")).getText();
		        assertNotEquals("Nenhum registro encontrado.", textoElement);
			}
	}

}
