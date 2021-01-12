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
}
