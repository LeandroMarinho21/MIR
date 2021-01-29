package configuracoes.alarmes.sla;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SLACrud {
	
	
	private WebDriver driver;
	private SLACrudPage sla;
	
	@Before
	public void Inicializar() {
		driver = new ChromeDriver();
		new MetodosSLA(driver);
		sla = new SLACrudPage(driver);
		sla.acessarUrl();
		// Login
		sla.logar();
		// Entrar na tela
		sla.aguardarParaClicar();
		//Verificar Errro ao entrar
		sla.verificarErro();
		}

	@After
	public void Encerramento() {
		sla.verificarErro();
		System.out.println("Sucess");
		sla.encerrar();
		}
	
	@Test
	public void Atualizar() {
	// Clicar no elemento
	sla.selecionarElementoTabela();
	sla.carregando();
	sla.clicarCampoNome();
	sla.limparCampoNome();
	sla.escreverCampoNome("Teste Auto");
	sla.obterNome();
	// Atualizar
	sla.clicarBotaoUpdate();
	sla.carregando();
	// Verificar se exibe mensagem
	sla.obterMensagemAlterado();
	}
	
	@Test
	public void SalvarRegras() {
	// Clicar no elemento
	sla.clicarCampoNome();
	sla.escreverCampoNome("Teste");
	sla.obterNome();
	// Salvar
	sla.clicarBotaoSalvar();
	sla.carregando();
	// Verificar se exibe mensagem
	sla.obterMensagemPrioridadeObrigatorio();
	sla.clicarCampoPrioridade();
	sla.escreverCampoPrioridade("4");
	sla.obterPrioridade();
	// Salvar
	sla.clicarBotaoSalvar();
	sla.carregando();
	// Verificar se exibe mensagem
	sla.obterMensagemCorObrigatorio();
	}

}
