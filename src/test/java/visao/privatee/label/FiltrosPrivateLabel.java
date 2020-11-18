package visao.privatee.label;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import filtros.metodos.Filtros;
import filtros.metodos.ViewBTDTO;

public class FiltrosPrivateLabel extends Filtros {
	
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
		}	

	@After
	public void Encerramento() {
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		waitingelementid(driver, "listViewBTSubProductDTO:0:viewPrivateDesc");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
		}
	
	/// Objetivo: Preencher o combo Emissores 
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
		@Test
		public void TestPrivateLabelEmissores() {
			// Preencher Combobox
			waitingtoclickx(driver, "//div[contains(@class,'entity_Issuer')]");
			clickx(driver, "//div[contains(@class,'entity_Issuer')]");
			clickx(driver, "//div[31]/div[1]/div[1]");
			}
		
		/// Objetivo: Preencher o combo Subproduto
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelSubproduto() {
			// Preencher Combobox
			waitingtoclickx(driver, "//div[contains(@class,'entity_SubProduct')]");
			clickx(driver, "//div[contains(@class,'entity_SubProduct')]");
			clickx(driver, "//div[32]/div[1]/div[1]");
			}
		
		/// Objetivo: Preencher o combo Quantidade de Parcelas
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelQtdParcelas() {
			// Preencher Combobox
			waitingtoclickx(driver, "//div[contains(@class,'entity_Plot')]");
			clickx(driver, "//div[contains(@class,'entity_Plot')]");
			clickx(driver, "//div[33]/div[1]/div[1]");
			}
		
		/// Objetivo: Preencher o combo Quantidade de Parcelas
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelOperadoras() {
			// Preencher Combobox
			waitingtoclickx(driver, "//div[contains(@class,'entity_CellphoneOperator')]");
			clickx(driver, "//div[contains(@class,'entity_CellphoneOperator')]");
			clickx(driver, "//div[34]/div[1]/div[1]");
			}

		
		/// Objetivo: Preencher o campo Imei com parte do nome.
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelImei() {
			// Preencher Combobox
			writeimei(driver, "//input[contains(@class,'entity_imei')]");
			}
		
		/// Objetivo: Preencher o campo SimCard com parte do nome.
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		@Test
		public void TestPrivateLabelSimcard() {
			// Preencher Combobox
			writesimcard(driver, "//input[contains(@class,'entity_simCard')]");
			}
		
		/// Objetivo: Preencher o campo Nome Operadora com parte do nome.
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		@Test
		public void TestPrivateLabelNomeOperadora() {
			// Preencher Combobox
			writeoperadora(driver, "//input[contains(@class,'entity_nmOpe')]");
			}
		
		/// Objetivo: Preencher o campo Mac Address com parte do nome.
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelMacAddress() {
			// Preencher Combobox
			writemacaddress(driver, "//input[contains(@class,'entity_macAdr')]");
			}
		
		/// Objetivo: Preencher o campo Ip Terminal com parte do nome.
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelIpTerminal() {
			// Preencher Combobox
			writeipterminal(driver, "//input[contains(@class,'entity_ipTerm')]");
			}
		
		/// Objetivo: Preencher o campo Codigo do pais para celular com parte do nome.
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelCodPaisParaCel() {
			// Preencher Combobox
			writecodpais(driver, "//input[contains(@class,'entity_cgiMcc')]");
			}
		
		/// Objetivo: Preencher o campo Codigo de rede movel com parte do nome.
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelCodRede() {
			// Preencher Combobox
			writecodrede(driver, "//input[contains(@class,'entity_cgiMnc')]");
			}
		
		/// Objetivo: Preencher o campo Codigo de area de localizacao com parte do nome.
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelCodArea() {
			// Preencher Combobox
			writecodarea(driver, "//input[contains(@class,'entity_cgiLac')]");
			}
		
		/// Objetivo: Preencher o campo Identidade do celular com parte do nome.
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelIdtDoCel() {
			// Preencher Combobox
			writeidtcel(driver, "//input[contains(@class,'entity_cgiCI')]");
			}
		
		/// Objetivo: Preencher o campo Versao da plataforma com parte do nome.
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelVersaoPlataforma() {
			// Preencher Combobox
			writeversionplat(driver, "//input[contains(@class,'entity_vrsPlat')]");
			}
		
		/// Objetivo: Preencher o campo Versao CA com parte do nome.
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelVersaoCA() {
			// Preencher Combobox
			writeversionca(driver, "//input[contains(@class,'entity_vrsCA')]");
			}

		/// Objetivo: Preencher o text area Pan Web com parte do nome.
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelPanWeb() {
			// Preencher novos campos
			writepanx(driver, "//input[contains(@class,'entity_panWeb')]");
			}

		/// Objetivo: Preencher o text area CVV com parte do nome.
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelCVV() {
			// Preencher novos campos
			writecvvx(driver, "//input[contains(@class,'entity_cvv')]");
			}

		/// Objetivo: Preencher o text area Descriptor com parte do nome.
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelDescriptor() {
			// Preencher novos campos
			writedescx(driver, "//input[contains(@class,'entity_descriptor')]");
			}

		/// Objetivo: Preencher o text area Portador com parte do nome.
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelPortador() {
			// Preencher novos campos
			writeportx(driver, "//input[contains(@class,'entity_portador')]");
			}
		
		/// Objetivo: Preencher o combo Tipo de Venda
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelTipoDeVenda() {
			// Preencher Combobox
			waitingtoclickx(driver, "//div[contains(@class,'entity_SaleType')]");
			clickx(driver, "//div[contains(@class,'entity_SaleType')]");
			clickx(driver, "//div[35]/div[1]/div[1]");
			}
		
		/// Objetivo: Preencher o combo Meio de captura
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelMeioDeCaptura() {
			// Preencher Combobox
			waitingtoclickx(driver, "//div[contains(@class,'entity_DeviceCapture')]");
			clickx(driver, "//div[contains(@class,'entity_DeviceCapture')]");
			clickx(driver, "//div[36]/div[1]/div[1]");
			}
		
		/// Objetivo: Preencher o combo MeioDeCaptura
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelModoDeEntrada() {
			// Preencher Combobox
			waitingtoclickx(driver, "//div[contains(@class,'entity_EnterMode')]");
			clickx(driver, "//div[contains(@class,'entity_EnterMode')]");
			clickx(driver, "//div[37]/div[1]/div[1]");

			}
		
		/// Objetivo: Preencher o combo Grupo Ramo Atividade
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelGrupoRamoAtividade() {
			// Preencher Combobox
			waitingtoclickx(driver, "//div[contains(@class,'entity_PrincipalBusiness')]");
			clickx(driver, "//div[contains(@class,'entity_PrincipalBusiness')]");
			clickx(driver, "//div[38]/div[1]/div[1]");
			}
		
		/// Objetivo: Preencher o combo Tipo de Emissor
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelTipoDeEmissor() {
			// Preencher Combobox
			waitingtoclickx(driver, "//div[contains(@class,'entity_IssuerType')]");
			clickx(driver, "//div[contains(@class,'entity_IssuerType')]");
			clickx(driver, "//div[39]/div[1]/div[1]");
			}
		
		/// Objetivo: Preencher o combo Tipo de Transacao
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelTipoDeTransacao() {
			// Preencher Combobox
			waitingtoclickx(driver, "//div[contains(@class,'entity_TypeTransaction')]");
			clickx(driver, "//div[contains(@class,'entity_TypeTransaction')]");
			clickx(driver, "//div[40]/div[1]/div[1]");
			}
		
		/// Objetivo: Preencher o combo Origens Transacoes Web
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelOrigensTrancoesWeb() {
			// Preencher Combobox
			waitingtoclickx(driver, "//div[contains(@class,'entity_WebSourceTransaction')]");
			clickx(driver, "//div[contains(@class,'entity_WebSourceTransaction')]");
			clickx(driver, "//div[42]/div[1]/div[1]");
			}
		
		/// Objetivo: Preencher o combo Codigo da Empresa Adquirente
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelCodigoEmpresaAdquirente() {
			// Preencher Combobox
			waitingtoclickx(driver, "//div[contains(@class,'entity_CompanyCodePurchasing')]");
			clickx(driver, "//div[contains(@class,'entity_CompanyCodePurchasing')]");
			clickx(driver, "//div[43]/div[1]/div[1]");
			}
		
		/// Objetivo: Preencher o combo Codigo Motivo Rede Externa
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelCodigoMotivoRedeExterna() {
			// Preencher Combobox
			waitingtoclickx(driver, "//div[contains(@class,'entity_ReasonCodeExternalNetwork')]");
			clickx(driver, "//div[contains(@class,'entity_ReasonCodeExternalNetwork')]");
			clickx(driver, "//div[44]/div[1]/div[1]");
			}
		
		/// Objetivo: Preencher o combo Switch
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelSwitch() {
			// Preencher Combobox
			waitingtoclickx(driver, "//div[contains(@class,'entity_Switch')]");
			clickx(driver, "//div[contains(@class,'entity_Switch')]");
			clickx(driver, "//div[45]/div[1]/div[1]");
			}
		
		/// Objetivo: Preencher o combo FrontEnd
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelFrontEnd() {
			// Preencher Combobox
			waitingtoclickx(driver, "//div[contains(@class,'entity_Frontend')]");
			clickx(driver, "//div[contains(@class,'entity_Frontend')]");
			clickx(driver, "//div[46]/div[1]/div[1]");
			}
		
		/// Objetivo: Preencher o combo Codigo de Servico
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelCodServico() {
			// Preencher Combobox
			waitingtoclickx(driver, "//div[contains(@class,'entity_ServiceCode')]");
			clickx(driver, "//div[contains(@class,'entity_ServiceCode')]");
			clickx(driver, "//div[47]/div[1]/div[1]");
			}
		
		/// Objetivo: Preencher o combo Transacoes Tokenizadas
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelTransacoesTokenizadas() {
			// Preencher Combobox
			waitingtoclickx(driver, "//div[contains(@class,'entity_TokenTransaction')]");
			clickx(driver, "//div[contains(@class,'entity_TokenTransaction')]");
			clickx(driver, "//div[48]/div[1]/div[1]");
			}
		
		/// Objetivo: Preencher o combo Transacoes Tokenizadas
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelQRCode() {
			// Preencher Combobox
			waitingtoclickx(driver, "//div[contains(@class,'entity_QrCode')]");
			clickx(driver, "//div[contains(@class,'entity_QrCode')]");
			clickx(driver, "//div[49]/div[1]/div[1]");
			}
		
		/// Objetivo: Preencher o combo Codigo Carteira
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelCodigoCarteira() {
			// Preencher Combobox
			waitingtoclickx(driver, "//div[contains(@class,'entity_Wallet')]");
			clickx(driver, "//div[contains(@class,'entity_Wallet')]");
			clickx(driver, "//div[50]/div[1]/div[1]");
			}
		
		/// Objetivo: Preencher o combo Grupo de Bandeira
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
		
		@Test
		public void TestPrivateLabelGrupodeBandeira() {
			// Preencher Combobox
			waitingtoclickx(driver, "//div[contains(@class,'entity_BrandGroup')]");
			clickx(driver, "//div[contains(@class,'entity_BrandGroup')]");
			clickx(driver, "//div[51]/div[1]/div[1]");
			}

}
