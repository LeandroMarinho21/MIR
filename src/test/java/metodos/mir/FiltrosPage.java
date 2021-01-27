package metodos.mir;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FiltrosPage {
	
	private Filtros filtros;

		public FiltrosPage(WebDriver driver) {
			filtros = new Filtros(driver);
	}
		
	/********* URL's ************/
		
	public void getUrl(String URL) {
		filtros.driver.get(URL);
	}
	
	/********* Login ************/
		
	public void loginLocal() {
		filtros.login();
	}
	
	public void loginPrivate() {
		filtros.login2();
	}
	
	/********* Clicar e Escrever ************/
		
	public void clickFilter() {
		filtros.click("btnFilter");
	}
	
	public void clickFilter2() {
		filtros.click("bntSearch");
	}
	
	public void clickConsult() {
		filtros.click("btnConsult");
	}
	
	public void clickConsult2() {
		filtros.click("btnAlarmConsult");
	}
	
	public void clickDesagruparPorBandeira() {
		filtros.clickx("//div[contains(@class,'entity_groupByBrand')]");
	}
	
	public void clickDate() {
		filtros.clickx("//input[contains(@id,'dt_transaction_component_input')]");
	}
	
	public void clickPeriodIni() {
		filtros.clickx("//input[contains(@id,'dt_transaction_ini_input')]");
	}
	
	public void clickPeriodoFin() {
		filtros.clickx("//input[contains(@id,'dt_transaction_fin_component_input')]");
	}
	
	public void writePeriodIni(String escrever,WebElement element) {
		filtros.sendKeys(escrever, element);
	}
	
	public void writePeriodFin(String escrever,WebElement element) {
		filtros.sendKeys(escrever, element);
	}
	
	public void writeDate(String escrever,WebElement element) {
		filtros.sendKeys(escrever, element);
	}
	
	public void selectAll(String Todos) {
		filtros.clickx(Todos);
	}
	
	/********* POS Remodeladas Cidades ************/
	
	public void clickComboEstado() {
		filtros.clickx("/html/body/center/div[4]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td[1]/table/tbody/tr[4]/td/div/label");
	}
	
	public void clickInputEstado() {
		filtros.clickx("/html/body/div[19]/div[1]/input");
	}
	
	public void writeInputEstado() {
		filtros.writex("/html/body/div[19]/div[1]/input", "Sao Paulo");
	}
	
	public void SelectEstado() {
		filtros.clickx("/html/body/div[19]/div[2]/ul/li[27]");
	}
	
	public void SelectAllCities() {
		filtros.click("cmbNewAll");
	}
	
	/********* Verificacoes ************/
	
	public void verifyError() {
		filtros.erroDesc("//span[text()='Ocorreu um erro desconhecido, consulte o administrador']");
	}
	
	public void verifyElementTable(String tabela) {
		filtros.waitingElementBeClickableid(tabela);
	}
	
	public WebElement findPeriodIni() {
		return filtros.findElement("//input[contains(@id,'dt_transaction_ini_input')]");
	}
	
	public WebElement findPeriodFin() {
		return filtros.findElement("//input[contains(@id,'dt_transaction_fin_component_input')]");
	}
	
	public WebElement findDate() {
		return filtros.findElement("//input[contains(@id,'dt_transaction_component_input')]");
	}	
	
	/********* Carregamento e Aguardando Elemento ************/
	
	public void waitToClick(String elemento) {
		filtros.waitingtoclick(elemento);
	}
	
	public void waitToClickFilter() {
		filtros.waitingtoclick("btnFilter");
	}
	
	public void waitToClickDate() {
		filtros.waitingtoclickx("//input[contains(@id,'dt_transaction_component_input')]");
	}
	
	public void waitToClickPeriodIni() {
		filtros.waitingtoclickx("//input[contains(@id,'dt_transaction_ini_input')]");
	}
	
	public void waitToClickPeriodFin() {
		filtros.waitingtoclickx("//input[contains(@id,'dt_transaction_fin_component_input')]");
	}
	
	public void waitToClickFilter2() {
		filtros.waitingtoclick("bntSearch");
	}	
	
	public void loading() {
		filtros.waiting("dialogLoadbar");
	}
	
	/********* Encerramento ************/
	
	public void finish() {
		filtros.driver.quit();
	}
	
	/********* Combos Filtros ************/
	
	public void filterComboEmissor() {
		filtros.clickx("//div[contains(@class,'entity_Issuer')]");
	}
	
	public void waitToClickComboEmissor() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_Issuer')]");
	}
	
	public void filterComboBandeiras() {
		filtros.clickx("//div[contains(@class,'entity_Brand')]");
	}
	
	public void waitToClickComboBandeiras() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_Brand')]");
	}
	
	public void filterComboProduto() {
		filtros.clickx("//div[contains(@class,'entity_Product')]");
	}
	
	public void waitToClickComboProduto() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_Product')]");
	}
	
	public void filterComboSubProduto() {
		filtros.clickx("//div[contains(@class,'entity_SubProduct')]");
	}
	
	public void waitToClickComboSubProduto() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_SubProduct')]");
	}
	
	public void filterComboParcelas() {
		filtros.clickx("//div[contains(@class,'entity_Plot')]");
	}
	
	public void waitToClickComboParcelas() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_Plot')]");
	}
	
	public void filterComboOperadoras() {
		filtros.clickx("//div[contains(@class,'entity_CellphoneOperator')]");
	}
	
	public void waitToClickComboOperadoras() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_CellphoneOperator')]");
	}
	
	public void filterInputImei() {
		filtros.writeimei("//input[contains(@class,'entity_imei')]");
	}
	
	public void filterInputSimCard() {
		filtros.writesimcard("//input[contains(@class,'entity_simCard')]");
	}
	
	public void filterInputOperadora() {
		filtros.writeoperadora("//input[contains(@class,'entity_nmOpe')]");
	}
	
	public void filterInputMacAdress() {
		filtros.writemacaddress("//input[contains(@class,'entity_macAdr')]");
	}
	
	public void filterInputIpTerminal() {
		filtros.writeipterminal("//input[contains(@class,'entity_ipTerm')]");
	}
	
	public void filterInputCodPais() {
		filtros.writecodpais("//input[contains(@class,'entity_cgiMcc')]");
	}
	
	public void filterInputCodRede() {
		filtros.writecodrede("//input[contains(@class,'entity_cgiMnc')]");
	}
	
	public void filterInputCodArea() {
		filtros.writecodarea("//input[contains(@class,'entity_cgiLac')]");
	}
	
	public void filterInputIdCel() {
		filtros.writeidtcel("//input[contains(@class,'entity_cgiCI')]");
	}
	
	public void filterInputVersionPlat() {
		filtros.writeversionplat("//input[contains(@class,'entity_vrsPlat')]");
	}
	
	public void filterInputVersionCA() {
		filtros.writeversionca("//input[contains(@class,'entity_vrsCA')]");
	}
	
	public void filterInputPanWeb() {
		filtros.writepanx("//input[contains(@class,'entity_panWeb')]");
	}
	
	public void waitToClickInputPanWeb() {
		filtros.waitingtoclickx("//input[contains(@class,'entity_panWeb')]");
	}
	
	public void filterInputCVV() {
		filtros.writecvvx("//input[contains(@class,'entity_cvv')]");
	}
	
	public void filterInputDesc() {
		filtros.writedescx("//input[contains(@class,'entity_descriptor')]");
	}
	
	public void filterInputPort() {
		filtros.writeportx("//input[contains(@class,'entity_portador')]");
	}
	
	public void filterComboTipoDeVenda() {
		filtros.clickx("//div[contains(@class,'entity_SaleType')]");
	}
	
	public void waitToClickComboTipoDeVenda() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_SaleType')]");
	}
	
	public void filterComboOrigemTransacoesWeb() {
		filtros.clickx("//div[contains(@class,'entity_WebSourceTransaction')]");
	}
	
	public void waitToClickComboOrigemTransacoesWeb() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_WebSourceTransaction')]");
	}
	
	public void filterComboGrupoEstabelecimento() {
		filtros.clickx("//div[contains(@class,'entity_GroupEstablishmentKomerci')]");
	}
	
	public void waitToClickComboGrupoEstabelecimento() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_GroupEstablishmentKomerci')]");
	}
	
	public void filterComboGrupoBandeira() {
		filtros.clickx("//div[contains(@class,'entity_BrandGroup')]");
	}
	
	public void waitToClickComboGrupoBandeira() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_BrandGroup')]");
	}
	
	public void filterComboTipoParceiro() {
		filtros.clickx("//div[contains(@class,'entity_TypePartner')]");
	}
	
	public void waitToClickComboTipoParceiro() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_TypePartner')]");
	}
	
	public void filterComboTipoServico() {
		filtros.clickx("//div[contains(@class,'entity_TypeService')]");
	}
	
	public void waitToClickComboTipoServico() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_TypeService')]");
	}
	
	public void filterComboModoDeCaptura() {
		filtros.clickx("//div[contains(@class,'entity_EnterModeService')]");
	}
	
	public void waitToClickComboModoDeCaptura() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_EnterModeService')]");
	}
	
	public void filterComboModoDeEntrada() {
		filtros.clickx("//div[contains(@class,'entity_EnterMode')]");
	}
	
	public void waitToClickComboModoDeEntrada() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_EnterMode')]");
	}
	
	public void filterComboGrupoRamoAtividade() {
		filtros.clickx("//div[contains(@class,'entity_PrincipalBusiness')]");
	}
	
	public void waitToClickComboGrupoRamoAtividade() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_PrincipalBusiness')]");
	}
	
	public void filterComboTipoDeEmissor() {
		filtros.clickx("//div[contains(@class,'entity_IssuerType')]");
	}
	
	public void waitToClickComboTipoDeEmissor() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_IssuerType')]");
	}
	
	public void filterComboPiloto() {
		filtros.clickx("//div[contains(@class,'entity_Piloto')]");
	}
	
	public void waitToClickComboPiloto() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_Piloto')]");
	}
	
	public void filterComboTipoTransacao() {
		filtros.clickx("//div[contains(@class,'entity_TypeTransaction')]");
	}
	
	public void waitToClickComboTipoTransacao() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_TypeTransaction')]");
	}
	
	public void filterComboStatusTransacao() {
		filtros.clickx("//div[contains(@class,'entity_TransactionStatus')]");
	}
			
	public void waitToClickComboStatusTransacao() {
	filtros.waitingtoclickx("//div[contains(@class,'entity_TransactionStatus')]");
	}
	
	public void filterComboMeioDeCaptura() {
		filtros.clickx("//div[contains(@class,'entity_DeviceCapture')]");
	}
	
	public void waitToClickComboMeioDeCaptura() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_DeviceCapture')]");
	}
	
	public void filterComboCodEmpresaAdquirente() {
		filtros.clickx("//div[contains(@class,'entity_CompanyCodePurchasing')]");
	}
	
	public void waitToClickComboCodEmpresaAdquirente() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_CompanyCodePurchasing')]");
	}
	
	public void filterComboCodMotivoRedeExterna() {
		filtros.clickx("//div[contains(@class,'entity_ReasonCodeExternalNetwork')]");
	}
	
	public void waitToClickComboCodMotivoRedeExterna() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_ReasonCodeExternalNetwork')]");
	}
	
	public void filterComboSwitch() {
		filtros.clickx("//div[contains(@class,'entity_Switch')]");
	}
	
	public void waitToClickComboSwitch() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_Switch')]");
	}
	
	public void filterComboFrontEnd() {
		filtros.clickx("//div[contains(@class,'entity_Frontend')]");
	}
	
	public void waitToClickComboFrontEnd() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_Frontend')]");
	}
	
	public void filterComboCodServico() {
		filtros.clickx("//div[contains(@class,'entity_ServiceCode')]");
	}
	
	public void waitToClickComboCodServico() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_ServiceCode')]");
	}
	
	public void filterComboTransacoesTokenizadas() {
		filtros.clickx("//div[contains(@class,'entity_TokenTransaction')]");
	}
	
	public void waitToClickComboTransacoesTokenizadas() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_TokenTransaction')]");
	}
	
	public void filterComboQrCode() {
		filtros.clickx("//div[contains(@class,'entity_QrCode')]");
	}
	
	public void waitToClickComboQrCode() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_QrCode')]");
	}
	
	public void filterComboCodigoCarteira() {
		filtros.clickx("//div[contains(@class,'entity_Wallet')]");
	}
	
	public void waitToClickComboCodigoCarteira() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_Wallet')]");
	}
	
	public void filterComboSubModalidade() {
		filtros.clickx("//div[contains(@class,'entity_SubModality')]");
	}
	
	public void waitToClickComboSubModalidade() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_SubModality')]");
	}
	
	public void filterComboRegiao() {
		filtros.clickx("//div[contains(@class,'entity_Region')]");
	}
	
	public void waitToClickComboRegiao() {
		filtros.waitingtoclickx("//div[contains(@class,'entity_Region')]");
	}
	
	public void filterComboBandeira2() {
		filtros.clickx("//div[@class='ui-selectcheckboxmenu ui-widget ui-state-default ui-corner-all custom-sel-checkbox entity_Brand']");
	}
	
}
