package lesson13_pop_selenoid;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CardPage {
    private final SelenideElement itemPrice1 = $x("(//div[@class='inventory_item_price']) [1]");
    private final SelenideElement itemPrice2 = $x("(//div[@class='inventory_item_price']) [2]");
    private final SelenideElement checkoutButton = $x("//*[@id=\"checkout\"]");

    public CardPage checkItemPrice1(String price1) {
        itemPrice1.shouldHave(Condition.partialText(price1));
        return this;
    }

    public CardPage checkItemPrice2(String price2) {
        itemPrice2.shouldHave(Condition.partialText(price2));
        return this;
    }

    public CardPage clickCheckoutButton() {
        checkoutButton.click();
        return this;
    }
}
