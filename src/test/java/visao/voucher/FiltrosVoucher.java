package visao.voucher;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import filtros.metodos.Filtros;
import filtros.metodos.ViewBTDTO;

public class FiltrosVoucher extends Filtros {
	
	private WebDriver driver;
	
	@Before
		public void Inicializar() {
		driver = new ChromeDriver();
		List<ViewBTDTO> links = getViews();
		/// Login
		login2(driver, links.get(3).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		waiting(driver, "dialogLoadbar");
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		writeperiod1x(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		clickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		writeperiod2x(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		waitingtoclickx(driver, "//div[contains(@class,'entity_Issuer')]");
		}	

	@After
	public void Encerramento() {
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
	
	/// Objetivo: Preencher o combo Emissores 
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherEmissores() {
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_Issuer')]");
		clickx(driver, "//div[31]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o combo Subproduto
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherSubproduto() {
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_SubProduct')]");
		clickx(driver, "//div[32]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o combo Quantidade de Parcelas
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherQtdParcelas() {
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_Plot')]");
		clickx(driver, "//div[33]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o combo Quantidade de Parcelas
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherOperadoras() {
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_CellphoneOperator')]");
		clickx(driver, "//div[34]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o campo Imei com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherImei() {
		// Preencher Combobox
		writeimei(driver, "//input[contains(@class,'entity_imei')]");
		}
	
	/// Objetivo: Preencher o campo SimCard com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherSimcard() {
		// Preencher Combobox
		writesimcard(driver, "//input[contains(@class,'entity_simCard')]");
		}
	
	/// Objetivo: Preencher o campo Nome Operadora com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestVoucherNomeOperadora() {
		// Preencher Combobox
		writeoperadora(driver, "//input[contains(@class,'entity_nmOpe')]");
		}
	
	/// Objetivo: Preencher o campo Mac Address com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherMacAddress() {
		// Preencher Combobox
		writemacaddress(driver, "//input[contains(@class,'entity_macAdr')]");
		}
	
	/// Objetivo: Preencher o campo Ip Terminal com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherIpTerminal() {
		// Preencher Combobox
		writeipterminal(driver, "//input[contains(@class,'entity_ipTerm')]");
		}
	
	/// Objetivo: Preencher o campo Codigo do pais para celular com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherCodPaisParaCel() {
		// Preencher Combobox
		writecodpais(driver, "//input[contains(@class,'entity_cgiMcc')]");
		}
	
	/// Objetivo: Preencher o campo Codigo de rede movel com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherCodRede() {
		// Preencher Combobox
		writecodrede(driver, "//input[contains(@class,'entity_cgiMnc')]");
		}
	
	/// Objetivo: Preencher o campo Codigo de area de localizacao com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherCodArea() {
		// Preencher Combobox
		writecodarea(driver, "//input[contains(@class,'entity_cgiLac')]");
		}
	
	/// Objetivo: Preencher o campo Identidade do celular com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherIdtDoCel() {
		// Preencher Combobox
		writeidtcel(driver, "//input[contains(@class,'entity_cgiCI')]");
		}
	
	/// Objetivo: Preencher o campo Versao da plataforma com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherVersaoPlataforma() {
		// Preencher Combobox
		writeversionplat(driver, "//input[contains(@class,'entity_vrsPlat')]");
		}
	
	/// Objetivo: Preencher o campo Versao CA com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherVersaoCA() {
		// Preencher Combobox
		writeversionca(driver, "//input[contains(@class,'entity_vrsCA')]");
		}

	/// Objetivo: Preencher o text area Pan Web com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherPanWeb() {
		// Preencher novos campos
		writepanx(driver, "//input[contains(@class,'entity_panWeb')]");
		}

	/// Objetivo: Preencher o text area CVV com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherCVV() {
		// Preencher novos campos
		writecvvx(driver, "//input[contains(@class,'entity_cvv')]");
		}

	/// Objetivo: Preencher o text area Descriptor com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherDescriptor() {
		// Preencher novos campos
		writedescx(driver, "//input[contains(@class,'entity_descriptor')]");
		}

	/// Objetivo: Preencher o text area Portador com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherPortador() {
		// Preencher novos campos
		writeportx(driver, "//input[contains(@class,'entity_portador')]");
		}
	
	/// Objetivo: Preencher o combo Tipo de Venda
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherTipoDeVenda() {
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_SaleType')]");
		clickx(driver, "//div[35]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o combo Meio de captura
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherMeioDeCaptura() {
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_DeviceCapture')]");
		clickx(driver, "//div[36]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o combo MeioDeCaptura
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherModoDeEntrada() {
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_EnterMode')]");
		clickx(driver, "//div[37]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o combo Grupo Ramo Atividade
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherGrupoRamoAtividade() {
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_PrincipalBusiness')]");
		clickx(driver, "//div[38]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o combo Tipo de Emissor
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherTipoDeEmissor() {
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_IssuerType')]");

		}
	
	/// Objetivo: Preencher o combo Tipo de Transacao
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherTipoDeTransacao() {
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_TypeTransaction')]");
		clickx(driver, "//div[40]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o combo Origens Transacoes Web
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherOrigensTrancoesWeb() {
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_WebSourceTransaction')]");
		clickx(driver, "//div[42]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o combo Codigo da Empresa Adquirente
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherCodigoEmpresaAdquirente() {
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_CompanyCodePurchasing')]");
		clickx(driver, "//div[43]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o combo Codigo Motivo Rede Externa
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherCodigoMotivoRedeExterna() {
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_ReasonCodeExternalNetwork')]");
		clickx(driver, "//div[44]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o combo Switch
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherSwitch() {
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_Switch')]");
		clickx(driver, "//div[45]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o combo FrontEnd
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherFrontEnd() {
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_Frontend')]");
		clickx(driver, "//div[46]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o combo Codigo de Servico
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherCodServico() {
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_ServiceCode')]");
		clickx(driver, "//div[47]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o combo Transacoes Tokenizadas
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherTransacoesTokenizadas() {
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_TokenTransaction')]");
		clickx(driver, "//div[48]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o combo Transacoes Tokenizadas
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherQRCode() {
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_QrCode')]");
		clickx(driver, "//div[49]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o combo Codigo Carteira
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherCodigoCarteira() {
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_Wallet')]");
		clickx(driver, "//div[50]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o combo Grupo de Bandeira
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestVoucherGrupodeBandeira() {
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_BrandGroup')]");
		clickx(driver, "//div[51]/div[1]/div[1]");
		}

}
