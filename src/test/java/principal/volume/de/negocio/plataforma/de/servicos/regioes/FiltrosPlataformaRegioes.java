package principal.volume.de.negocio.plataforma.de.servicos.regioes;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import metodos.mir.Filtros;
import metodos.mir.ViewBTDTO;

public class FiltrosPlataformaRegioes extends Filtros {
	
	private WebDriver driver;

	@Before
	public void Inicializar() {
		driver = new ChromeDriver();
		List<ViewBTDTO> links = getViews();
		// Login
		login2(driver, links.get(18).getUrl());
		// Filtro
		waitingtoclick(driver, "bntSearch");
		//Verificar Errro ao entrar
		erroDesc(driver, "//span[text()='Ocorreu um erro desconhecido, consulte o administrador']");
		click(driver, "bntSearch");
		waiting(driver, "dialogLoadbar");
		// Preencher Período
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_component_input')]");
		clickx(driver, "//input[contains(@id,'dt_transaction_component_input')]");
		WebElement PeriodoIni = driver.findElement(By.xpath("//input[contains(@id,'dt_transaction_component_input')]"));
		sendKeys("08122020", PeriodoIni);
		}

	@After
	public void Encerramento() {
		// Consultar
		click(driver, "btnAlarmConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		waitingElementBeClickableid(driver, "listRegion:0:regionDesc");
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
		clickx(driver, "//div[contains(@class,'entity_TypePartner')]");
		clickx(driver, "//div[17]/div[1]/div[1]");
		waitingtoclickx(driver, "//div[contains(@class,'entity_TypeService')]");
		clickx(driver, "//div[contains(@class,'entity_TypeService')]");
		clickx(driver, "//div[18]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o Campos dos 4 campos
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestCombos2() {
		// Preencher primeiros combos
		waitingtoclickx(driver, "//div[contains(@class,'entity_EnterModeService')]");
		clickx(driver, "//div[contains(@class,'entity_EnterModeService')]");
		clickx(driver, "//div[19]/div[1]/div[1]");
		waitingtoclickx(driver, "//div[contains(@class,'entity_TypeTransaction')]");
		clickx(driver, "//div[contains(@class,'entity_TypeTransaction')]");
		clickx(driver, "//div[20]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher os Combos
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestCombos3() {
		// Preencher primeiros combos
		waitingtoclickx(driver, "//div[contains(@class,'entity_TransactionStatus')]");
		clickx(driver, "//div[contains(@class,'entity_TransactionStatus')]");
		clickx(driver, "//div[21]/div[1]/div[1]");
		waitingtoclickx(driver, "//div[contains(@class,'entity_DeviceCapture')]");
		clickx(driver, "//div[contains(@class,'entity_DeviceCapture')]");
		clickx(driver, "//div[22]/div[1]/div[1]");
		}

}
