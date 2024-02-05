package lesson13_pop_selenoid;

import org.testng.annotations.Test;

public class Main {
    private final LoginPage loginPage = new LoginPage();
    private final ProductsPage productsPage = new ProductsPage();
    private final CardPage cardPage = new CardPage();
    private final YourInformationPage yourInformationPage = new YourInformationPage();
    private final CheckoutPage checkoutPage = new CheckoutPage();
    private final CompletePage completePage = new CompletePage();


    @Test
    public void successfulLogin() {
        loginPage.loginPageOpen()
                .setLogin("standard_user")
                .setPassword("secret_sauce")
                .clickLoginButton();
        productsPage.checkProductsPageOpen();
    }

    @Test (dependsOnMethods = "successfulLogin")
    public void addingToCard() {
        productsPage.clickToCardButtonPrice1()
                    .clickToCardButtonPrice2()
                    .checkProductsAdding();
    }

    @Test(dependsOnMethods = "addingToCard")
    public void itemsCheck() {
        productsPage.clickCardIcon();
        cardPage.checkItemPrice1(productsPage.getPrice1())
                .checkItemPrice2(productsPage.getPrice2())
                .clickCheckoutButton();

    }

    @Test(dependsOnMethods = "itemsCheck")
    public void setInformation() {
        yourInformationPage.setFirstName("Anna")
                .setLastName("Kononuchenko")
                .setPostalCode("01001")
                .clickContinueButton();
        checkoutPage.checkCheckoutPageOpen();
    }

    @Test(dependsOnMethods = "setInformation")
    public void getTaxPercent() {
        System.out.println("Tax percent is " + checkoutPage.calculateTaxPercent() + "%");
        checkoutPage.clickFinishButton();
        completePage.checkCompletePageOpen();
    }

    @Test(dependsOnMethods = "getTaxPercent")
    public void checkCompleteText() {
        completePage.checkCompleteHealer();
    }
}
