package org.example;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        BigDecimal a = scanner.nextBigDecimal();
//        BigDecimal b = scanner.nextBigDecimal();
//        BigDecimal c = scanner.nextBigDecimal();
//        BigDecimal d = scanner.nextBigDecimal();
//
//        BigDecimal media = a
//                .multiply(new BigDecimal(2))
//                .add(b
//                        .multiply(new BigDecimal(3)))
//                .add(c
//                        .multiply(new BigDecimal(4)))
//                .add(d
//                        .multiply(new BigDecimal(1)))
//                .divide(new BigDecimal(10), new MathContext(32, RoundingMode.HALF_EVEN));
//
//        System.out.printf("Media: %.1f%n", media);
//        if (media.doubleValue() >= 7) {
//            System.out.println("Aluno aprovado.");
//        }
//        else if (media.doubleValue() < 5) {
//            System.out.println("Aluno reprovado.");
//        }
//        else {
//            System.out.println("Aluno em exame.");
//            scanner.nextLine();
//            BigDecimal e = scanner.nextBigDecimal();
//
//            System.out.printf("Nota do exame: %.1f%n", e);
//
//            BigDecimal finalAverage = media
//                    .add(e)
//                    .divide(new BigDecimal(2), new MathContext(32, RoundingMode.HALF_DOWN));
//
//            if (finalAverage.doubleValue() >= 5) {
//                System.out.println("Aluno aprovado.");
//            }
//            else {
//                System.out.println("Aluno reprovado.");
//            }
//            System.out.printf("Media final: %.1f%n", finalAverage);
//        }


        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        double media = (a * 2 + b * 3 + c * 4 + d * 1) / 10;

        System.out.printf("Media: %.1f%n", media);
        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        }
        else if (media < 5) {
            System.out.println("Aluno reprovado.");
        }
        else {
            System.out.println("Aluno em exame.");
            scanner.nextLine();
            double e = scanner.nextDouble();

            System.out.printf("Nota do exame: %.1f%n", e);

            double finalAverage = (media + e) / 2;

            if (finalAverage >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", finalAverage);
        }
    }
}