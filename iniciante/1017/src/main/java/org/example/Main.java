package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int velocity = scanner.nextInt();

        int distance = hours * velocity;

        double litters = (double) distance / 12;

        System.out.printf("%.3f%n", litters);


    }
}