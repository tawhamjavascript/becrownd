package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();

        int moneyBackup = money;

        int notesOneHundred = money / 100;
        money = money % 100;

        int notesfifity = money / 50;
        money = money % 50;

        int notesTwenty = money / 20;
        money = money % 20;

        int notesTen = money / 10;
        money = money % 10;

        int notesFive = money / 5;
        money = money % 5;

        int notesTwo = money / 2;
        money = money % 2;

        int notesOne = money;
        money = 0;

        System.out.println(moneyBackup);
        System.out.println(notesOneHundred + " nota(s) de R$ 100,00");
        System.out.println(notesfifity + " nota(s) de R$ 50,00");
        System.out.println(notesTwenty + " nota(s) de R$ 20,00");
        System.out.println(notesTen + " nota(s) de R$ 10,00");
        System.out.println(notesFive + " nota(s) de R$ 5,00");
        System.out.println(notesTwo + " nota(s) de R$ 2,00");
        System.out.println(notesOne + " nota(s) de R$ 1,00");

    }
}




















