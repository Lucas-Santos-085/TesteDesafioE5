package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import fabricas.Propriedades;
import pages.PageE5B;
import suporte.Driver;
import suporte.Generator;
import suporte.Screenshot;

public class DesafioE5 extends Driver {

	@Rule
	public TestName test = new TestName();

	private PageE5B page = new PageE5B();

	public void print(String nomeComplementar) {
		Screenshot.tirar(getDriver(), "C:\\Users\\Lucas\\Documents\\SELENIUM\\target\\screenshot\\"
				+ test.getMethodName() + nomeComplementar + Generator.dataHoraParaArquivo() + ".png");
	}

	@Test
	public void cadastrarLogin() {

		page.inserirUsername("lhdsant");
		page.repetirUsername("lhdsant");
		page.inserirSenha("123456");
		page.repetirSenha("123456");

		print("teste");

		page.clicarEnviar();

	}

	@Test
	public void cadastrarLoginComErro() {
		page.inserirUsername("lhdsant");
		page.repetirUsername("lhds");
		page.inserirSenha("123456");
		page.repetirSenha("123456");
		page.clicarEnviar();

		Assert.assertEquals("Os campos não tem o mesmo valor!", page.obterMensagemErro());

		print("erro");

	}

}
