package principal.tipo.de.captura.visao.piloto;

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

public class FiltrosPiloto extends Filtros {

	private WebDriver driver;

	@Before
	public void Inicializar() {
		driver = new ChromeDriver();
		List<ViewBTDTO> links = getViews();
		// Login
		login2(driver, links.get(15).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		//Verificar Errro ao entrar
		erroDesc(driver, "//span[text()='Ocorreu um erro desconhecido, consulte o administrador']");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		// Preencher Período
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_component_input')]");
		clickx(driver, "//input[contains(@id,'dt_transaction_component_input')]");
		WebElement PeriodoIni = findElement(driver, "//input[contains(@id,'dt_transaction_component_input')]");
		sendKeys("08092020", PeriodoIni);
		}

	@After
	public void Encerramento() {
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		waitingElementBeClickableid(driver, "listViewBTPilotoDTO:0:viewPiloto");
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
		clickx(driver, "//div[22]/div[1]/div[1]");
		waitingtoclickx(driver, "//div[contains(@class,'entity_Product')]");
		clickx(driver, "//div[contains(@class,'entity_Product')]");
		clickx(driver, "//div[23]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o Campos dos 4 campos
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestCombos2() {
		// Preencher primeiros combos
		waitingtoclickx(driver, "//div[contains(@class,'entity_SaleType')]");
		clickx(driver, "//div[contains(@class,'entity_SaleType')]");
		clickx(driver, "//div[25]/div[1]/div[1]");
		waitingtoclickx(driver, "//div[contains(@class,'entity_DeviceCapture')]");
		clickx(driver, "//div[contains(@class,'entity_DeviceCapture')]");
		clickx(driver, "//div[26]/div[1]/div[1]");
		waitingtoclickx(driver, "//div[contains(@class,'entity_EnterMode')]");
		clickx(driver, "//div[contains(@class,'entity_EnterMode')]");
		clickx(driver, "//div[27]/div[1]/div[1]");
		waitingtoclickx(driver, "//div[contains(@class,'entity_PrincipalBusiness')]");
		clickx(driver, "//div[contains(@class,'entity_PrincipalBusiness')]");
		clickx(driver, "//div[28]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher os Combos
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestCombos3() {
		// Preencher primeiros combos
		waitingtoclickx(driver, "//div[contains(@class,'entity_IssuerType')]");
		clickx(driver, "//div[contains(@class,'entity_IssuerType')]");
		clickx(driver, "//div[29]/div[1]/div[1]");
		waitingtoclickx(driver, "//div[contains(@class,'entity_Brand')]");
		clickx(driver, "//div[contains(@class,'entity_Brand')]");
		clickx(driver, "//div[30]/div[1]/div[1]");
		waitingtoclickx(driver, "//div[contains(@class,'entity_BrandGroup')]");
		clickx(driver, "//div[contains(@class,'entity_BrandGroup')]");
		clickx(driver, "//div[31]/div[1]/div[1]");
		waitingtoclickx(driver, "//div[contains(@class,'entity_TypeTransaction')]");
		clickx(driver, "//div[contains(@class,'entity_TypeTransaction')]");
		clickx(driver, "//div[32]/div[1]/div[1]");
		waitingtoclickx(driver, "//div[contains(@class,'entity_Piloto')]");
		clickx(driver, "//div[contains(@class,'entity_Piloto')]");
		clickx(driver, "//div[33]/div[1]/div[1]");
		}

}
