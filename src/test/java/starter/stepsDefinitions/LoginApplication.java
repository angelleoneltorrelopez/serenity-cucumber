package starter.stepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.steps.UIInteractions;
import org.assertj.core.api.WithAssertions;
import poms.Login;
import poms.Products;

public class LoginApplication extends UIInteractions implements WithAssertions {
    Login login;
    Products products;

    @Given("User navigate to the Swag Labs page")
    public void user_navigate_to_the_swag_labs_page() {
        openUrl("https://www.saucedemo.com/");
    }
    @Given("User enter the username as {string}")
    public void user_enter_the_username_as(String string) {
        login.inputUser.sendKeys(string);
    }
    @Given("User enter the password as {string}")
    public void user_enter_the_password_as(String string) {
        login.enterPassword(string);
    }
    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        login.clickLoginButton();
    }
    @Then("Login should be success")
    public void login_should_be_success() {
        assertThat(products.title.getText()).isEqualTo("Products");
    }
    @Then("Login should fail")
    public void login_should_fail() {
        assertThat(login.messageError.getText()).isEqualTo("Epic sadface: Username and password do not match any user in this service");
    }

    @Given("Joe is a new customer")
    public void joe_is_a_new_customer() {
    }
    @Given("Joe is considered a low risk customer")
    public void joe_is_considered_a_low_risk_customer() {
    }
    @When("he is onboarded")
    public void he_is_onboarded() {
    }
    @Then("his account should be scheduled for review in {int} months time")
    public void his_account_should_be_scheduled_for_review_in_months_time(Integer int1) {
    }
}
