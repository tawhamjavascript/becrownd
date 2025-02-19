package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int years = days / 365;
        int months = (days % 365) / 30;
        int remainingDays = (days % 365) % 30;
        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(remainingDays + " dia(s)");
    }
}