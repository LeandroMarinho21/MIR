package principal.tipo.de.captura.visao.piloto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import metodos.mir.Filtros;
import metodos.mir.FiltrosPage;

public class FiltrosPiloto {

	private WebDriver driver;
	private FiltrosPage f;

	@Before
	public void Inicializar() {
		driver = new ChromeDriver();
		new Filtros(driver);
		f = new FiltrosPage(driver);
		f.getUrl("https://192.168.80.18:8081/mir.console/pages/view/viewpiloto.jsf");
		// Login
		f.loginLocal();
		// Filtro
		f.waitToClickFilter();
		// Verificar Errro ao entrar
		f.verifyError();
		f.clickFilter();
		f.loading();
		// Preencher Período
		f.waitToClickDate();
		f.clickDate();
		WebElement PeriodoIni = f.findDate();
		f.writeDate("08092020", PeriodoIni);
		}

	@After
	public void Encerramento() {
		// Consultar
		f.clickConsult();
		f.loading();
		// Verificar se possui dados
		f.verifyElementTable("listViewBTPilotoDTO:0:viewPiloto");
		// Verificar se ocorre erro
		f.verifyError();
		System.out.println("Sucess");
		f.finish();
		}
	
	/// Objetivo: Preencher os Combos
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestCombos1() {
		// Preencher primeiros combos
		f.filterComboEmissor();
		f.selectAll("//div[22]/div[1]/div[1]");
		f.waitToClickComboProduto();
		f.filterComboProduto();
		f.selectAll("//div[23]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o Campos dos 4 campos
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestCombos2() {
		// Preencher primeiros combos
		f.waitToClickComboTipoDeVenda();
		f.filterComboTipoDeVenda();
		f.selectAll("//div[25]/div[1]/div[1]");
		f.waitToClickComboMeioDeCaptura();
		f.filterComboMeioDeCaptura();
		f.selectAll("//div[26]/div[1]/div[1]");
		f.waitToClickComboModoDeEntrada();
		f.filterComboModoDeEntrada();
		f.selectAll("//div[27]/div[1]/div[1]");
		f.waitToClickComboGrupoRamoAtividade();
		f.filterComboGrupoRamoAtividade();
		f.selectAll("//div[28]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher os Combos
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestCombos3() {
		// Preencher primeiros combos
		f.waitToClickComboTipoDeEmissor();
		f.filterComboTipoDeEmissor();
		f.selectAll("//div[29]/div[1]/div[1]");
		f.waitToClickComboBandeiras();
		f.filterComboBandeiras();
		f.selectAll("//div[30]/div[1]/div[1]");
		f.waitToClickComboGrupoBandeira();
		f.filterComboGrupoBandeira();
		f.selectAll("//div[31]/div[1]/div[1]");
		f.waitToClickComboTipoTransacao();
		f.filterComboTipoTransacao();
		f.selectAll("//div[32]/div[1]/div[1]");
		f.waitToClickComboPiloto();
		f.filterComboPiloto();
		f.selectAll("//div[33]/div[1]/div[1]");
		}

}
