package poms;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Products extends PageObject {
    @FindBy(className = "title")
    public WebElement title;
}
