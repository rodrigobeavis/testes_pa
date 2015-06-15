package Unaideas.teste_jbehave;

import org.junit.Test;

import br.gov.frameworkdemoiselle.behave.controller.BehaveContext;

public class MyTest {

	private BehaveContext eng = null;

	public MyTest() {
		eng = BehaveContext.getInstance();
		eng.addSteps(new MySteps());
	}

	@Test
	public void testAllStories() throws Throwable {
		eng.run("/stories");
	}

}
