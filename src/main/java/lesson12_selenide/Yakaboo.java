package lesson12_selenide;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class Yakaboo {
    @Test
    public void searchBook() {

        String bookName = "Маленький принц";
        /*
        Маленький принц - паперова
        Острів скарбів - електронна
        Сяйво свідомого я - нема в наявності
        */

        open("https://www.yakaboo.ua/");
        $x("//input[@type='search']").setValue(bookName);

        if ($x("//div[@class='cl-widget-f8519v8519']").shouldBe(visible).isDisplayed()) {
            $x("//div[@class='cl-dialog-close-icon']").click();
        }

        $x("//div[@class='ui-search-form-input']//button[@class='ui-btn-primary']").click();
        $x("//div[@class='category-card category-layout expanded'][1]").click();

        SelenideElement statusElement = $x("//section[@class='side']//div[@class='ui-shipment-status available']");
        if (statusElement.exists() && statusElement.getText().contains("В наявності")) {
            String paperBookPrice = $x("//section[@class='side']//div[@class='ui-price-display__main']").getText();
            System.out.println("Ціна паперової книги: " + paperBookPrice);
            return;
        }

        SelenideElement statusElement1 = $x("//section[@class='side']//div[@class='status__format']");
        if (statusElement1.exists() && statusElement1.getText().contains("Електронна книга")) {
            String ebookPrice = $x("//div[@class='side__box']//div[@class='ui-price-display__main']").getText();
            System.out.println("Ціна електронної книги: " + ebookPrice);
            return;
        }

        System.out.println("Паперової та електронної книги нема в наявності");
    }
}
