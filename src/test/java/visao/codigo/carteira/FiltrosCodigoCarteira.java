package visao.codigo.carteira;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import filtros.metodos.Filtros;
import filtros.metodos.ViewBTDTO;

public class FiltrosCodigoCarteira extends Filtros {


		private WebDriver driver;

		@Before
		public void Inicializar() {
			driver = new ChromeDriver();
			List<ViewBTDTO> links = getViews();
			// Login
			login(driver, links.get(10).getUrl());
			// Filtro
			waitingtoclick(driver, "btnFilter");
			click(driver, "btnFilter");
			waiting(driver, "dialogLoadbar");
			// Preencher Período
			waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
			clickx(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
			WebElement PeriodoIni = driver.findElement(By.xpath("//input[contains(@id,'dt_transaction_ini_input')]"));
			sendKeys("080920201100", PeriodoIni);
			waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
			clickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
			WebElement PeriodoFin = driver.findElement(By.xpath("//input[contains(@id,'dt_transaction_fin_component_input')]"));
			sendKeys("080920202000", PeriodoFin);
			}

		@After
		public void Encerramento() {
			// Consultar
			click(driver, "btnConsult");
			waiting(driver, "dialogLoadbar");
			// Verificar se possui dados
			waitingElementBeClickableid(driver, "listViewEntity:0:tbody_desc");
			// Verificar se ocorre erro
			erroDesc(driver, "//span[text()='Ocorreu um erro desconhecido, consulte o administrador.']");
			System.out.println("Sucess");
			driver.quit();
			}
		
		/// Objetivo: Preencher os Combos
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestCombos1() {
			// Preencher primeiros combos
			clickx(driver, "//div[contains(@class,'entity_Issuer')]");
			clickx(driver, "//div[33]/div[1]/div[1]");
			waitingtoclickx(driver, "//div[contains(@class,'entity_Product')]");
			clickx(driver, "//div[contains(@class,'entity_Product')]");
			clickx(driver, "//div[34]/div[1]/div[1]");
			waitingtoclickx(driver, "//div[contains(@class,'entity_SubProduct')]");
			clickx(driver, "//div[contains(@class,'entity_SubProduct')]");
			clickx(driver, "//div[35]/div[1]/div[1]");
			}
		
		/// Objetivo: Preencher os Combos
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
			
		@Test
		public void TestCombos2() {
			clickx(driver, "//div[contains(@class,'entity_Plot')]");
			clickx(driver, "//div[36]/div[1]/div[1]");
			waitingtoclickx(driver, "//div[contains(@class,'entity_CellphoneOperator')]");
			clickx(driver, "//div[contains(@class,'entity_CellphoneOperator')]");
			clickx(driver, "//div[37]/div[1]/div[1]");
			waitingtoclickx(driver, "//div[contains(@class,'entity_SubModality')]");
			clickx(driver, "//div[contains(@class,'entity_SubModality')]");
			clickx(driver, "//div[38]/div[1]/div[1]");
			waitingtoclickx(driver, "//div[contains(@class,'entity_BrandGroup')]");
			clickx(driver, "//div[contains(@class,'entity_BrandGroup')]");
			clickx(driver, "//div[39]/div[1]/div[1]");
			waitingtoclickx(driver, "//div[contains(@class,'entity_Brand')]");
			clickx(driver, "//div[contains(@class,'entity_Brand')]");
			clickx(driver, "//div[40]/div[1]/div[1]");
			}
		
		/// Objetivo: Preencher os Combos
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestCombos3() {
			// Preencher primeiros combos
			clickx(driver, "//div[contains(@class,'entity_SaleType')]");
			clickx(driver, "//div[41]/div[1]/div[1]");
			waitingtoclickx(driver, "//div[contains(@class,'entity_DeviceCapture')]");
			clickx(driver, "//div[contains(@class,'entity_DeviceCapture')]");
			clickx(driver, "//div[42]/div[1]/div[1]");
			waitingtoclickx(driver, "//div[contains(@class,'entity_EnterMode')]");
			clickx(driver, "//div[contains(@class,'entity_EnterMode')]");
			clickx(driver, "//div[43]/div[1]/div[1]");
			waitingtoclickx(driver, "//div[contains(@class,'entity_PrincipalBusiness')]");
			clickx(driver, "//div[contains(@class,'entity_PrincipalBusiness')]");
			clickx(driver, "//div[44]/div[1]/div[1]");
			}
		
		/// Objetivo: Preencher os Combos
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestCombos4() {
			// Preencher primeiros combos
			clickx(driver, "//div[contains(@class,'entity_IssuerType')]");
			clickx(driver, "//div[45]/div[1]/div[1]");
			waitingtoclickx(driver, "//div[contains(@class,'entity_TypeTransaction')]");
			clickx(driver, "//div[contains(@class,'entity_TypeTransaction')]");
			clickx(driver, "//div[46]/div[1]/div[1]");
			waitingtoclickx(driver, "//div[contains(@class,'entity_WebSourceTransaction')]");
			clickx(driver, "//div[contains(@class,'entity_WebSourceTransaction')]");
			clickx(driver, "//div[48]/div[1]/div[1]");
			}
		
		/// Objetivo: Preencher os Combos
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
			
		@Test
		public void TestCombos5() {
			// Preencher primeiros combos
			clickx(driver, "//div[contains(@class,'entity_CompanyCodePurchasing')]");
			clickx(driver, "//div[49]/div[1]/div[1]");
			waitingtoclickx(driver, "//div[contains(@class,'entity_ReasonCodeExternalNetwork')]");
			clickx(driver, "//div[contains(@class,'entity_ReasonCodeExternalNetwork')]");
			clickx(driver, "//div[50]/div[1]/div[1]");
			waitingtoclickx(driver, "//div[contains(@class,'entity_Switch')]");
			clickx(driver, "//div[contains(@class,'entity_Switch')]");
			clickx(driver, "//div[51]/div[1]/div[1]");
			waitingtoclickx(driver, "//div[contains(@class,'entity_Frontend')]");
			clickx(driver, "//div[contains(@class,'entity_Frontend')]");
			clickx(driver, "//div[52]/div[1]/div[1]");
			waitingtoclickx(driver, "//div[contains(@class,'entity_ServiceCode')]");
			clickx(driver, "//div[contains(@class,'entity_ServiceCode')]");
			clickx(driver, "//div[53]/div[1]/div[1]");
			}
		
		/// Objetivo: Preencher os Combos
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestCombos6() {
			// Preencher primeiros combos
			clickx(driver, "//div[contains(@class,'entity_TokenTransaction')]");
			clickx(driver, "//div[54]/div[1]/div[1]");
			waitingtoclickx(driver, "//div[contains(@class,'entity_Wallet')]");
			clickx(driver, "//div[contains(@class,'entity_Wallet')]");
			clickx(driver, "//div[55]/div[1]/div[1]");
			}
		
}