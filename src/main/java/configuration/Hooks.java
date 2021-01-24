package configuration;

import commons.BaseTest;
import bean.enums.Web;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseTest {
    @Before(value = "@web")
    public void beforeScenarioWeb() {
        this.inicializeBrowser();
    }

    @After(value = "@web")
    public void afterScenarioWeb(Scenario scenario) throws Exception {
        //super.generateEvidence(scenario);
        closeWeb();
    }

    private void inicializeBrowser(){
        try {
            initializeWebApplication(Web.FIREFOX);
        }catch (IllegalStateException e){
           e.printStackTrace();
        }
    }
}
