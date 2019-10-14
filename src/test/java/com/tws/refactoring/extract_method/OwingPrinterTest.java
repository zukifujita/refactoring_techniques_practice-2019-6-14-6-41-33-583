package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printOwing() {
        OwingPrinter printOwing = new OwingPrinter();
        Order order = new Order(10.0);
        List<Order> orders = new ArrayList<>();
        orders.add(order);

        printOwing.printOwing("Sample", orders);
        StringBuilder expected = new StringBuilder();
        expected.append("*****************************\n")
                .append("****** Customer totals ******\n")
                .append("*****************************\n")
                .append("name: Sample\n")
                .append("amount: 10.0");

        assertEquals(expected.toString(), outContent.toString());
    }
}