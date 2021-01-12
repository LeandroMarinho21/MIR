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
	private Filtros filtros;
	private FiltrosPage f;

	@Before
	public void Inicializar() {
		driver = new ChromeDriver();
		filtros = new Filtros(driver);
		f = new FiltrosPage(driver);
		f.getUrl("https://192.168.80.18:8081/mir.console/pages/view/viewpiloto.jsf");
		// Login
		f.loginPrivate();
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
		filtros.clickx("//div[contains(@class,'entity_Issuer')]");
		filtros.clickx("//div[22]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_Product')]");
		filtros.clickx("//div[contains(@class,'entity_Product')]");
		filtros.clickx("//div[23]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher o Campos dos 4 campos
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestCombos2() {
		// Preencher primeiros combos
		filtros.waitingtoclickx("//div[contains(@class,'entity_SaleType')]");
		filtros.clickx("//div[contains(@class,'entity_SaleType')]");
		filtros.clickx("//div[25]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_DeviceCapture')]");
		filtros.clickx("//div[contains(@class,'entity_DeviceCapture')]");
		filtros.clickx("//div[26]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_EnterMode')]");
		filtros.clickx("//div[contains(@class,'entity_EnterMode')]");
		filtros.clickx("//div[27]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_PrincipalBusiness')]");
		filtros.clickx("//div[contains(@class,'entity_PrincipalBusiness')]");
		filtros.clickx("//div[28]/div[1]/div[1]");
		}
	
	/// Objetivo: Preencher os Combos
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	
	@Test
	public void TestCombos3() {
		// Preencher primeiros combos
		filtros.waitingtoclickx("//div[contains(@class,'entity_IssuerType')]");
		filtros.clickx("//div[contains(@class,'entity_IssuerType')]");
		filtros.clickx("//div[29]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_Brand')]");
		filtros.clickx("//div[contains(@class,'entity_Brand')]");
		filtros.clickx("//div[30]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_BrandGroup')]");
		filtros.clickx("//div[contains(@class,'entity_BrandGroup')]");
		filtros.clickx("//div[31]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_TypeTransaction')]");
		filtros.clickx("//div[contains(@class,'entity_TypeTransaction')]");
		filtros.clickx("//div[32]/div[1]/div[1]");
		filtros.waitingtoclickx("//div[contains(@class,'entity_Piloto')]");
		filtros.clickx("//div[contains(@class,'entity_Piloto')]");
		filtros.clickx("//div[33]/div[1]/div[1]");
		}

}
