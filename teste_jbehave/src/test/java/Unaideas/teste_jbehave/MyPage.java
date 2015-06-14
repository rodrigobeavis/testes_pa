package Unaideas.teste_jbehave;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;
import br.gov.frameworkdemoiselle.behave.runner.ui.TextField;

//@ScreenMap(name = "Tela de Busca", location = "http://www.unaideas.com.br")
@ScreenMap(name = "Tela de Busca", location = "http://localhost:8080/unaideasphp/")
public class MyPage {

	@ElementMap(name = "Estou com sorte", locatorType = ElementLocatorType.Id, locator = "modal_call_login")
	private Button buttonLuckSearch;

	
	@ElementMap(name = "Campo de Busca", locatorType = ElementLocatorType.Name, locator = "btnK")
	private TextField searchField;

//	@ElementMap(name = "Estou com sorte", locatorType = ElementLocatorType.Name, locator = "btnI")
//	private Button buttonLuckSearch;

}
