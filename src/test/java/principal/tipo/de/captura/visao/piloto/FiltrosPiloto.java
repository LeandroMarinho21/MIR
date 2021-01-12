package principal.tipo.de.captura.visao.piloto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import metodos.mir.Filtros;

public class FiltrosPiloto {

	private WebDriver driver;
	private Filtros filtros;

	@Before
	public void Inicializar() {
		driver = new ChromeDriver();
		filtros = new Filtros(driver);
		driver.get("https://192.168.80.18:8081/mir.console/pages/view/viewpiloto.jsf");
		// Login
		filtros.login2();
		// Filtro
		filtros.waitingtoclick("btnFilter");
		//Verificar Errro ao entrar
		filtros.erroDesc("//span[text()='Ocorreu um erro desconhecido, consulte o administrador']");
		filtros.click("btnFilter");
		filtros.waiting("dialogLoadbar");
		// Preencher Período
		filtros.waitingtoclickx("//input[contains(@id,'dt_transaction_component_input')]");
		filtros.clickx("//input[contains(@id,'dt_transaction_component_input')]");
		WebElement PeriodoIni = filtros.findElement("//input[contains(@id,'dt_transaction_component_input')]");
		filtros.sendKeys("08092020", PeriodoIni);
		}

	@After
	public void Encerramento() {
		// Consultar
		filtros.click("btnConsult");
		filtros.waiting("dialogLoadbar");
		// Verificar se possui dados
		filtros.waitingElementBeClickableid("listViewBTPilotoDTO:0:viewPiloto");
		// Verificar se ocorre erro
		filtros.erroDesc("//span[text()='Ocorreu um erro desconhecido, consulte o administrador.']");
		System.out.println("Sucess");
		driver.quit();
		}
	
	/// Objetivo: Preencher os Combos
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestCombos1() {
		// Preencher primeiros combos
		filtros.clickx("//div[contains(@class,'entity_Issuer')]");
		filtros.clickx("//div[22]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_Product')]");
		filtros.clickx("//div[contains(@class,'entity_Product')]");
		filtros.clickx("//div[23]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o Campos dos 4 campos
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestCombos2() {
		// Preencher primeiros combos
		filtros.waitingtoclickx("//div[contains(@class,'entity_SaleType')]");
		filtros.clickx("//div[contains(@class,'entity_SaleType')]");
		filtros.clickx("//div[25]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_DeviceCapture')]");
		filtros.clickx("//div[contains(@class,'entity_DeviceCapture')]");
		filtros.clickx("//div[26]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_EnterMode')]");
		filtros.clickx("//div[contains(@class,'entity_EnterMode')]");
		filtros.clickx("//div[27]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_PrincipalBusiness')]");
		filtros.clickx("//div[contains(@class,'entity_PrincipalBusiness')]");
		filtros.clickx("//div[28]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher os Combos
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestCombos3() {
		// Preencher primeiros combos
		filtros.waitingtoclickx("//div[contains(@class,'entity_IssuerType')]");
		filtros.clickx("//div[contains(@class,'entity_IssuerType')]");
		filtros.clickx("//div[29]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_Brand')]");
		filtros.clickx("//div[contains(@class,'entity_Brand')]");
		filtros.clickx("//div[30]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_BrandGroup')]");
		filtros.clickx("//div[contains(@class,'entity_BrandGroup')]");
		filtros.clickx("//div[31]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_TypeTransaction')]");
		filtros.clickx("//div[contains(@class,'entity_TypeTransaction')]");
		filtros.clickx("//div[32]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_Piloto')]");
		filtros.clickx("//div[contains(@class,'entity_Piloto')]");
		filtros.clickx("//div[33]/div[1]/div[1]");
		}

}
