package testmir;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisaoBandeiras {

	/// TestePlayPause
	@Test
	public void TestPlayPause() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://192.168.80.18:8081/mir.console/");
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
		/// Menu Visão Bandeiras
		{
			driver.findElement(By.linkText("Vis�o - Bandeiras")).click();
		}
		{
			WebElement element = driver.findElement(By.id("btnPause"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("imgLoadingDashboard")));
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("imgLoadingDashboard")));
		}
		driver.findElement(By.id("btnPause")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		driver.findElement(By.id("btnStart")).click();
		{
			driver.quit();
		}
	}

	/// TesteAlarmes
	@Test
	public void TestAlarmes() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://192.168.80.18:8081/mir.console");
		driver.manage().window().setSize(new Dimension(1920, 1080));
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
		/// Menu Visão Bandeiras
		{
			driver.findElement(By.linkText("Visão - Bandeiras")).click();
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
		/// Verificar Pop-up Threshold
		{
			WebElement element = driver.findElement(By.id("listViewBTBrandDTO:0:alarmDesc"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).contextClick().perform();
		}
		{
		driver.findElement(By.id("mnuitemThreshold")).click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		/// Verificar o texto do Pop-up Threshold
		{
			assertThat(driver.findElement(By.id("listAlarmPopup_head")).getText(), is("Descrição"));
		}
		{
			driver.findElement(By.xpath("/html/body/center/div[3]/form[1]/div[4]/div[1]/a")).click();
		}
		{
			driver.findElement(By.id("listViewBTBrandDTO:0:alarmDesc")).click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		driver.findElement(By.id("listAlarmesDTO1:0:buttonDetailAlarmEvent")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		{
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(0));
			driver.switchTo().window(tabs2.get(1));
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("frmList:dt_transactionIni_input")));
		}
		/// Verificar o texto presente no Pop-up Distribuição das Transações por Evento
		{
			assertThat(driver.findElement(By.id("frmList:listViewBTAlarm:j_idt14")).getText(), is("Alarmes"));
			assertThat(driver.findElement(By.id("frmList:listViewBTAlarm:j_idt15")).getText(), is("Descrição"));
			assertThat(driver.findElement(By.id("frmList:listViewBTAlarm:j_idt16")).getText(),
					is("Total de Transações"));
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("frmList:dt_transactionIni_input")));
		}
		/// Teste Campo Período
		{
			driver.findElement(By.id("frmList:dt_transactionIni_input")).click();
			driver.findElement(By.id("frmList:dt_transactionIni_input")).clear();
			driver.findElement(By.id("frmList:dt_transactionIni_input")).sendKeys("18/12/2019 8:00");
		}
		{
			driver.findElement(By.id("frmList:dt_transactionFin_input")).click();
			driver.findElement(By.id("frmList:dt_transactionFin_input")).clear();
			driver.findElement(By.id("frmList:dt_transactionFin_input")).sendKeys("18/12/2019 8:05");
		}
		driver.findElement(By.id("frmList:btnApply")).click();
		{
			WebDriverWait wait1 = new WebDriverWait(driver, 30);
			wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("frmList:btnChartsToVolume")));
		}
		{
			WebDriverWait wait1 = new WebDriverWait(driver, 30);
			wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		/// Teste Botão Volume
		{
			driver.findElement(By.id("frmList:btnChartsToVolume")).click();
		}
		{
			WebDriverWait wait1 = new WebDriverWait(driver, 30);
			wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		driver.close();
		{
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(0));
		}
		/// Teste Detalhe por Estabelecimento
		{
			driver.findElement(By.id("listAlarmesDTO1:0:buttonDetailAlarm")).click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		{
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			driver.manage().window().setSize(new Dimension(1920, 1080));
		}
		/// Teste Campo Período
		{
			driver.findElement(By.id("frmList:dt_transactionIni_input")).click();
			driver.findElement(By.id("frmList:dt_transactionIni_input")).clear();
			driver.findElement(By.id("frmList:dt_transactionIni_input")).sendKeys("18/12/2019 8:00");
		}
		{
			driver.findElement(By.id("frmList:dt_transactionFin_input")).click();
			driver.findElement(By.id("frmList:dt_transactionFin_input")).clear();
			driver.findElement(By.id("frmList:dt_transactionFin_input")).sendKeys("18/12/2019 8:05");
		}
		driver.findElement(By.id("frmList:btnApply")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		/// Teste Lista
		{
			driver.findElement(By.id("frmList:listViewBT_rppDD")).click();
		}
		{
			driver.findElement(
					By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div[2]/select/option[2]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			driver.findElement(
					By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div[2]/select/option[3]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			driver.findElement(
					By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div[2]/select/option[4]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			driver.findElement(
					By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div[2]/select/option[5]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			driver.findElement(
					By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div[2]/select/option[6]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			driver.findElement(
					By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div[2]/select/option[7]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		/// Teste Páginação
		{
			driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div[2]/span[4]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div[2]/span[5]"))
				.click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div[2]/span[2]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div[2]/span[1]"))
					.click();
		}
		{
			driver.close();
		}
		{
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(0));
		}
		/// Teste Pop-up (+ Detalhes)
		{
			driver.findElement(By.id("btnShowDlgDetailEst")).click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		{
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			driver.manage().window().setSize(new Dimension(1920, 1080));
		}
		/// Teste Período
		{
			driver.findElement(By.id("frmList:dt_transactionIni_input")).click();
			driver.findElement(By.id("frmList:dt_transactionIni_input")).sendKeys("18/12/2019 08:00");
		}
		{
			driver.findElement(By.id("frmList:dt_transactionFin_input")).click();
			driver.findElement(By.id("frmList:dt_transactionFin_input")).sendKeys("18/12/2019 08:05");
		}
		{
			driver.findElement(By.id("frmList:btnApply")).click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		/// Teste Lista
		{
			driver.findElement(By.id("frmList:listAlarmFreq_rppDD")).click();
		}
		{
			driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/select/option[2]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/select/option[3]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/select/option[4]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/select/option[5]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/select/option[6]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		/// Teste Botão Exportação
		{
			driver.findElement(By.id("frmList:btnXLS")).click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		/// Teste Botão Hostname
		{
			driver.findElement(By.id("frmList:btnHostname")).click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(2));
			driver.manage().window().setSize(new Dimension(1920, 1080));
		}
		/// Verificar Texto no pop-up Hostname
		{
			assertThat(driver
					.findElement(
							By.xpath("/html/body/form/div[2]/table/tbody/tr/td/div/div/table/thead/tr[1]/th[3]/span"))
					.getText(), is("Transações no período selecionado"));
		}
		driver.close();
		{
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
		}
		/// Teste botão FrontEnd
		{
			driver.findElement(By.id("frmList:btnFrontend")).click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(2));
		}
		/// Verificar Texto no pop-up FrontEnd
		{
			assertThat(driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr/td/table/thead/tr[1]/th[4]"))
					.getText(), is("Transações no período selecionado"));
		}
		{
			driver.close();
		}
		{
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
		}
		{
			driver.close();
		}
		{
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(0));
		}
		{
			driver.close();
		}
		}
		
		/// TesteAlarmes
		@Test
		public void TestGraficos() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://192.168.80.18:8081/mir.console");
			driver.manage().window().setSize(new Dimension(1920, 1080));
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
			/// Menu Visão Bandeiras
			{
				driver.findElement(By.linkText("Visão - Bandeiras")).click();
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
			/// Teste Insetir 5 Datas
			{
				driver.findElement(By.id("txtDateGrap_input")).click();
				driver.findElement(By.id("txtDateGrap_input")).sendKeys("29/12/2019");
			}
			{
				driver.findElement(By.id("addDate")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("txtDateGrap_input")).click();
				driver.findElement(By.id("txtDateGrap_input")).sendKeys("28/12/2019");
			}
			{
				driver.findElement(By.id("addDate")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("txtDateGrap_input")).click();
				driver.findElement(By.id("txtDateGrap_input")).sendKeys("20/12/2019");
			}
			{
				driver.findElement(By.id("addDate")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("txtDateGrap_input")).click();
				driver.findElement(By.id("txtDateGrap_input")).sendKeys("10/12/2019");
			}
			{
				driver.findElement(By.id("addDate")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("txtDateGrap_input")).click();
				driver.findElement(By.id("txtDateGrap_input")).sendKeys("15/12/2019");
			}
			{
				driver.findElement(By.id("addDate")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			/// Verificar se está exibindo a mensagem
			{
				driver.findElement(By.xpath("html/body/div[10]/div/div/div[2]/span"));
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("cleanDate")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("interval_label")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[12]/div/ul/li[2]")));
			}
			{
				driver.findElement(By.xpath("/html/body/div[12]/div/ul/li[2]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("interval_label")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[12]/div/ul/li[3]")));
			}
			{
				driver.findElement(By.xpath("/html/body/div[12]/div/ul/li[3]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("interval_label")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"interval_panel\"]/div/ul/li[4]")));
			}
			{
				driver.findElement(By.xpath("//*[@id=\"interval_panel\"]/div/ul/li[4]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("interval_label")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"interval_panel\"]/div/ul/li[5]")));
			}
			{
				driver.findElement(By.xpath("//*[@id=\"interval_panel\"]/div/ul/li[5]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("period")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"period_panel\"]/div/ul/li[2]")));
			}
			{
				driver.findElement(By.xpath("//*[@id=\"period_panel\"]/div/ul/li[2]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("period")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"period_panel\"]/div/ul/li[3]")));
			}
			{
				driver.findElement(By.xpath("//*[@id=\"period_panel\"]/div/ul/li[3]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("period")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"period_panel\"]/div/ul/li[4]")));
			}
			{
				driver.findElement(By.xpath("//*[@id=\"period_panel\"]/div/ul/li[4]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("period")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"period_panel\"]/div/ul/li[5]")));
			}
			{
				driver.findElement(By.xpath("//*[@id=\"period_panel\"]/div/ul/li[5]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("btnShowDlgGeneric")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs2.get(0));
				driver.switchTo().window(tabs2.get(1));
				driver.manage().window().setSize(new Dimension(1920, 1080));
			}
			{
				driver.findElement(By.id("interval")).click();
			}
			{
				driver.findElement(By.xpath("/html/body/div[4]/div/ul/li[1]")).click();
			}
			{
				driver.findElement(By.id("period")).click();
			}
			{
				driver.findElement(By.xpath("/html/body/div[5]/div/ul/li[1]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("txtDateGrap_input")).click();
				driver.findElement(By.id("txtDateGrap_input")).sendKeys("29/12/2019");
			}
			{
				driver.findElement(By.id("addDate")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("txtDateGrap_input")).click();
				driver.findElement(By.id("txtDateGrap_input")).sendKeys("28/12/2019");
			}
			{
				driver.findElement(By.id("addDate")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("txtDateGrap_input")).click();
				driver.findElement(By.id("txtDateGrap_input")).sendKeys("20/12/2019");
			}
			{
				driver.findElement(By.id("addDate")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("txtDateGrap_input")).click();
				driver.findElement(By.id("txtDateGrap_input")).sendKeys("10/12/2019");
			}
			{
				driver.findElement(By.id("addDate")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("txtDateGrap_input")).click();
				driver.findElement(By.id("txtDateGrap_input")).sendKeys("15/12/2019");
			}
			{
				driver.findElement(By.id("addDate")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			/// Verificar se está exibindo a mensagem
			{
				driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/span"));
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("cleanDate")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("interval")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"interval_panel\"]/div/ul/li[2]")));
			}
			{
				driver.findElement(By.xpath("//*[@id=\"interval_panel\"]/div/ul/li[2]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("interval")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/ul/li[3]")));
			}
			{
				driver.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("interval")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/ul/li[4]")));
			}
			{
				driver.findElement(By.xpath("/html/body/div[4]/div/ul/li[4]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("interval")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/ul/li[5]")));
			}
			{
				driver.findElement(By.xpath("/html/body/div[4]/div/ul/li[5]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("period")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/ul/li[2]")));
			}
			{
				driver.findElement(By.xpath("/html/body/div[5]/div/ul/li[2]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("period")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/ul/li[3]")));
			}
			{
				driver.findElement(By.xpath("/html/body/div[5]/div/ul/li[3]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("period")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/ul/li[4]")));
			}
			{
				driver.findElement(By.xpath("/html/body/div[5]/div/ul/li[4]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("period")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/ul/li[5]")));
			}
			{
				driver.findElement(By.xpath("/html/body/div[5]/div/ul/li[5]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("interval")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"interval_panel\"]/div/ul/li[2]")));
			}
			{
				driver.findElement(By.xpath("//*[@id=\"interval_panel\"]/div/ul/li[2]")).click();
			}
			{
				driver.findElement(By.id("period")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/ul/li[2]")));
			}
			{
				driver.findElement(By.xpath("/html/body/div[5]/div/ul/li[2]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("btnChartBar")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("btnChanceGrap")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("btnChartBar")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("btnChanceGrap")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("j_idt49")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("btnPdf")).click();
			}
			{
				driver.findElement(By.id("btnCvs")).click();
			}
			{
				driver.findElement(By.id("btnXls")).click();
			}
			{
				driver.quit();
			}	
}
		/// TesteAlarmes
				@Test
				public void TestNavegacao() {
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://192.168.80.18:8081/mir.console");
				driver.manage().window().setSize(new Dimension(1920, 1080));
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
				/// Menu Visão Bandeiras
			{
				driver.findElement(By.linkText("Visão - Bandeiras")).click();
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
			/// Verificar Redes
			{
				WebElement element = driver.findElement(By.xpath("//*[@id=\"listViewBTBrandDTO_data\"]/tr[1]"));
				Actions builder = new Actions(driver);
				builder.moveToElement(element).contextClick().perform();
			}
			{
			driver.findElement(By.id("mnuitemRedirectNet")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			/// Verificar Texto no título da página
			{
				assertThat(driver.findElement(By.xpath("//*[@id=\"mainpanel_header\"]/span")).getText(), is("Visão - Redes >> Origem: Visão - Bandeiras"));
			}
			{
				WebElement element = driver.findElement(By.cssSelector(".ui-mnu-bt"));
				Actions builder = new Actions(driver);
				builder.moveToElement(element).perform();
			}
				/// Menu Visão Bandeiras
			{
				driver.findElement(By.linkText("Visão - Bandeiras")).click();
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
			/// Verificar Emissores
			{
				WebElement element = driver.findElement(By.xpath("//*[@id=\"listViewBTBrandDTO_data\"]/tr[1]"));
				Actions builder = new Actions(driver);
				builder.moveToElement(element).contextClick().perform();
			}
			{
			driver.findElement(By.id("mnuitemRedirectIssuer")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			/// Verificar Texto no título da página
			{
				assertThat(driver.findElement(By.xpath("//*[@id=\"mainpanel_header\"]/span")).getText(), is("Visão - Emissor >> Origem: Visão - Bandeiras"));
			}
			{
				WebElement element = driver.findElement(By.cssSelector(".ui-mnu-bt"));
				Actions builder = new Actions(driver);
				builder.moveToElement(element).perform();
			}
				/// Menu Visão Bandeiras
			{
				driver.findElement(By.linkText("Visão - Bandeiras")).click();
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
			{
				driver.findElement(By.id("btnShowDlgDetail")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs2.get(0));
				driver.switchTo().window(tabs2.get(1));
				driver.manage().window().setSize(new Dimension(1920, 1080));
			}
			{
				driver.findElement(By.id("frmList:btnPause")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
			}
			{
				driver.findElement(By.id("frmList:dt_transactionIni_input")).click();
				driver.findElement(By.id("frmList:dt_transactionIni_input")).sendKeys("26/05/2019 23:00");
			}
			{
				driver.findElement(By.id("frmList:dt_transactionFin_input")).click();
				driver.findElement(By.id("frmList:dt_transactionFin_input")).sendKeys("26/05/2019 23:59");
			}
			{
				driver.findElement(By.id("frmList:btnApply")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
			}
			{
				driver.findElement(By.id("frmList:percentual")).click();
				driver.findElement(By.id("frmList:percentual")).clear();
				driver.findElement(By.id("frmList:percentual")).sendKeys("2");
			}
			{
				driver.findElement(By.id("frmList:coluna_label")).click();
				driver.findElement(By.xpath("//*[@id=\"frmList:coluna_panel\"]/div/ul/li[2]")).click();
			}
			{
				driver.findElement(By.id("frmList:btnImpacto")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
			}
			{
				driver.findElement(By.id("frmList:coluna_label")).click();
				driver.findElement(By.xpath("//*[@id=\"frmList:coluna_panel\"]/div/ul/li[3]")).click();
			}
			{
				driver.findElement(By.id("frmList:btnImpacto")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
			}
			{
				driver.findElement(By.id("frmList:btnCalc15")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
			}
			{
				assertThat(driver.findElement(By.xpath("//*[@id=\"frmList:modalRegra15Min\"]/div[1]")).getText(), is("Resumo dos 15 Minutos"));
			}
			{
				driver.findElement(By.xpath("//*[@id=\"frmList:modalRegra15Min\"]/div[1]/a/span")).click();
			}
			{
				driver.findElement(By.id("j_idt45:btnCsvExtract")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
			}
			{
				driver.findElement(By.id("j_idt45:btnCsv")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
			}
			{
				driver.close();
			}
			{
				ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs2.get(0));
			}
			{
				driver.findElement(By.id("j_idt59:j_idt59")).click();
			}
			{
				driver.findElement(By.xpath("//*[@id=\"helpContent\"]")).getText();

			}
			{
			driver.quit();
			}	
}
}
