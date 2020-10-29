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
			WebDriver driver = new ChromeDriver();
			List<ViewBTDTO> test = new ArrayList<ViewBTDTO>(); 
			ViewBTDTO BT = new ViewBTDTO();
			BT.setUrl("https://192.168.80.18:8081/mir.console/pages/view/viewbtbrand.jsf");
			BT.setTable("treeViewBTBrandDTO_data");
			test.add(BT);
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
			click(driver, "bntSearch");
			// Preencher Periodo
			waitingtoclickx(driver,
					"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[1]/input");
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
			click(driver, "btnSearch1");
			waiting(driver, "dialogLoadbar");
			// Verificar se possui dados
			notequalsid(driver, test.get(0).getTable());
			// Verificar se ocorre erro
			erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
			driver.quit();
		}
}
