package visao.painel.ec;

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

public class FiltrosPainelEC extends Filtros {
	
	private WebDriver driver;

	@Before
	public void Inicializar() {
		driver = new ChromeDriver();
		List<ViewBTDTO> links = getViews();
		// Login
		login2(driver, links.get(8).getUrl());
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
		waitingElementBeClickableid(driver, "listViewBTTransactionDTO:0:viewKomerciDesc");
		// Verificar se ocorre erro
		erroDesc(driver, "ui-growl-message");
		System.out.println("Sucess");
		driver.quit();
		}
	
	/// Objetivo: Preencher os Combos
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestCombos1() {
		// Preencher primeiros combos
		waitingtoclickx(driver, "//div[contains(@class,'entity_Issuer')]");
		clickx(driver, "//div[contains(@class,'entity_Issuer')]");
		clickx(driver, "//div[19]/div[1]/div[1]");
		waitingtoclickx(driver, "//div[contains(@class,'entity_Brand')]");
		clickx(driver, "//div[contains(@class,'entity_Brand')]");
		clickx(driver, "//div[20]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher os Combos
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
	@Test
	public void TestCombos2() {
		waitingtoclickx(driver, "//div[contains(@class,'entity_WebSourceTransaction')]");
		clickx(driver, "//div[contains(@class,'entity_WebSourceTransaction')]");
		clickx(driver, "//div[21]/div[1]/div[1]");
		waitingtoclickx(driver, "//div[contains(@class,'entity_GroupEstablishmentKomerci')]");
		clickx(driver, "//div[contains(@class,'entity_GroupEstablishmentKomerci')]");
		clickx(driver, "//div[22]/div[1]/div[1]");
		waitingtoclickx(driver, "//div[contains(@class,'entity_BrandGroup')]");
		clickx(driver, "//div[contains(@class,'entity_BrandGroup')]");
		clickx(driver, "//div[23]/div[1]/div[1]");
		}

}
