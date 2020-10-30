package filtros.todos;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import filtros.metodos.Filtros;

public class Teste1 extends Filtros {

	/// Objetivo: preencher todos os novos campos Pan Web,Cvv,Descriptor,Portador com parte do nome.
		/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreunenhum erro administrativo.
		@Test
		public void Test() {
			List<ViewBTDTO> test = new ArrayList<ViewBTDTO>(); 
			ViewBTDTO bt = new ViewBTDTO();
			ViewBTDTO bt2 = new ViewBTDTO();
			ViewBTDTO bt3 = new ViewBTDTO();
			ViewBTDTO bt4 = new ViewBTDTO();
			ViewBTDTO bt5 = new ViewBTDTO();
			ViewBTDTO bt6 = new ViewBTDTO();
			bt.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewbtbrand.jsf");
			bt.setTable("treeViewBTBrandDTO_data");
			bt2.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewissuer.jsf");
			bt2.setTable("listViewBTIssuerDTO_data");
			bt3.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewproduct.jsf");
			bt3.setTable("treeViewBTSubProductDTO_data");
			bt4.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewprivatelabel.jsf");
			bt4.setTable("listViewBTSubProductDTO_data");
			bt5.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewnet.jsf");
			bt5.setTable("listViewBTNetDTO_data");
			bt6.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewgraphic.jsf");
			bt6.setTable("tblTransactionsDay_data");
			test.add(bt);
			test.add(bt2);
			test.add(bt3);
			test.add(bt4);
			test.add(bt5);
			test.add(bt6);
			
			for ( ViewBTDTO obj : test){
				WebDriver driver = new ChromeDriver();
				driver.get(test.get(0).getUrl());
				// driver.get("https://10.59.184.60/mir.console/pages/view/viewbtbrand.jsf");
				// Erro de Privacidade
				click(driver, "details-button");
				click(driver, "proceed-link");
				waitingtoclick(driver, "formLogin:txtUsuario");
				// Login
				click(driver, "formLogin:txtUsuario");
				escreverlogin(driver, "formLogin:txtUsuario");
				escreversenhaenter(driver, "formLogin:txtPassword");
				// Filtro
				waitingtoclick(driver, "bntSearch");
				if(test.get(0).getUrl()=="https://192.168.80.18:8081/mir.console/pages/view/viewproduct.jsf"||
			       test.get(0).getUrl()=="https://192.168.80.18:8081/mir.console/pages/view/viewgraphic.jsf"){
					clickx(driver, "bntSearch1");
				} else if((test.get(0).getUrl()=="https://192.168.80.18:8081/mir.console/pages/view/viewissuer.jsf")) { 
					click(driver, "bntFilter1");
				} else if((test.get(0).getUrl()=="https://192.168.80.18:8081/mir.console/pages/view/viewprivatelabel.jsf")) { 
					click(driver, "btnFilter1");
				}else
					click(driver, "bntSearch");
				// Preencher Periodo
				waitingtoclickx(driver,
						"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[1]/input");
				//Desflaga o Agrupamento por bandeiras quando é tela de visão emissor
				if(test.get(0).getUrl()=="https://192.168.80.18:8081/mir.console/pages/view/viewissuer.jsf"){
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
				if(test.get(0).getUrl()=="https://192.168.80.18:8081/mir.console/pages/view/viewproduct.jsf"||
				   test.get(0).getUrl()=="https://192.168.80.18:8081/mir.console/pages/view/viewgraphic.jsf"){
					clickx(driver, "btnSearch2");
				} else if((test.get(0).getUrl()=="https://192.168.80.18:8081/mir.console/pages/view/viewissuer.jsf")) { 
					click(driver, "btnFilter2");
				}else
					click(driver, "btnSearch1");
				waiting(driver, "dialogLoadbar");
				// Verificar se possui dados
				notequalsid(driver, test.get(0).getTable());
				// Verificar se ocorre erro
				erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
				driver.quit();
				}

		}
}
