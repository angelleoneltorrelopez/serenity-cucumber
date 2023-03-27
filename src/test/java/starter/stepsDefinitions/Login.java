package starter.stepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.steps.UIInteractions;
import org.assertj.core.api.WithAssertions;
import poms.Products;

public class Login extends UIInteractions implements WithAssertions {
    poms.Login login;
    Products products;

    @Given("I am on the sign-in page")
    public void i_am_on_the_sign_in_page() {
        openUrl("https://www.saucedemo.com/");
    }
    @Given("I enter my valid credentials")
    public void i_enter_my_valid_credentials() {
        login.inputUser.sendKeys("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLoginButton();
    }
    @Then("I should see the homepage of my account")
    public void i_should_see_the_homepage_of_my_account() {
        assertThat(products.title.getText()).isEqualTo("Products");
    }
    @When("I enter invalid credentials")
    public void i_enter_invalid_credentials() {
        login.inputUser.sendKeys("standard_user");
        login.enterPassword("secret_saucesdfsdfd");
        login.clickLoginButton();
    }
    @Then("I should see an error message indicating that the credentials are incorrect")
    public void i_should_see_an_error_message_indicating_that_the_credentials_are_incorrect() {
        assertThat(login.messageError.getText()).isEqualTo("Epic sadface: Username and password do not match any user in this service");
    }
    @Given("my account is locked")
    public void my_account_is_locked() {
        openUrl("https://www.saucedemo.com/");
    }
    @When("I attempt to sign in with my valid credentials")
    public void i_attempt_to_sign_in_with_my_valid_credentials() {
        login.inputUser.sendKeys("locked_out_user");
        login.enterPassword("secret_sauce");
        login.clickLoginButton();
    }
    @Then("I should see an error message indicating that my account is locked")
    public void i_should_see_an_error_message_indicating_that_my_account_is_locked() {
        assertThat(login.messageError.getText()).isEqualTo("Epic sadface: Sorry, this user has been locked out.");
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
