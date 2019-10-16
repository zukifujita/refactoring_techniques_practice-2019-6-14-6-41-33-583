package com.tws.refactoring.extract_method;

import java.util.List;

public class OwingPrinter {
    public void printOwing(String name, List<Order> orders) {
        StringBuilder receipt = new StringBuilder();
        Double total = getTotal(orders);
        receipt.append("*****************************\n")
                .append("****** Customer totals ******\n")
                .append("*****************************\n")
                .append("name: " + name + "\n")
                .append("amount: " + total);
        System.out.print(receipt.toString());
    }

    private double getTotal(List<Order> orders) {
        Double totalAmount = 0.0;
        for (Order order : orders) {
            totalAmount += order.getAmount();
        }
        return totalAmount;
    }
}
