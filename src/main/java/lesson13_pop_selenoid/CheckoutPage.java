package lesson13_pop_selenoid;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class CheckoutPage {
    private final String checkoutPageLink = "https://www.saucedemo.com/checkout-step-two.html";
    private final SelenideElement subtotalString = $x("//div[@class='summary_subtotal_label']");
    private final SelenideElement taxString = $x("//div[@class='summary_tax_label']");
    private final SelenideElement finishButton = $x("//*[@id=\"finish\"]");

    public CheckoutPage checkCheckoutPageOpen() {
        webdriver().shouldHave(url(checkoutPageLink));
        return this;
    }

    public Double calculateTaxPercent() {
        Double subtotal = Double.valueOf(subtotalString.getText().substring(subtotalString.getText().indexOf("$") + 1));
        Double tax = Double.valueOf(taxString.getText().substring(taxString.getText().indexOf("$") + 1));
        Double taxPercent = (double) Math.round(tax * 100 / subtotal);
        return taxPercent;
    }

    public CheckoutPage clickFinishButton() {
        finishButton.click();
        return this;
    }
}
