package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int sumAB = a + b;
        int sumCD = c + d;

        if (b > c
                && d > a
                && sumCD > sumAB
                && c > 0
                && d > 0
                && a % 2 == 0) {
            System.out.println("Valores aceitos");
        }
        else {
            System.out.println("Valores nao aceitos");

        }
    }
}














