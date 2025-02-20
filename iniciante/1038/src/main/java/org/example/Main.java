package org.example;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, BigDecimal> products = new HashMap<Integer, BigDecimal>();
        products.put(1, new BigDecimal( "4.00"));
        products.put(2, new BigDecimal("4.50"));
        products.put(3, new BigDecimal("5.00"));
        products.put(4, new BigDecimal("2.00"));
        products.put(5, new BigDecimal("1.50"));
        Scanner scanner = new Scanner(System.in);

        int code = scanner.nextInt();
        BigDecimal quantity = scanner.nextBigDecimal();

        double result = products.get(code).multiply(quantity).doubleValue();

        System.out.printf("Total: R$ %.2f%n", result);


    }
}