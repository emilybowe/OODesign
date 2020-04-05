package com.OODesign;
enum Currency {USD, EURO;
public double conversionRateTo(Currency target){return 1.0;}
}
public class Money {
    private double value;
    private Currency currency;
    public Money(double value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }
    private double normalized() {
        return currency == Currency.USD
                ? value
                : value * currency.conversionRateTo(Currency.USD);
    }
    public boolean isGreaterThan(Money amount) {
        return (normalized() > amount.normalized());
    }
}
class Test {
    private static void dispenseFunds (Money amount) {}
    public static void test() {
        Money balance = new Money(1.0, Currency.USD);
        Money request = new Money(3.0, Currency.EURO);
        if(balance.isGreaterThan(request)) {
            dispenseFunds(request);
        }
    }
}