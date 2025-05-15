package task4.changeValueToReference;

public class Product {
    private String name;
    private double price;
    private Currency currency;

    public Product(String name, double price, String currencyCode) {
        this.name = name;
        this.price = price;
        this.currency = CurrencyFactory.getCurrency(currencyCode); // Використовуємо посилання
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrencyCode() {
        return currency.getCode();
    }

    public Currency getCurrency() {
        return currency;
    }
}
