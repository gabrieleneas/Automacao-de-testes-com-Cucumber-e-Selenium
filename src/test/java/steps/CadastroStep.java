package steps;

import funcionalidades.CadastroFuncionalidade;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

public class CadastroStep {

    CadastroFuncionalidade cadastroFuncionalidade = new CadastroFuncionalidade();

    @Dado("que estou na pagina inicial do site")
    public void queEstouNaPaginaInicialDoSite() {
        cadastroFuncionalidade.acessarUrl();
    }

    @E("clico no botão {string}")
    public void clicoNoBotao(String botao) {
        cadastroFuncionalidade.clicarNoBotao(botao);
    }

    @E("insiro no campo {string} o valor {string}")
    public void insiroNoCampoOValor(String campo, String valor) {
        cadastroFuncionalidade.inserirNoCampoOValor(campo, valor);
    }

    @E("seleciono a opção {string} no campo {string}")
    public void selecionoAOpcaoNoCampo(String opcao, String campo) {
        cadastroFuncionalidade.selecionarOpcaoNoCampo(opcao, campo);
    }

    @E("seleciona a opção {string} no campo {string}")
    public void selecionaAOpcaoNoCampo(String opcao, String campo) {
        cadastroFuncionalidade.selecionarOpcaoNoCampo(opcao, campo);
    }

    @Então("vizualizo a pagina {string}")
    public void vizualizoAPagina(String nomePagina) throws InterruptedException {
        cadastroFuncionalidade.validarPagina(nomePagina);
    }
}
