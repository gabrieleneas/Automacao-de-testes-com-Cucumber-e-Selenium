package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroPage {

    public CadastroPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='header_user_info']//a")
    private WebElement botaoSignIn;

    @FindBy(id = "SubmitCreate")
    private WebElement botaoCreateAnAccount;

    @FindBy(id = "submitAccount")
    private WebElement botaoRegister;

    @FindBy(id = "email_create")
    private WebElement campoEmailAdress;

    @FindBy(id = "customer_firstname")
    private WebElement campoFirstName;

    @FindBy(id = "customer_lastname")
    private WebElement campoLastName;

    @FindBy(id = "passwd")
    private WebElement campoPassword;

    @FindBy(id = "address1")
    private WebElement campoAdress;

    @FindBy(id = "city")
    private WebElement campoCity;

    @FindBy(id = "id_state")
    private WebElement selectState;

    @FindBy(id = "postcode")
    private WebElement campoPostalCode;

    @FindBy(id = "id_country")
    private WebElement selectCountry;

    @FindBy(id = "phone_mobile")
    private WebElement campoMobilePhone;

    @FindBy(id = "alias")
    private WebElement campoAssignAnAdress;

    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    private WebElement elementMyAccount;


    public WebElement getBotaoSignIn() {
        return botaoSignIn;
    }

    public WebElement getBotaoCreateAnAccount() {
        return botaoCreateAnAccount;
    }

    public WebElement getBotaoRegister() {
        return botaoRegister;
    }

    public WebElement getCampoEmailAdress() {
        return campoEmailAdress;
    }

    public WebElement getCampoFirstName() {
        return campoFirstName;
    }

    public WebElement getCampoLastName() {
        return campoLastName;
    }

    public WebElement getCampoPassword() {
        return campoPassword;
    }

    public WebElement getCampoAdress() {
        return campoAdress;
    }

    public WebElement getCampoCity() {
        return campoCity;
    }

    public WebElement getSelectState() {
        return selectState;
    }

    public WebElement getCampoPostalCode() {
        return campoPostalCode;
    }

    public WebElement getSelectCountry() {
        return selectCountry;
    }

    public WebElement getCampoMobilePhone() {
        return campoMobilePhone;
    }

    public WebElement getCampoAssignAnAdress() {
        return campoAssignAnAdress;
    }

    public WebElement getElementMyAccount() {
        return elementMyAccount;
    }
}
