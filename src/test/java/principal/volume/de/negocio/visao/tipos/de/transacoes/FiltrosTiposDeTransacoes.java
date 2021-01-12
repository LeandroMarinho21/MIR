package principal.volume.de.negocio.visao.tipos.de.transacoes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import metodos.mir.Filtros;

public class FiltrosTiposDeTransacoes {
	
	private WebDriver driver;
	private Filtros filtros;

	@Before
	public void Inicializar() {
		driver = new ChromeDriver();
		filtros = new Filtros(driver);
		driver.get("https://192.168.80.18:8081/mir.console/pages/view/viewtypetransaction.jsf");
		// Login
		filtros.login2();
		// Filtro
		filtros.waitingtoclick("btnFilter");
		//Verificar Errro ao entrar
		filtros.erroDesc("//span[text()='Ocorreu um erro desconhecido, consulte o administrador']");
		filtros.click("btnFilter");
		filtros.waiting("dialogLoadbar");
		// Preencher Período
		filtros.waitingtoclickx("//input[contains(@id,'dt_transaction_ini_input')]");
		filtros.clickx("//input[contains(@id,'dt_transaction_ini_input')]");
		WebElement PeriodoIni = filtros.findElement("//input[contains(@id,'dt_transaction_ini_input')]");
		filtros.sendKeys("080920201100", PeriodoIni);
		filtros.waitingtoclickx("//input[contains(@id,'dt_transaction_fin_component_input')]");
		filtros.clickx("//input[contains(@id,'dt_transaction_fin_component_input')]");
		WebElement PeriodoFin = filtros.findElement("//input[contains(@id,'dt_transaction_fin_component_input')]");
		filtros.sendKeys("080920202000", PeriodoFin);
		}

	@After
	public void Encerramento() {
		// Consultar
		filtros.click("btnConsult");
		filtros.waiting("dialogLoadbar");
		// Verificar se possui dados
		filtros.waitingElementBeClickableid("listViewTypeTransactionDTO:0:alarmDesc");
		// Verificar se ocorre erro
		filtros.erroDesc("//span[text()='Ocorreu um erro desconhecido, consulte o administrador.']");
//		ui-growl-title
//		ui-growl-image ui-growl-image-error
//		ui-growl-message
		driver.quit();
		}
	
	/// Objetivo: Preencher os Combos
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestCombos1() {
		// Preencher primeiros combos
		filtros.clickx("//div[contains(@class,'entity_Product')]");
		filtros.clickx("//div[28]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_SubProduct')]");
		filtros.clickx("//div[contains(@class,'entity_SubProduct')]");
		filtros.clickx("//div[29]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_CellphoneOperator')]");
		filtros.clickx("//div[contains(@class,'entity_CellphoneOperator')]");
		filtros.clickx("//div[30]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o Campos dos 4 campos
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestCombos2() {
		// Preencher primeiros combos
		filtros.waitingtoclickx("//div[contains(@class,'entity_SaleType')]");
		filtros.clickx("//div[contains(@class,'entity_SaleType')]");
		filtros.clickx("//div[31]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_DeviceCapture')]");
		filtros.clickx("//div[contains(@class,'entity_DeviceCapture')]");
		filtros.clickx("//div[32]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_EnterMode')]");
		filtros.clickx("//div[contains(@class,'entity_EnterMode')]");
		filtros.clickx("//div[33]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_PrincipalBusiness')]");
		filtros.clickx("//div[contains(@class,'entity_PrincipalBusiness')]");
		filtros.clickx("//div[34]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher os Combos
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestCombos3() {
		// Preencher primeiros combos
		filtros.waitingtoclickx("//div[contains(@class,'entity_IssuerType')]");
		filtros.clickx("//div[contains(@class,'entity_IssuerType')]");
		filtros.clickx("//div[35]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_Brand')]");
		filtros.clickx("//div[contains(@class,'entity_Brand')]");
		filtros.clickx("//div[36]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_TypeTransaction')]");
		filtros.clickx("//div[contains(@class,'entity_TypeTransaction')]");
		filtros.clickx("//div[37]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_WebSourceTransaction')]");
		filtros.clickx("//div[contains(@class,'entity_WebSourceTransaction')]");
		filtros.clickx("//div[39]/div[1]/div[1]");
		}
	
	
	/// Objetivo: Preencher os Combos
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
	@Test
	public void TestCombos4() {
		// Preencher primeiros combos
		filtros.waitingtoclickx("//div[contains(@class,'entity_CompanyCodePurchasing')]");
		filtros.clickx("//div[contains(@class,'entity_CompanyCodePurchasing')]");
		filtros.clickx("//div[40]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher os Combos
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
	@Test
	public void TestCombos5() {
		// Preencher primeiros combos
		filtros.waitingtoclickx("//div[contains(@class,'entity_ReasonCodeExternalNetwork')]");
		filtros.clickx("//div[contains(@class,'entity_ReasonCodeExternalNetwork')]");
		filtros.clickx("//div[41]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher os Combos
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
	@Test
	public void TestCombos6() {
		// Preencher primeiros combos

		filtros.waitingtoclickx("//div[contains(@class,'entity_Switch')]");
		filtros.clickx("//div[contains(@class,'entity_Switch')]");
		filtros.clickx("//div[42]/div[1]/div[1]");
		}
	
	
	/// Objetivo: Preencher os Combos
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
	@Test
	public void TestCombos7() {
		// Preencher primeiros combos
		filtros.waitingtoclickx("//div[contains(@class,'entity_Frontend')]");
		filtros.clickx("//div[contains(@class,'entity_Frontend')]");
		filtros.clickx("//div[43]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_ServiceCode')]");
		filtros.clickx("//div[contains(@class,'entity_ServiceCode')]");
		filtros.clickx("//div[44]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_BrandGroup')]");
		filtros.clickx("//div[contains(@class,'entity_BrandGroup')]");
		filtros.clickx("//div[45]/div[1]/div[1]");
		}

}
