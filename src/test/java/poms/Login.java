package poms;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class Login extends PageObject {
    @FindBy(id = "user-name")
    public WebElementFacade inputUser;

    @FindBy(id = "password")
    public WebElementFacade inputPassword;

    @FindBy(id = "login-button")
    public WebElementFacade buttonLogin;

    @FindBy(tagName = "h3")
    public WebElementFacade messageError;

    public void enterUsername(String username){
        inputUser.sendKeys(username);
    }

    public void enterPassword(String password){
        inputPassword.sendKeys(password);
    }

    public void clickLoginButton(){
        buttonLogin.click();
    }
}
