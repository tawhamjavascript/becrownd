package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double salary = scanner.nextDouble();
        double sellProduct = scanner.nextDouble();

        double result = salary + (sellProduct * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", result);

    }
}