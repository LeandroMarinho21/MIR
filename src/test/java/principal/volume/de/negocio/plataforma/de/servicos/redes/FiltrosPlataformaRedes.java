package principal.volume.de.negocio.plataforma.de.servicos.redes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import metodos.mir.Filtros;
import metodos.mir.FiltrosPage;

public class FiltrosPlataformaRedes {
	
	private WebDriver driver;
	private FiltrosPage f;

	@Before
	public void Inicializar() {
		driver = new ChromeDriver();
		new Filtros(driver);
		f = new FiltrosPage(driver);
		f.getUrl("https://192.168.80.18:8081/mir.console/dashboard/service/deviceCapture.jsf");
		// Login
		f.loginPrivate();
		// Filtro
		f.waitToClickFilter();
		// Verificar Errro ao entrar
		f.verifyError();
		f.clickFilter();
		f.loading();
		}

	@After
	public void Encerramento() {
		// Consultar
		f.clickConsult();
		f.loading();
		// Verificar se possui dados
		f.verifyElementTable("listViewDTO:0:deviceCaptureTpDesc");
		// Verificar se ocorre erro
		f.verifyError();
		System.out.println("Sucess");
		f.finish();
		}
	
	/********* Objetivo: Selecionar todas as opções dos Combos ************/
	/********* Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo. ************/
	
	@Test
	public void TestCombos1() {
		// Preencher primeiros combos
		f.filterComboTipoParceiro();
		f.selectAll("//div[10]/div[1]/div[1]");
		f.waitToClickComboTipoServico();
		f.filterComboTipoServico();
		f.selectAll("//div[11]/div[1]/div[1]");
		}
	
	/********* Objetivo: Selecionar todas as opções dos Combos ************/
	/********* Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo. ************/
	
	@Test
	public void TestCombos2() {
		// Preencher primeiros combos
		f.waitToClickComboModoDeCaptura();
		f.filterComboModoDeCaptura();
		f.selectAll("//div[12]/div[1]/div[1]");
		f.waitToClickComboTipoTransacao();
		f.filterComboTipoTransacao();
		f.selectAll("//div[13]/div[1]/div[1]");
		}
	
	/********* Objetivo: Selecionar todas as opções dos Combos ************/
	/********* Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo. ************/
	
	@Test
	public void TestCombos3() {
		// Preencher primeiros combos
		f.waitToClickComboStatusTransacao();
		f.filterComboStatusTransacao();
		f.selectAll("//div[14]/div[1]/div[1]");
		f.waitToClickComboMeioDeCaptura();
		f.filterComboMeioDeCaptura();
		f.selectAll("//div[15]/div[1]/div[1]");
		}
}



