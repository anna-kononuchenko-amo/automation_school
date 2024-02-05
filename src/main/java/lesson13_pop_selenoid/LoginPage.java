package lesson13_pop_selenoid;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final String loginPageLink = "https://www.saucedemo.com";
    private final SelenideElement userNameField = $("#user-name");
    private final SelenideElement passwordField = $("#password");
    private final SelenideElement loginButton = $("#login-button");

    public LoginPage loginPageOpen() {
        Selenide.open(loginPageLink);
        return this;
    }

    public LoginPage setLogin(String username) {
        userNameField.setValue(username);
        return this;
    }

    public LoginPage setPassword(String password) {
        passwordField.setValue(password);
        return this;
    }

    public LoginPage clickLoginButton() {
        loginButton.click();
        return this;
    }
}
