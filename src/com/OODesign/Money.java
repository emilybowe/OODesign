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


}
class Test {
    private static void dispenseFunds (Money amount) {}
    public static void test() {
        Money balance = new Money(1.0, Currency.USD);
        Money request = new Money(3.0, Currency.EURO);

        double normalizedBalance = balance.getValue() *
                balance.getCurrency()
                        .conversionRateTo(Currency.USD);
        double normalizedRequest = request.getValue() *
                request.getCurrency()
                        .conversionRateTo(Currency.USD);
        if(normalizedBalance > normalizedRequest) {
            dispenseFunds(request);
        }
    }
}