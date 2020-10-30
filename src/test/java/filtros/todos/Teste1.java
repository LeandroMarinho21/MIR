package filtros.todos;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import filtros.metodos.Filtros;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste1 extends Filtros {

	/// Objetivo: preencher todos os novos campos Pan Web,Cvv,Descriptor,Portador com parte do nome.
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreunenhum erro administrativo.

	@Test
	public void Test(){
		Teste1 t = new Teste1();
		String btnFilter = "/html/body/center/div[3]/form[1]/div[3]/div[1]/div/button[4]";
		String btnApply = "/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[1]/div/button[2]";
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		List<ViewBTDTO> links = t.getViews();
		t.login(driver, links.get(0).getUrl());
		for(ViewBTDTO obj : links){
			try{
				t.TestDiego(driver, obj.getUrl(), obj.getTable(), btnFilter, btnApply);
			} catch (Exception | AssertionError e){
				System.out.println(e);
			}
		}
	}

	public List<ViewBTDTO> getViews(){
		List<ViewBTDTO> test = new ArrayList<>();
		ViewBTDTO bt = new ViewBTDTO();
		bt.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewbtbrand.jsf");
		bt.setTable("treeViewBTBrandDTO_data");
		test.add(bt);
		ViewBTDTO bt2 = new ViewBTDTO();
		bt2.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewissuer.jsf");
		bt2.setTable("listViewBTIssuerDTO_data");
		test.add(bt2);
		ViewBTDTO bt3 = new ViewBTDTO();
		bt3.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewproduct.jsf");
		bt3.setTable("treeViewBTSubProductDTO_data");
		test.add(bt3);
		ViewBTDTO bt4 = new ViewBTDTO();
		bt4.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewprivatelabel.jsf");
		bt4.setTable("listViewBTSubProductDTO_data");
		test.add(bt4);
		ViewBTDTO bt5 = new ViewBTDTO();
		bt5.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewnet.jsf");
		bt5.setTable("listViewBTNetDTO_data");
		test.add(bt5);
		return test;
	}

	public void login(WebDriver driver, String link){
		driver.get(link);
		click(driver, "details-button");
		click(driver, "proceed-link");
		waitingtoclick(driver, "formLogin:txtUsuario");
		click(driver, "formLogin:txtUsuario");
		escreverlogin(driver, "formLogin:txtUsuario");
		escreversenhaenter(driver, "formLogin:txtPassword");
	}

	public void TestDiego(WebDriver driver, String link, String table, String btnFilter, String btnApply){
		if(driver.getCurrentUrl()!=link)
			driver.get(link);
		// Filtro
		waitingtoclickx(driver, "/html/body/center/div[3]/form[1]/div[3]/div[1]/div/button[1]");
			clickx(driver, btnFilter);
		// Preencher Periodo
		waitingtoclickx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[1]/input");
		//Desflaga o Agrupamento por bandeiras quando é tela de visão emissor
		if(link=="https://192.168.80.18:8081/mir.console/pages/view/viewissuer.jsf"){
			clickx(driver, "/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[2]/div");
		}
		writeperiod1x(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[1]/input");
		clickx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[2]/input");
		writeperiod2x(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[2]/input");
		// Preencher novos campos
		writepanx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[5]/div[1]/div/input");
		writecvvx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[5]/div[2]/div/input");
		writedescx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[5]/div[3]/div/input");
		writeportx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[5]/div[4]/div/input");
		// Consultar
		clickx(driver, btnApply);
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		notequalsid(driver, table);
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
	}
}
