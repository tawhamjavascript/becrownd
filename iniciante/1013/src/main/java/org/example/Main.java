package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int biggest = (a + b + Math.abs(a - b)) / 2;
        biggest = (biggest + c + Math.abs(biggest - c)) / 2;
        System.out.println(biggest + " eh o maior");

    }
}