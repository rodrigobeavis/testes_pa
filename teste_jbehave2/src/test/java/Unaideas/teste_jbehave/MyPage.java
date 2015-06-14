package Unaideas.teste_jbehave;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;
import br.gov.frameworkdemoiselle.behave.runner.ui.TextField;


@ScreenMap(name = "cadastro de professor", location = "http://localhost:8080/unaideasphp/cadastro_professor.php")
public class MyPage {

	
	@ElementMap(name = "nome usuario", locatorType = ElementLocatorType.Id, locator = "nome_professor")
	private TextField nome_investidor;
	
	@ElementMap(name = "matricula", locatorType = ElementLocatorType.Id, locator = "mat_professor")
	private TextField mat_professor;
	
	@ElementMap(name = "E-mail", locatorType = ElementLocatorType.Id, locator = "email_professor")
	private TextField email_professor;
	
	@ElementMap(name = "Telefone", locatorType = ElementLocatorType.Id, locator = "telefone_professor")
	private TextField telefone_professor;
	

	@ElementMap(name = "Login", locatorType = ElementLocatorType.Id, locator = "user_name")
	private TextField user_name;

	@ElementMap(name = "Senha", locatorType = ElementLocatorType.Id, locator = "keyu")
	private TextField keyu;
	
	@ElementMap(name = "Confirme a senha", locatorType = ElementLocatorType.Id, locator = "keyu2")
	private TextField keyu2;
	
	@ElementMap(name = "Cancelar", locatorType = ElementLocatorType.Id, locator = "cancelar")
	private Button cancelar;

}
