package funcionalidades;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;

public class CommomFuncionalidade extends BaseTest {


    public void acessarUrl(String site){
        webDriver.navigate().to(site);
    }
}
