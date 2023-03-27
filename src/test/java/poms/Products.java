package poms;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class Products extends PageObject {
    @FindBy(className = "title")
    public WebElementFacade title;
}
