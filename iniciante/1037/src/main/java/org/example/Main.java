package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        if (a < 0 || a > 100) {
            System.out.println("Fora de intervalo");
        }
        else {
            if (a <= 25) {
                System.out.println("Intervalo [0,25]");
            }
            else if (a <= 50) {
                System.out.println("Intervalo (25,50]");
            }
            else if (a <= 75) {
                System.out.println("Intervalo (50,75]");
            }
            else {
                System.out.println("Intervalo (75,100]");
            }
        }
    }
}