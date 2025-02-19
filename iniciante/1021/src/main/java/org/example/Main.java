package org.example;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigDecimal money = scanner.nextBigDecimal();
        int valueInt = money.intValue();
        money = money.subtract(new BigDecimal(valueInt));

        int notesOneHundred =  valueInt / 100;
        valueInt = valueInt % 100;

        int notesfifity =  valueInt / 50;
        valueInt = valueInt % 50;

        int notesTwenty = valueInt / 20;
        valueInt = valueInt % 20;

        int notesTen = valueInt / 10;
        valueInt = valueInt % 10;

        int notesFive = valueInt / 5;
        valueInt = valueInt % 5;

        int notesTwo = valueInt / 2;
        valueInt = valueInt % 2;

        int notesOne = valueInt;

        int coinsFifty = money.divide(new BigDecimal("0.50"), MathContext.DECIMAL32).intValue();
        money = money.remainder(new BigDecimal("0.50"));

        int coinsTwentyFive = money.divide(new BigDecimal("0.25"), MathContext.DECIMAL32).intValue();
        money = money.remainder(new BigDecimal("0.25"));

        int coinsTen = money.divide(new BigDecimal("0.10"), MathContext.DECIMAL32).intValue();
        money = money.remainder(new BigDecimal("0.10"));

        int coinsFive = money.divide(new BigDecimal("0.05"), MathContext.DECIMAL32).intValue();
        money = money.remainder(new BigDecimal("0.05"));

        int coinsOne = money.divide(new BigDecimal("0.01"), MathContext.DECIMAL32).intValue();


        System.out.println("NOTAS:");
        System.out.println(notesOneHundred + " nota(s) de R$ 100.00");
        System.out.println(notesfifity + " nota(s) de R$ 50.00");
        System.out.println(notesTwenty + " nota(s) de R$ 20.00");
        System.out.println(notesTen + " nota(s) de R$ 10.00");
        System.out.println(notesFive + " nota(s) de R$ 5.00");
        System.out.println(notesTwo + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(notesOne + " moeda(s) de R$ 1.00");
        System.out.println(coinsFifty + " moeda(s) de R$ 0.50");
        System.out.println(coinsTwentyFive + " moeda(s) de R$ 0.25");
        System.out.println(coinsTen + " moeda(s) de R$ 0.10");
        System.out.println(coinsFive + " moeda(s) de R$ 0.05");
        System.out.println(coinsOne + " moeda(s) de R$ 0.01");





    }
}