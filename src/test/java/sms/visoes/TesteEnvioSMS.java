package sms.visoes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesteEnvioSMS {
	@Test
	public void TestEnvioSMS() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://192.168.80.18:8081/mir.console/pages/view/smsMessage.jsf");
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
			wait.until(ExpectedConditions.elementToBeClickable(By.id("frmCadastroSmsMessage:txtMessage")));
		}
		driver.findElement(By.id("frmCadastroSmsMessage:txtMessage")).sendKeys("TesteAuto");
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		driver.findElement(By.id("frmSearch:nameSearch_input")).sendKeys("TesteAuto");
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		driver.findElement(By.xpath("/html/body/center/div[3]/div[1]/div[2]/div[2]/form/table[2]/tbody/tr[2]/td/div/a/label")).click();
		driver.findElement(By.xpath("//*[@id=\"frmCadastroSmsMessage:selectContacts_panel\"]/div[1]/div[2]/input")).sendKeys("Leandro Toledo");
		driver.findElement(By.xpath("//*[@id=\"frmCadastroSmsMessage:selectContacts_panel\"]/div[2]/ul/li[14]/div/div[2]")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		driver.findElement(By.id("frmCadastroSmsMessage:btnSubmit")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		driver.findElement(By.id("frmSearch:btnSearch")).click();
		/// Verificar se o texto esta presente na pagina
		String textoElement = driver.findElement(By.id("frmList:listSmsMessage:0:smsMsgMsg")).getText();
        assertEquals("TesteAuto", textoElement);
        {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
        driver.findElement(By.xpath("/html/body/center/div[3]/div[1]/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[1]/table/tbody/tr[1]/td[3]/button")).click();
        {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
        driver.findElement(By.id("frmList:confirm")).click();
        {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
      /// Verificar se o texto esta presente na pagina
      		String textoElement1 = driver.findElement(By.xpath("//*[@id=\"frmList:listSmsMessage_data\"]/tr/td")).getText();
              assertEquals("Nenhum registro encontrado.", textoElement1);
		
		
}
}
