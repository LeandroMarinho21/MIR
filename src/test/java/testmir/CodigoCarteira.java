package testmir;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CodigoCarteira {
	WebDriver driver;
	public void abreNavegador() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://192.168.80.18:8081/mir.console/pages/view/wallet.jsf");
	}
	
	public void fechaNavegador() {
		driver.quit();
	}

	
		@Test
		public void TestBuscaCodigo() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://192.168.80.18:8081/mir.console/pages/view/wallet.jsf");
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
				wait.until(ExpectedConditions.elementToBeClickable(By.id("searchForm:inputEntityCode_input")));
			}
			/// Busca Codigo Carteira
			{
			driver.findElement(By.id("searchForm:inputEntityCode_input")).click();
			}
			driver.findElement(By.id("searchForm:inputEntityCode_input")).sendKeys("00000");
			{
			driver.findElement(By.xpath("//*[@id=\"searchForm:btnSearch\"]/span[1]")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				assertThat(driver.findElement(By.xpath("//*[@id=\"frmList:dataTableWallet_data\"]/tr/td[2]"))
						.getText(), is("00000"));
			}
			driver.quit();
}
		
			@Test
			public void TestBuscaNome() {
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://192.168.80.18:8081/mir.console/pages/view/wallet.jsf");
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
					wait.until(ExpectedConditions.elementToBeClickable(By.id("searchForm:inputEntityCode_input")));
				}
				/// Busca Nome Codigo Carteira
				{
				driver.findElement(By.id("searchForm:inputEntityDescription_input")).click();
				}
				{
				driver.findElement(By.id("searchForm:inputEntityDescription_input")).sendKeys("Alelo");
				}
				{
					driver.findElement(By.xpath("//*[@id=\"searchForm:btnSearch\"]/span[1]")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
					assertThat(driver.findElement(By.xpath("//*[@id=\"frmList:dataTableWallet_data\"]/tr/td[3]"))
							.getText(), is("ALELO"));
				}
				driver.quit();
}


             @Test
             public void TestSalvar () {
            	 WebDriver driver = new ChromeDriver();
            	driver.manage().window().maximize();
            	driver.get("https://192.168.80.18:8081/mir.console/pages/view/wallet.jsf");
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
					wait.until(ExpectedConditions.elementToBeClickable(By.id("searchForm:inputEntityCode_input")));
				}
				//TestSalvarExcluir
				{
				driver.findElement(By.id("frmCadastro:inputEntityCode")).click();
				}
				{
				driver.findElement(By.id("frmCadastro:inputEntityCode")).sendKeys("01234");
				}
				{
				driver.findElement(By.id("frmCadastro:inputEntityDescription")).click();
				}
				{
				driver.findElement(By.id("frmCadastro:inputEntityDescription")).sendKeys("TesteAutomacao");
				}	
				{
				driver.findElement(By.id("frmCadastro:btnSave")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.elementToBeClickable(By.id("growl_container")));
				}
				{
					assertThat(driver.findElement(By.id("growl_container"))
							.getText(), is("Código Carteira cadastrado com sucesso"));
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.id("searchForm:inputEntityDescription_input")).click();
				}
				{
				driver.findElement(By.id("searchForm:inputEntityDescription_input")).sendKeys("TesteAutomacao");
				}
				{
				driver.findElement(By.xpath("//*[@id=\"searchForm:btnSearch\"]/span[1]")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.id("frmList:dataTableWallet_data")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.id("frmList:dataTableWallet:0:deleteButton")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.xpath("//*[@id=\"frmList:confirm\"]")).click();
				}
				driver.quit();
		}
             
             @Test
             public void TestExcluir () {
            	WebDriver driver = new ChromeDriver();
            	driver.manage().window().maximize();
            	driver.get("https://192.168.80.18:8081/mir.console/pages/view/wallet.jsf");
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
					wait.until(ExpectedConditions.elementToBeClickable(By.id("searchForm:inputEntityCode_input")));
				}
				//TestSalvarExcluir
				{
				driver.findElement(By.id("frmCadastro:inputEntityCode")).click();
				}
				{
				driver.findElement(By.id("frmCadastro:inputEntityCode")).sendKeys("01234");
				}
				{
				driver.findElement(By.id("frmCadastro:inputEntityDescription")).click();
				}
				{
				driver.findElement(By.id("frmCadastro:inputEntityDescription")).sendKeys("TesteAutomacao");
				}	
				{
				driver.findElement(By.id("frmCadastro:btnSave")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.id("searchForm:inputEntityDescription_input")).click();
				}
				{
				driver.findElement(By.id("searchForm:inputEntityDescription_input")).sendKeys("TesteAutomacao");
				}
				{
				driver.findElement(By.xpath("//*[@id=\"searchForm:btnSearch\"]/span[1]")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.id("frmList:dataTableWallet_data")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.id("frmList:dataTableWallet:0:deleteButton")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.xpath("//*[@id=\"frmList:confirm\"]")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.elementToBeClickable(By.id("growl_container")));
				}
				{
					assertThat(driver.findElement(By.id("growl_container"))
							.getText(), is("Código Carteira excluído com sucesso"));
				}
				driver.quit();
             }
             
             @Test
             public void TestDeletar () {
            	WebDriver driver = new ChromeDriver();
            	driver.manage().window().maximize();
            	driver.get("https://192.168.80.18:8081/mir.console/pages/view/wallet.jsf");
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
					wait.until(ExpectedConditions.elementToBeClickable(By.id("searchForm:inputEntityCode_input")));
				}
				//TestDeletar
				{
				driver.findElement(By.id("frmCadastro:inputEntityCode")).click();
				}
				{
				driver.findElement(By.id("frmCadastro:inputEntityCode")).sendKeys("01234");
				}
				{
				driver.findElement(By.id("frmCadastro:inputEntityDescription")).click();
				}
				{
				driver.findElement(By.id("frmCadastro:inputEntityDescription")).sendKeys("TesteAutomacao");
				}	
				{
				driver.findElement(By.id("frmCadastro:btnSave")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.id("searchForm:inputEntityDescription_input")).click();
				}
				{
				driver.findElement(By.id("searchForm:inputEntityDescription_input")).sendKeys("TesteAutomacao");
				}
				{
				driver.findElement(By.xpath("//*[@id=\"searchForm:btnSearch\"]/span[1]")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.id("frmList:dataTableWallet_data")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.id("frmCadastro:btnDelete")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.id("frmCadastro:confirm")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.elementToBeClickable(By.id("growl_container")));
				}
				{
					assertThat(driver.findElement(By.id("growl_container"))
							.getText(), is("Código Carteira excluído com sucesso"));
				}
				driver.quit();
		}
            
             
             
             @Test
             public void TestDeletarNao () {
            	WebDriver driver = new ChromeDriver();
            	driver.manage().window().maximize();
            	driver.get("https://192.168.80.18:8081/mir.console/pages/view/wallet.jsf");
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
					wait.until(ExpectedConditions.elementToBeClickable(By.id("searchForm:inputEntityCode_input")));
				}
				//TestSalvarDeletarnao
				{
				driver.findElement(By.id("frmCadastro:inputEntityCode")).click();
				}
				{
				driver.findElement(By.id("frmCadastro:inputEntityCode")).sendKeys("012");
				}
				{
				driver.findElement(By.id("frmCadastro:inputEntityDescription")).click();
				}
				{
				driver.findElement(By.id("frmCadastro:inputEntityDescription")).sendKeys("Avada");
				}	
				{
				driver.findElement(By.id("frmCadastro:btnSave")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.id("searchForm:inputEntityDescription_input")).click();
				}
				{
				driver.findElement(By.id("searchForm:inputEntityDescription_input")).sendKeys("Avada");
				}
				{
				driver.findElement(By.xpath("//*[@id=\"searchForm:btnSearch\"]/span[1]")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.id("frmList:dataTableWallet_data")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.id("frmCadastro:btnDelete")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.xpath("//*[@id=\"frmCadastro:decline\"]")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
					assertThat(driver.findElement(By.xpath("//*[@id=\"frmList:dataTableWallet_data\"]/tr/td[3]"))
							.getText(), is("Avada"));
				}
				driver.quit();
             }
             
             @Test
             public void TestAtualizar () {
            	WebDriver driver = new ChromeDriver();
             	driver.manage().window().maximize();
             	driver.get("https://192.168.80.18:8081/mir.console/pages/view/wallet.jsf");
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
					wait.until(ExpectedConditions.elementToBeClickable(By.id("searchForm:inputEntityCode_input")));
				}
				//TestSalvarAlterarExcluir
				{
				driver.findElement(By.id("frmCadastro:inputEntityCode")).click();
				}
				{
				driver.findElement(By.id("frmCadastro:inputEntityCode")).sendKeys("01234");
				}
				{
				driver.findElement(By.id("frmCadastro:inputEntityDescription")).click();
				}
				{
				driver.findElement(By.id("frmCadastro:inputEntityDescription")).sendKeys("TesteAutomacao");
				}	
				{
				driver.findElement(By.id("frmCadastro:btnSave")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.id("searchForm:inputEntityDescription_input")).click();
				}
				{
				driver.findElement(By.id("searchForm:inputEntityDescription_input")).sendKeys("TesteAutomacao");
				}
				{
				driver.findElement(By.xpath("//*[@id=\"searchForm:btnSearch\"]/span[1]")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.id("frmList:dataTableWallet_data")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.id("frmCadastro:inputEntityCode")).clear();
				}
				{
				driver.findElement(By.id("frmCadastro:inputEntityCode")).sendKeys("54321");
				}
				{
				driver.findElement(By.id("frmCadastro:inputEntityDescription")).clear();
				}
				{
				driver.findElement(By.id("frmCadastro:inputEntityDescription")).sendKeys("TestAuto");
				}
				{
				driver.findElement(By.id("frmCadastro:btnUpdate")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.elementToBeClickable(By.id("growl_container")));
				}
				{
					assertThat(driver.findElement(By.id("growl_container"))
							.getText(), is("Código Carteira alterado com sucesso"));
				}
				{
				driver.findElement(By.id("searchForm:inputEntityDescription_input")).click();
				}
				{
				driver.findElement(By.id("searchForm:inputEntityDescription_input")).sendKeys("TestAuto");
				}
				{
				driver.findElement(By.xpath("//*[@id=\"searchForm:btnSearch\"]/span[1]")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.id("frmList:dataTableWallet_data")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.id("frmList:dataTableWallet:0:deleteButton")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.xpath("//*[@id=\"frmList:confirm\"]")).click();
				}
				driver.quit();
             }
             @Test
             public void TestListaDeContagem () {
            	WebDriver driver = new ChromeDriver();
             	driver.manage().window().maximize();
             	driver.get("https://192.168.80.18:8081/mir.console/pages/view/wallet.jsf");
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
					wait.until(ExpectedConditions.elementToBeClickable(By.id("searchForm:inputEntityCode_input")));
				}
				//TestListaDeContagem
				driver.findElement(By.id("frmList:dataTableWallet_rppDD")).click();
				driver.findElement(By.xpath("/html/body/center/div[3]/div[1]/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[2]/select/option[2]")).click();
				driver.findElement(By.xpath("/html/body/center/div[3]/div[1]/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[2]/select/option[3]")).click();
				driver.findElement(By.xpath("/html/body/center/div[3]/div[1]/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[2]/select/option[4]")).click();
				driver.findElement(By.xpath("/html/body/center/div[3]/div[1]/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[2]/select/option[5]")).click();
				driver.quit();
             }
             @Test
             public void TestOrdenacao () {
            	WebDriver driver = new ChromeDriver();
             	driver.manage().window().maximize();
             	driver.get("https://192.168.80.18:8081/mir.console/pages/view/wallet.jsf");
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
					wait.until(ExpectedConditions.elementToBeClickable(By.id("searchForm:inputEntityCode_input")));
				}
				//TestOrdenacao
				driver.findElement(By.id("frmList:dataTableWallet:j_idt41")).click();
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
					assertThat(driver.findElement(By.xpath("//*[@id=\"frmList:dataTableWallet_data\"]/tr[1]/td[2]"))
							.getText(), is("00000"));
				}
				driver.findElement(By.id("frmList:dataTableWallet:j_idt41")).click();
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
					assertThat(driver.findElement(By.xpath("//*[@id=\"frmList:dataTableWallet_data\"]/tr[1]/td[2]"))
							.getText(), is("12345"));
				}
				driver.findElement(By.id("frmList:dataTableWallet:j_idt43")).click();
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
					assertThat(driver.findElement(By.xpath("//*[@id=\"frmList:dataTableWallet_data\"]/tr[1]/td[3]"))
							.getText(), is("ALELO"));
				}
				driver.findElement(By.id("frmList:dataTableWallet:j_idt43")).click();
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
					assertThat(driver.findElement(By.xpath("//*[@id=\"frmList:dataTableWallet_data\"]/tr[1]/td[3]"))
							.getText(), is("TesteAutomaca"));
				}
				driver.quit();
             }
             @Test
             public void TestPaginacao () {
            	WebDriver driver = new ChromeDriver();
             	driver.manage().window().maximize();
             	driver.get("https://192.168.80.18:8081/mir.console/pages/view/wallet.jsf");
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
					wait.until(ExpectedConditions.elementToBeClickable(By.id("searchForm:inputEntityCode_input")));
				}
				//TestPaginacao
				driver.findElement(By.xpath("//*[@id=\"frmList:dataTableWallet_paginator_bottom\"]/span[4]")).click();
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				driver.findElement(By.xpath("//*[@id=\"frmList:dataTableWallet_paginator_bottom\"]/span[2]")).click();
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				driver.findElement(By.xpath("//*[@id=\"frmList:dataTableWallet_paginator_bottom\"]/span[5]")).click();
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				driver.findElement(By.xpath("//*[@id=\"frmList:dataTableWallet_paginator_bottom\"]/span[1]")).click();
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				driver.quit();
					}
             
             @Test
             public void TestExcluirNao () {
            	WebDriver driver = new ChromeDriver();
             	driver.manage().window().maximize();
             	driver.get("https://192.168.80.18:8081/mir.console/pages/view/wallet.jsf");
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
					wait.until(ExpectedConditions.elementToBeClickable(By.id("searchForm:inputEntityCode_input")));
				}
				//TestSalvarExcluirNao
				{
				driver.findElement(By.id("frmCadastro:inputEntityCode")).click();
				}
				{
				driver.findElement(By.id("frmCadastro:inputEntityCode")).sendKeys("0123");
				}
				{
				driver.findElement(By.id("frmCadastro:inputEntityDescription")).click();
				}
				{
				driver.findElement(By.id("frmCadastro:inputEntityDescription")).sendKeys("TesteAutomaca");
				}	
				{
				driver.findElement(By.id("frmCadastro:btnSave")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.id("searchForm:inputEntityDescription_input")).click();
				}
				{
				driver.findElement(By.id("searchForm:inputEntityDescription_input")).sendKeys("TesteAutomaca");
				}
				{
				driver.findElement(By.xpath("//*[@id=\"searchForm:btnSearch\"]/span[1]")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.id("frmList:dataTableWallet_data")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.id("frmList:dataTableWallet:0:deleteButton")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
				driver.findElement(By.xpath("//*[@id=\"frmList:decline\"]")).click();
				}
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
				}
				{
					assertThat(driver.findElement(By.xpath("//*[@id=\"frmList:dataTableWallet_data\"]/tr/td[3]"))
							.getText(), is("TesteAutomaca"));
				}
				driver.quit();
             }

}
