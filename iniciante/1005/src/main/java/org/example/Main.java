package org.example;

    import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        a = a * 3.5;
        b = b * 7.5;

        double resultado = (a + b) / (3.5 + 7.5);

        System.out.printf("MEDIA = %.5f", resultado);
        System.out.println();
    }
}