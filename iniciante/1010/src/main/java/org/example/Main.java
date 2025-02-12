package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        for (int i = 0; i < 2; i++) {
            int productCode = scanner.nextInt();
            int amount  = scanner.nextInt();
            double price = scanner.nextDouble();

            result += amount * price;
        }
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", result);
    }
}