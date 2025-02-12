package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a  = scanner.nextDouble() * 2;
        double b = scanner.nextDouble() * 3;
        double c = scanner.nextDouble() * 5;

        double result = (a + b + c) / 10;

        System.out.printf("MEDIA = %.1f", result);
        System.out.println();

    }
}