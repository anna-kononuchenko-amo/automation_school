package lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double commissionRate = 1.0;
        double exchangeRate = 36.55;

        CurrencyConverter converter = new CurrencyConverter(commissionRate, exchangeRate);

        System.out.print("Введіть суму в доларах для конвертації: ");
        double amountInUsd = scanner.nextDouble();

        double totalAmount = converter.calculateTotalAmount(amountInUsd);
        System.out.println("Сума до виплати: " + totalAmount + " грн");

        scanner.close();
    }
}
