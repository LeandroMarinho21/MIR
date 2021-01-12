package configuracoes.alarmes.sla;

import org.openqa.selenium.WebDriver;

public class SLACrudPage {
	private MetodosSLA metodos;
	
	public SLACrudPage(WebDriver driver) {
		metodos = new MetodosSLA(driver);
	}

	public void acessarUrl() {
		metodos.driver.get("https://192.168.80.18:8081/mir.console/pages/view/slaMilestone.jsf");
	}
	public void logar() {
		metodos.login();
	}
	
	public void aguardarParaClicar() {
		metodos.waitingtoclick("frmList:dataTableSlaMilestone:0:deleteButton");
	}
	
	public void verificarErro() {
		metodos.erroDesc("//span[text()='Ocorreu um erro desconhecido, consulte o administrador.']");
	}
	public void encerrar() {
		metodos.driver.quit();
	}
	public void selecionarElementoTabela() {
		metodos.clickx("//*[@id=\"frmList:dataTableSlaMilestone_data\"]/tr[1]/td[1]");
	}
	public void carregando() {
		metodos.waiting("dialogLoadbar");
	}
	public void clicarCampoNome() {
		metodos.click("frmCadastro:j_idt79");
	}
	public void clicarCampoPrioridade() {
		metodos.click("frmCadastro:j_idt84");
	}
	
	public void clicarBotaoSalvar() {
		metodos.click("frmCadastro:btnSave");
	}
	
	public void limparCampoNome() {
		metodos.clear("frmCadastro:j_idt79");
	}
	
	public void clicarBotaoUpdate( ) {
		metodos.click("frmCadastro:btnUpdate");
	}
	
	public void escreverCampoNome(String escrita) {
		metodos.write("frmCadastro:j_idt79", escrita);
	}
	
	public void escreverCampoPrioridade(String escrita) {
		metodos.write("frmCadastro:j_idt84", escrita);
	}
	
	public String obterNome() {
		return metodos.obteinValue("frmCadastro:j_idt79");
	}
	public String obterPrioridade() {
		return metodos.obteinValue("frmCadastro:j_idt84");
	}
	
	public void obterMensagemAlterado() {
		metodos.waitingelementxpath("//span[text()='SLA alterado com sucesso']");
	}
	public void obterMensagemPrioridadeObrigatorio() {
		metodos.waitingelementxpath("//span[text()='O campo Prioridade é obrigatório.']");
	}
	public void obterMensagemCorObrigatorio() {
	metodos.waitingelementxpath("//span[text()='O campo Cor é obrigatório.']");
	}
}
