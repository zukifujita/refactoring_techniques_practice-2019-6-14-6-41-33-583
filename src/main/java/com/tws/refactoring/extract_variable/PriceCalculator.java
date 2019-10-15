package com.tws.refactoring.extract_variable;

public class PriceCalculator {
    private double basePrice = 0d;
    private double discount = 0d;
    private double shippingCost = 0d;
    private double allExpenses = 0d;
    private double taxRate = 0.05;

    double getPrice(int quantity, int itemPrice) {
        basePrice = quantity * itemPrice;
        discount = Math.max(0, quantity - 500) * itemPrice * taxRate;
        shippingCost = Math.min(quantity * itemPrice * 0.1, 100.0);
        allExpenses = basePrice - discount + shippingCost;
        return allExpenses;
    }
}
