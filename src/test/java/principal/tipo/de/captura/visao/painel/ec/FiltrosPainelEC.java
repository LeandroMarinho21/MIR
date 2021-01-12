package principal.tipo.de.captura.visao.painel.ec;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import metodos.mir.Filtros;

public class FiltrosPainelEC {
	
	private WebDriver driver;
	private Filtros filtros;

	@Before
	public void Inicializar() {
		driver = new ChromeDriver();
		filtros = new Filtros(driver);
		driver.get("https://192.168.80.18:8081/mir.console/pages/view/viewkomercitransaction.jsf");
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
		filtros.waitingElementBeClickableid("listViewBTTransactionDTO:0:viewKomerciDesc");
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
		filtros.waitingtoclickx("//div[contains(@class,'entity_Issuer')]");
		filtros.clickx("//div[contains(@class,'entity_Issuer')]");
		filtros.clickx("//div[19]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_Brand')]");
		filtros.clickx("//div[contains(@class,'entity_Brand')]");
		filtros.clickx("//div[20]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher os Combos
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
	@Test
	public void TestCombos2() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_WebSourceTransaction')]");
		filtros.clickx("//div[contains(@class,'entity_WebSourceTransaction')]");
		filtros.clickx("//div[21]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_GroupEstablishmentKomerci')]");
		filtros.clickx("//div[contains(@class,'entity_GroupEstablishmentKomerci')]");
		filtros.clickx("//div[22]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_BrandGroup')]");
		filtros.clickx("//div[contains(@class,'entity_BrandGroup')]");
		filtros.clickx("//div[23]/div[1]/div[1]");
		}

}
