package configuracoes.alarmes.sla;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import metodos.mir.Filtros;


public class SLACrud {
	
	private Filtros filtros;
	private WebDriver driver;


	@Before
	public void Inicializar() {
		driver = new ChromeDriver();
		filtros = new Filtros(driver);
		driver.get("https://192.168.80.18:8081/mir.console/pages/view/slaMilestone.jsf");
		// Login
		filtros.login2();
		// Entrar na tela
		filtros.waitingtoclick("frmList:dataTableSlaMilestone:0:deleteButton");
		//Verificar Errro ao entrar
		filtros.erroDesc("//span[text()='Ocorreu um erro desconhecido, consulte o administrador.']");
		}

	@After
	public void Encerramento() {
		filtros.erroDesc("//span[text()='Ocorreu um erro desconhecido, consulte o administrador.']");
		System.out.println("Sucess");
		driver.quit();
		}


	@Test
	public void Atualizar() {
	// Clicar no elemento
	filtros.clickx("//*[@id=\"frmList:dataTableSlaMilestone_data\"]/tr[1]/td[1]");
	filtros.waiting("dialogLoadbar");
	filtros.click("frmCadastro:j_idt79");
	filtros.clear("frmCadastro:j_idt79");
	filtros.write("frmCadastro:j_idt79", "Teste Auto");
	filtros.obteinValue("frmCadastro:j_idt79");
	// Atualizar
	filtros.click("frmCadastro:btnUpdate");
	filtros.waiting("dialogLoadbar");
	// Verificar se exibe mensagem
	filtros.waitingelementxpath("//span[text()='SLA alterado com sucesso']");
	}
	
	@Test
	public void SalvarRegras() {
	// Clicar no elemento
	filtros.click("frmCadastro:j_idt79");
	filtros.write("frmCadastro:j_idt79", "Teste");
	filtros.obteinValue("frmCadastro:j_idt79");
	// Salvar
	filtros.click("frmCadastro:btnSave");
	filtros.waiting("dialogLoadbar");
	// Verificar se exibe mensagem
	filtros.waitingelementxpath("//span[text()='O campo Prioridade é obrigatório.']");
	filtros.click("frmCadastro:j_idt84");
	filtros.write("frmCadastro:j_idt84", "4");
	filtros.obteinValue("frmCadastro:j_idt84");
	filtros.click("frmCadastro:j_idt89");
	// Salvar
	filtros.click("frmCadastro:btnSave");
	filtros.waiting("dialogLoadbar");
	// Verificar se exibe mensagem
	filtros.waitingelementxpath("//span[text()='O campo Cor é obrigatório.']");
	}
}