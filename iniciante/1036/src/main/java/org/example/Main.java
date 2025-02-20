package org.example;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Scanner;

import static java.math.RoundingMode.HALF_UP;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal a = scanner.nextBigDecimal();
        BigDecimal b = scanner.nextBigDecimal();
        BigDecimal c = scanner.nextBigDecimal();

        BigDecimal resultFirstEquationSquareRoot = b.pow(2);
        BigDecimal resultSecondEquationSquareRoot = a
                .multiply(c)
                .multiply(new BigDecimal(4));

        if (a.doubleValue() == 0
                || resultFirstEquationSquareRoot.doubleValue() < resultSecondEquationSquareRoot.doubleValue()) {
            System.out.println("Impossivel calcular");
        }
        else {
            b = b.negate();
            BigDecimal resultOfSquareRoot = resultFirstEquationSquareRoot
                    .subtract(resultSecondEquationSquareRoot)
                    .sqrt(new MathContext(32, HALF_UP));

            BigDecimal firstEquationR1 = b.add(resultOfSquareRoot);
            double R1 = firstEquationR1.divide(
                    a.multiply(new BigDecimal(2)), new MathContext(32, HALF_UP))
                    .doubleValue();

            BigDecimal firstEquationR2 = b.subtract(resultOfSquareRoot);
            double R2 = firstEquationR2.divide(
                    a.multiply(new BigDecimal(2)), new MathContext(32, HALF_UP))
                    .doubleValue();

            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }
    }
}