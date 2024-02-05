package lesson13_pop_selenoid;

import com.codeborne.selenide.SelenideElement;

import java.util.concurrent.locks.Condition;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class CompletePage {
    private final String completePageLink = "https://www.saucedemo.com/checkout-complete.html";
    private final SelenideElement completeHeader = $x("//*[@id=\"checkout_complete_container\"]/h2");

    public CompletePage checkCompletePageOpen() {
        webdriver().shouldHave(url(completePageLink));
        return this;
    }

    public CompletePage checkCompleteHealer() {
        completeHeader.shouldHave(text("Thank you for your order!"));
        return this;
    }
}
