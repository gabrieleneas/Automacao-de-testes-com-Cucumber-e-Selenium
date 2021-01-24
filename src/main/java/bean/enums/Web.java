package bean.enums;

import bean.interfaces.WebApplication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public enum Web implements WebApplication {

    FIREFOX {
        @Override
        public WebDriver getDriver() {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            return new FirefoxDriver();
        }
    },

    ;
}

