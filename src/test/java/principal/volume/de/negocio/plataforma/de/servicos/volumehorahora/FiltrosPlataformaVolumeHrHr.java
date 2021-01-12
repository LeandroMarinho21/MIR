package principal.volume.de.negocio.plataforma.de.servicos.volumehorahora;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import metodos.mir.Filtros;

public class FiltrosPlataformaVolumeHrHr {

	private WebDriver driver;
	private Filtros filtros;

	@Before
	public void Inicializar() {
		driver = new ChromeDriver();
		filtros = new Filtros(driver);
		driver.get("https://192.168.80.18:8081/mir.console/pages/view/viewServiceGraphic.jsf");
		// Login
		filtros.login2();
		// Filtro
		filtros.waitingtoclick("btnFilter");
		//Verificar Errro ao entrar
		filtros.erroDesc("//span[text()='Ocorreu um erro desconhecido, consulte o administrador']");
		filtros.click("btnFilter");
		filtros.waiting("dialogLoadbar");
		// Preencher Período
		}

	@After
	public void Encerramento() {
		// Consultar
		filtros.click("btnConsult");
		filtros.waiting("dialogLoadbar");
		// Verificar se possui dados
		filtros.waitingElementBeClickableid("tblTransactionsDay");
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
		filtros.clickx("//div[contains(@class,'entity_TypePartner')]");
		filtros.clickx("//div[15]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_TypeService')]");
		filtros.clickx("//div[contains(@class,'entity_TypeService')]");
		filtros.clickx("//div[16]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o Campos dos 4 campos
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestCombos2() {
		// Preencher primeiros combos
		filtros.waitingtoclickx("//div[contains(@class,'entity_EnterModeService')]");
		filtros.clickx("//div[contains(@class,'entity_EnterModeService')]");
		filtros.clickx("//div[17]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_TypeTransaction')]");
		filtros.clickx("//div[contains(@class,'entity_TypeTransaction')]");
		filtros.clickx("//div[18]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher os Combos
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestCombos3() {
		// Preencher primeiros combos
		filtros.waitingtoclickx("//div[contains(@class,'entity_TransactionStatus')]");
		filtros.clickx("//div[contains(@class,'entity_TransactionStatus')]");
		filtros.clickx("//div[19]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_DeviceCapture')]");
		filtros.clickx("//div[contains(@class,'entity_DeviceCapture')]");
		filtros.clickx("//div[20]/div[1]/div[1]");
		}
}
