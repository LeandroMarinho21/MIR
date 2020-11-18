package visao.emissor;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import filtros.metodos.Filtros;
import filtros.metodos.ViewBTDTO;

public class debug extends Filtros {
	
	private WebDriver driver;

	@Before
	public void Inicializar() {
		driver = new ChromeDriver();
		List<ViewBTDTO> links = getViews();
		// Login
		login2(driver, links.get(1).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		System.out.println("Entrei Filtro");
		waiting(driver, "dialogLoadbar");
	}

	@After
	public void Encerramento() {
		// Consultar
		System.out.println("Sai Filtro");
		click(driver, "btnConsult");
		System.out.println("Consultei");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		waitingElementBeClickableid(driver, "listViewBTIssuerDTO:0:tbody_desc");
		System.out.println("Verifiquei");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
	}
	
	/// Objetivo: Preencher o combo Emissores
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.

	@Test
	public void TestNovosCampos11() {
		// Preencher Combobox
		writeimei(driver, "//input[contains(@class,'entity_imei')]");
		waitingtoclickx(driver, "//div[contains(@class,'entity_simCard')]");
		writesimcard(driver, "//input[contains(@class,'entity_simCard')]");
		waitingtoclickx(driver, "//div[contains(@class,'entity_nmOpe')]");
		writeoperadora(driver, "//input[contains(@class,'entity_nmOpe')]");
		waitingtoclickx(driver, "//div[contains(@class,'entity_macAdr')]");
		writemacaddress(driver, "//input[contains(@class,'entity_macAdr')]");
		waitingtoclickx(driver, "//div[contains(@class,'entity_ipTerm')]");
		writeipterminal(driver, "//input[contains(@class,'entity_ipTerm')]");
		writecodpais(driver, "//input[contains(@class,'entity_cgiMcc')]");
		waitingtoclickx(driver, "//div[contains(@class,'entity_cgiMnc')]");
		writecodrede(driver, "//input[contains(@class,'entity_cgiMnc')]");
		waitingtoclickx(driver, "//div[contains(@class,'entity_cgiLac')]");
		writecodarea(driver, "//input[contains(@class,'entity_cgiLac')]");
		waitingtoclickx(driver, "//div[contains(@class,'entity_cgiCI')]");
		writeidtcel(driver, "//input[contains(@class,'entity_cgiCI')]");
		waitingtoclickx(driver, "//div[contains(@class,'entity_vrsPlat')]");
		writeversionplat(driver, "//input[contains(@class,'entity_vrsPlat')]");
		waitingtoclickx(driver, "//div[contains(@class,'entity_vrsCA')]");
		writeversionca(driver, "//input[contains(@class,'entity_vrsCA')]");
		System.out.println("Selecionei");
	}

}
