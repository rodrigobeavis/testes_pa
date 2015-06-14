package Unaideas.teste_jbehave;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;
import br.gov.frameworkdemoiselle.behave.runner.ui.TextField;


@ScreenMap(name = "cadastro de usuario", location = "http://localhost:8080/unaideasphp/cadastro_investidor.php")
public class MyPage {

	
	@ElementMap(name = "nome usuario", locatorType = ElementLocatorType.Id, locator = "nome_investidor")
	private TextField nome_investidor;
	
	@ElementMap(name = "RG", locatorType = ElementLocatorType.Id, locator = "rg")
	private TextField rg;
	
	@ElementMap(name = "E-mail", locatorType = ElementLocatorType.Id, locator = "email")
	private TextField email;
	
	@ElementMap(name = "Telefone", locatorType = ElementLocatorType.Id, locator = "tel")
	private TextField tel;
	

	@ElementMap(name = "Login", locatorType = ElementLocatorType.Id, locator = "user_name")
	private TextField user_name;

	@ElementMap(name = "Senha", locatorType = ElementLocatorType.Id, locator = "keyu")
	private TextField keyu;
	
	@ElementMap(name = "Confirme a senha", locatorType = ElementLocatorType.Id, locator = "keyu2")
	private TextField keyu2;
	
	@ElementMap(name = "Cancelar", locatorType = ElementLocatorType.Id, locator = "cancelar")
	private Button cancelar;

}
