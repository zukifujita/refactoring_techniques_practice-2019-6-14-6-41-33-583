package com.tws.refactoring.extract_variable;

public class PriceCalculator {
    private double basePrice = 0d;
    private double discount = 0d;
    private double shippingCost = 0d;
    private double allExpenses = 0d;

    double getPrice(int quantity, int itemPrice) {
        // Price consists of: base price - discount + shipping cost
        basePrice = quantity * itemPrice;
        discount = Math.max(0, quantity - 500) * itemPrice * 0.05;
        shippingCost = Math.min(quantity * itemPrice * 0.1, 100.0);
        allExpenses = basePrice - discount + shippingCost;
        return allExpenses;
    }
}
