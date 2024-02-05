package lesson13_pop_selenoid;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class YourInformationPage {
    private final SelenideElement firstNameField = $x("//*[@id=\"first-name\"]");
    private final SelenideElement lastNameField = $x("//*[@id=\"last-name\"]");
    private final SelenideElement postalCodeField = $x("//*[@id=\"postal-code\"]");
    private final SelenideElement continueButton = $x("//*[@id=\"continue\"]");

    public YourInformationPage setFirstName(String firstName) {
        firstNameField.setValue(firstName);
        return this;
    }

    public YourInformationPage setLastName(String lastName) {
        lastNameField.setValue(lastName);
        return this;
    }

    public YourInformationPage setPostalCode(String postalCode) {
        postalCodeField.setValue(postalCode);
        return this;
    }

    public YourInformationPage clickContinueButton() {
        continueButton.click();
        return this;
    }
}
