package lesson3;

public class CurrencyConverter {
    private double commission;
    private double exchangeRate;

    public CurrencyConverter(double commission, double exchangeRate) {
        this.commission = commission;
        this.exchangeRate = exchangeRate;
    }

    private double convertUsdToUah(double amountInUsd) {
        return amountInUsd * exchangeRate;
    }

    private double calculateCommission(double amountInUsd) {
        return amountInUsd * commission / 100.0;
    }

    public double calculateTotalAmount(double amountInUsd) {
        double amountInUah = convertUsdToUah(amountInUsd);
        double commissionAmount = calculateCommission(amountInUsd);
        return amountInUah + commissionAmount;
    }
}
