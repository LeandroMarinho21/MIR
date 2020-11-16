package visao.redes;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import filtros.metodos.Filtros;
import filtros.metodos.ViewBTDTO;

public class FiltrosRedes extends Filtros {
	/// Objetivo: Preencher o combo Emissores 
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesEmissores() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_Issuer')]");
		clickx(driver, "//div[34]/div[1]/div[1]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar ");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
		}
	
	/// Objetivo: Preencher o combo Produto
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestRedesProduto() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_Product')]");
		clickx(driver, "//div[35]/div[1]/div[1]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar ");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
		}
	/// Objetivo: Preencher o combo Subproduto
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestRedesSubproduto() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_SubProduct')]");
		clickx(driver, "//div[36]/div[1]/div[1]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar ");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
		}
	
	/// Objetivo: Preencher o combo Quantidade de Parcelas
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestRedesQtdParcelas() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_Plot')]");
		clickx(driver, "//div[37]/div[1]/div[1]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar ");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
		}
	
	/// Objetivo: Preencher o combo Quantidade de Parcelas
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestRedesOperadoras() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_CellphoneOperator')]");
		clickx(driver, "//div[38]/div[1]/div[1]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
		}
	
	/// Objetivo: Preencher o combo Codigo Submodalidade
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestRedesCodigoSubmodalidade() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_SubModality')]");
		clickx(driver, "//div[39]/div[1]/div[1]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
		}

	
	/// Objetivo: Preencher o campo Imei com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesImei() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		/// Preencher Periodo
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		writeperiod1x(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		clickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		writeperiod2x(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		// Preencher Combobox
		writeimei(driver, "//input[contains(@class,'entity_imei')]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
	}
	
	/// Objetivo: Preencher o campo SimCard com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesSimcard() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		/// Preencher Periodo
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		writeperiod1x(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		clickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		writeperiod2x(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		// Preencher Combobox
		writesimcard(driver, "//input[contains(@class,'entity_simCard')]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
	}
	
	/// Objetivo: Preencher o campo Nome Operadora com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesNomeOperadora() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		/// Preencher Periodo
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		writeperiod1x(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		clickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		writeperiod2x(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		// Preencher Combobox
		writeoperadora(driver, "//input[contains(@class,'entity_nmOpe')]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
	}
	
	/// Objetivo: Preencher o campo Mac Address com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestRedesMacAddress() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		/// Preencher Periodo
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		writeperiod1x(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		clickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		writeperiod2x(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		// Preencher Combobox
		writemacaddress(driver, "//input[contains(@class,'entity_macAdr')]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
	}
	
	/// Objetivo: Preencher o campo Ip Terminal com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestRedesIpTerminal() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		/// Preencher Periodo
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		writeperiod1x(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		clickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		writeperiod2x(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		// Preencher Combobox
		writeipterminal(driver, "//input[contains(@class,'entity_ipTerm')]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
	}
	
	/// Objetivo: Preencher o campo Codigo do pais para celular com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestRedesCodPaisParaCel() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		/// Preencher Periodo
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		writeperiod1x(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		clickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		writeperiod2x(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		// Preencher Combobox
		writecodpais(driver, "//input[contains(@class,'entity_cgiMcc')]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
	}
	
	/// Objetivo: Preencher o campo Codigo de rede movel com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestRedesCodRede() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		/// Preencher Periodo
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		writeperiod1x(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		clickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		writeperiod2x(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		// Preencher Combobox
		writecodrede(driver, "//input[contains(@class,'entity_cgiMnc')]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
	}
	
	/// Objetivo: Preencher o campo Codigo de area de localizacao com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestRedesCodArea() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		/// Preencher Periodo
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		writeperiod1x(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		clickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		writeperiod2x(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		// Preencher Combobox
		writecodarea(driver, "//input[contains(@class,'entity_cgiLac')]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
	}
	
	/// Objetivo: Preencher o campo Identidade do celular com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestRedesIdtDoCel() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		/// Preencher Periodo
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		writeperiod1x(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		clickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		writeperiod2x(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		// Preencher Combobox
		writeidtcel(driver, "//input[contains(@class,'entity_cgiCI')]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
	}
	
	/// Objetivo: Preencher o campo Versao da plataforma com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestRedesVersaoPlataforma() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		/// Preencher Periodo
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		writeperiod1x(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		clickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		writeperiod2x(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		// Preencher Combobox
		writeversionplat(driver, "//input[contains(@class,'entity_vrsPlat')]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
	}
	
	/// Objetivo: Preencher o campo Versao CA com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestRedesVersaoCA() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		/// Preencher Periodo
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		writeperiod1x(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		clickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		writeperiod2x(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		// Preencher Combobox
		writeversionca(driver, "//input[contains(@class,'entity_vrsCA')]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
	}

	/// Objetivo: Preencher o text area Pan Web com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesPanWeb() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		/// Preencher Periodo
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		writeperiod1x(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		clickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		writeperiod2x(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		// Preencher novos campos
		writepanx(driver, "//input[contains(@class,'entity_panWeb')]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
	}

	/// Objetivo: Preencher o text area CVV com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesCVV() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		/// Preencher Periodo
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		writeperiod1x(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		clickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		writeperiod2x(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		// Preencher novos campos
		writecvvx(driver, "//input[contains(@class,'entity_cvv')]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
	}

	/// Objetivo: Preencher o text area Descriptor com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesDescriptor() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		/// Preencher Periodo
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		writeperiod1x(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		clickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		writeperiod2x(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		// Preencher novos campos
		writedescx(driver, "//input[contains(@class,'entity_descriptor')]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
	}

	/// Objetivo: Preencher o text area Portador com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesPortador() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		/// Preencher Periodo
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		writeperiod1x(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		clickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		writeperiod2x(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		// Preencher novos campos
		writeportx(driver, "//input[contains(@class,'entity_portador')]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
	}
	
	/// Objetivo: Preencher o combo Tipo de Venda
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesTipoDeVenda() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_SaleType')]");
		clickx(driver, "//div[40]/div[1]/div[1]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar ");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
		}
	
	/// Objetivo: Preencher o combo Meio de captura
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesMeioDeCaptura() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_DeviceCapture')]");
		clickx(driver, "//div[41]/div[1]/div[1]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar ");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
		}
	
	/// Objetivo: Preencher o combo MeioDeCaptura
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesModoDeEntrada() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_EnterMode')]");
		clickx(driver, "//div[42]/div[1]/div[1]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar ");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
		}
	
	/// Objetivo: Preencher o combo Grupo Ramo Atividade
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesGrupoRamoAtividade() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_PrincipalBusiness')]");
		clickx(driver, "//div[43]/div[1]/div[1]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar ");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
		}
	
	/// Objetivo: Preencher o combo Tipo de Emissor
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesTipoDeEmissor() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_IssuerType')]");
		clickx(driver, "//div[44]/div[1]/div[1]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar ");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
		}
	
	/// Objetivo: Preencher o combo Bandeira
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesBandeira() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_Brand')]");
		clickx(driver, "//div[45]/div[1]/div[1]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar ");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
		}
	
	/// Objetivo: Preencher o combo Tipo de Transacao
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesTipoDeTransacao() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_TypeTransaction')]");
		clickx(driver, "//div[46]/div[1]/div[1]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar ");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
		}
	
	/// Objetivo: Preencher o combo Origens Transacoes Web
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesOrigensTrancoesWeb() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_WebSourceTransaction')]");
		clickx(driver, "//div[48]/div[1]/div[1]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar ");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
		}
	
	/// Objetivo: Preencher o combo Codigo da Empresa Adquirente
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesCodigoEmpresaAdquirente() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_CompanyCodePurchasing')]");
		clickx(driver, "//div[49]/div[1]/div[1]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar ");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
		}
	
	/// Objetivo: Preencher o combo Codigo Motivo Rede Externa
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesCodigoMotivoRedeExterna() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_ReasonCodeExternalNetwork')]");
		clickx(driver, "//div[50]/div[1]/div[1]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar ");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
		}
	
	/// Objetivo: Preencher o combo Switch
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesSwitch() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_Switch')]");
		clickx(driver, "//div[51]/div[1]/div[1]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar ");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
		}
	
	/// Objetivo: Preencher o combo FrontEnd
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesFrontEnd() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_Frontend')]");
		clickx(driver, "//div[52]/div[1]/div[1]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar ");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
		}
	
	/// Objetivo: Preencher o combo Codigo de Servico
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesCodServico() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_ServiceCode')]");
		clickx(driver, "//div[53]/div[1]/div[1]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar ");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
		}
	
	/// Objetivo: Preencher o combo Transacoes Tokenizadas
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesTransacoesTokenizadas() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_TokenTransaction')]");
		clickx(driver, "//div[54]/div[1]/div[1]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar ");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
		}
	
	/// Objetivo: Preencher o combo Transacoes Tokenizadas
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesQRCode() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_QrCode')]");
		clickx(driver, "//div[55]/div[1]/div[1]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar ");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
		}
	
	/// Objetivo: Preencher o combo Codigo Carteira
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesCodigoCarteira() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_Wallet')]");
		clickx(driver, "//div[56]/div[1]/div[1]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar ");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
		}
	
	/// Objetivo: Preencher o combo Grupo de Bandeira
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestRedesGrupodeBandeira() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(4).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_BrandGroup')]");
		clickx(driver, "//div[57]/div[1]/div[1]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar ");
		// Verificar se possui dados
		waitingelementx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
		}
	
	

}
