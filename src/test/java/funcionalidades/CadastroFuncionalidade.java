package funcionalidades;

import commons.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pages.CadastroPage;

public class CadastroFuncionalidade  extends BaseTest  {

    private  CommomFuncionalidade commomFuncionalidade = new CommomFuncionalidade();
    private CadastroPage cadastroPage = new CadastroPage(webDriver);
    private  String URL_SITE = "http://automationpractice.com/index.php";

    public void clicarNoBotao(String botao){
        switch (botao) {
            case "SignIn" -> wait.until(ExpectedConditions.elementToBeClickable(cadastroPage.getBotaoSignIn())).click();
            case "Create an Account" -> wait.until(ExpectedConditions.elementToBeClickable(cadastroPage.getBotaoCreateAnAccount())).click();
            case "Register" -> wait.until(ExpectedConditions.elementToBeClickable(cadastroPage.getBotaoRegister())).click();
        }
    }

    public void inserirNoCampoOValor(String campo, String valor){
        switch (campo) {
            case "Email Adress" -> wait.until(ExpectedConditions.elementToBeClickable(cadastroPage.getCampoEmailAdress())).sendKeys(valor);
            case "First name" -> wait.until(ExpectedConditions.elementToBeClickable(cadastroPage.getCampoFirstName())).sendKeys(valor);
            case "Last name" -> wait.until(ExpectedConditions.elementToBeClickable(cadastroPage.getCampoLastName())).sendKeys(valor);
            case "Password" -> wait.until(ExpectedConditions.elementToBeClickable(cadastroPage.getCampoPassword())).sendKeys(valor);
            case "City" -> wait.until(ExpectedConditions.elementToBeClickable(cadastroPage.getCampoCity())).sendKeys(valor);
            case "Zip/Postal Code" -> wait.until(ExpectedConditions.elementToBeClickable(cadastroPage.getCampoPostalCode())).sendKeys(valor);
            case "Mobile phone" -> wait.until(ExpectedConditions.elementToBeClickable(cadastroPage.getCampoMobilePhone())).sendKeys(valor);
            case "Assign an address alias for future reference" -> wait.until(ExpectedConditions.elementToBeClickable(cadastroPage.getCampoAssignAnAdress())).sendKeys(valor);
            case "Adress" -> wait.until(ExpectedConditions.elementToBeClickable(cadastroPage.getCampoAdress())).sendKeys(valor);
        }
    }

    public void selecionarOpcaoNoCampo(String opcao, String campo){
        switch (campo){
            case "State":
                if(opcao.compareTo("Kansas") == 0) {
                    WebElement element = cadastroPage.getSelectState();
                    Select combo = new Select(element);
                    combo.selectByVisibleText("Kansas");
                }
                break;
            case "Country":
                if(opcao.compareTo("United States") == 0) {
                    WebElement element = cadastroPage.getSelectCountry();
                    Select combo = new Select(element);
                    combo.selectByVisibleText("United States");
                }
                break;
        }
    }

    public void validarPagina(String pagina){
        switch (pagina) {
            case "My Account" -> Assert.assertTrue(cadastroPage.getCampoEmailAdress().isDisplayed());
        }
    }

    public void acessarUrl(){
       commomFuncionalidade.acessarUrl(URL_SITE);
    }
}

/*E clico no botão "SignIn"
      E insiro no campo "Email Adress" o valor "gabreuzinho@23.com"
      E clico no botão "Create an Account"
      E insiro no campo "First name" o valor "gabreuzinho"
      E insiro no campo "Last name" o valor "aaaaa"
      E insiro no campo "Password" o valor "12345"
      E insiro no campo "Adress" o valor "Algum lugar"
      E insiro no campo "City" o valor "Alguma Cidade"
      E seleciono a opção "Kansas" no campo "State"
      E insiro no campo "Zip/Postal Code" o valor "00000"
      E seleciona a opção "United States" no campo "Country"
      E insiro no campo "Mobile phone" o valor "11111111"
      E insiro no campo "Assign an address alias for future reference" o valor "gabriel"
      Quando clico no botão "Register"*/