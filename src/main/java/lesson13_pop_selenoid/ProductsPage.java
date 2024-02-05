package lesson13_pop_selenoid;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class ProductsPage {
    private final String productsPageLink = "https://www.saucedemo.com/inventory.html";
    private final String price1 = "7.99";
    private final String price2 = "9.99";
    private final SelenideElement addToCardButtonPrice1 = $x("//*[@id=\"add-to-cart-sauce-labs-onesie\"]");
    private final SelenideElement addToCardButtonPrice2 = $x("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
    private final SelenideElement cardBadge = $x("//span[@class='shopping_cart_badge']");
    private final SelenideElement cardIcon = $x("//a[@class='shopping_cart_link']");

    public ProductsPage checkProductsPageOpen() {
        webdriver().shouldHave(url(productsPageLink));
        return this;
    }

    public String getPrice1() {
        return price1;
    }

    public String getPrice2() {
        return price2;
    }

    public ProductsPage clickToCardButtonPrice1() {
        addToCardButtonPrice1.click();
        return this;
    }

    public ProductsPage clickToCardButtonPrice2() {
        addToCardButtonPrice2.click();
        return this;
    }

    public ProductsPage checkProductsAdding() {
        cardBadge.shouldHave(visible);
        return this;
    }

    public ProductsPage clickCardIcon() {
        cardIcon.click();
        return this;
    }
}
