package pl.lublin.wsei.java.cwiczenia;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import static pl.lublin.wsei.java.cwiczenia.Zad7h.tabelka;

public class Main {
    //Punkt 3b

    /**
     * Dodanie dwoch liczb
     *
     * @param num1  pierwsza liczba
     * @param num2  druga liczba
     * @return suma dwóch liczb
     */

    public int add(int num1, int num2) {
        return this.add(1,2);
    }
    public static void main(String[] args) {

        // to jest komentarz jednolinikjowy
        /* to jest
            komentarz
            wielolinikjowy
        */

        //Punkt 4
//        System.out.println("Hello Java world");

        //Punkt 7a
//        System.out.print("Ala");
//        System.out.print("ma");
//        System.out.print("kota");

        //Punkt 7b
//        System.out.println("Ala");
//        System.out.println("ma");
//        System.out.println("kota");

        //Punkt 7c
//        System.out.print("Ala\n");
//        System.out.print("ma\n");
//        System.out.print("kota\n");

        //Punkt 7d
//        int a = 2;
//        double b = 1.99;
//        String c = "Wojciech";
//        System.out.printf("a = %d, b = %f, c = %s %n", a,b,c);


        //Punkt 7e
//        int a = 3;
//        float b = 4.21f;
//        String s = "jakiś tekst";
//
//        System.out.printf("a = %d, b = %.2f, s = %20s %n", a, b, s);

        //Punkt 7g
//        System.out.printf("Nazwaliśmy to \"witaminą B3\" \n");

        //Punkt 7g
//        System.out.printf("alfa\tsin(alfa)\n");
//        for (int i = 0; i < 370; i += 10)
//            System.out.printf("%d\t%f\t\n", i, Math.sin(i / 360.0 * 2 * Math.PI));

        //Punkt 7h
        //tabelka(10);
        //to jest wywolanie zadania 7h, odkomentować zeby dzialalo

        //Punkt 8
//        Scanner input = new Scanner(System.in);
//        int num1, num2;
//        System.out.print("Podaj pierwszą liczbę: ");
//        num1 = input.nextInt();
//        System.out.print("Podaj drugą liczbę: ");
//        num2 = input.nextInt();
//        System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);

        //Punkt 9
//        Scanner input = new Scanner(System.in);
//        int num1=0, num2=0;
//        do {
//
//            System.out.print("Podaj pierwszą liczbę: ");
//             num1 = input.nextInt();
//            if (num1 == 0) break;
//                System.out.print("Podaj druga liczbę: ");
//                num2 = input.nextInt();
//                if (num1 == 0) break;
//
//            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
//        } while (true);

        //Punkt 9e
//        Scanner input = new Scanner(System.in);
//        int num1 = 0, num2 = 0;
//        do {
//            System.out.print("Podaj liczbę którą mam dodać: ");
//            num1 = input.nextInt();
//            num2 = input.nextInt();
//            if ((num1 == 0) || (num2 == 0)) break;
//            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
//        } while (true);

        //Punkt 10b

//    Scanner input = new Scanner(System.in);
//    int num;
//    System.out.print("Podaj liczbę: ");
//    num = input.nextInt();
//        System.out.println("DEC = " +num);
//        System.out.println("BIN = " +Integer.toBinaryString(num));
//        System.out.println("HEX = " +Integer.toHexString(num));


        //Punkt 10c

//        Scanner input = new Scanner(System.in);
//        System.out.printf("Podaj liczbę: ");
//        int num;
//        num = input.nextInt();
//        String Bin, Hex;
//        Bin = Integer.toBinaryString(num);
//        Hex = Integer.toHexString(num);
//        String numBin, numHex;
//        numBin = leftPad(Bin, '0', 8);
//        numHex = leftPad(Hex, '0', 4);
//        System.out.println("DEC = " +num+ "\nBIN = " +numBin+ "\nHEX = %"+numHex);

        //Punkt 10d
//        Scanner input = new Scanner(System.in);
//        System.out.printf("Podaj liczbę: ");
//        int num;
//        num = input.nextInt();
//        String Bin, Hex;
//        Bin = Integer.toBinaryString(num);
//        Hex = Integer.toHexString(num);
//        String numBin, numHex;
//        numBin = leftPad(Bin, '0', 8).toUpperCase();
//        numHex = leftPad(Hex, '0', 4).toUpperCase();
//        System.out.println("DEC = " +num+ "\nBIN = " +numBin+ "\nHEX = %"+numHex);

        //Punkt 11
        int[] liczby = new int[30];
        Random rnd = new Random();

        for (int i = 0; i < 30; i++)
            liczby[i] = rnd.nextInt();

        int mx = Integer.MIN_VALUE;
        int mn = Integer.MIN_VALUE;
        long avg = 0;
        for(int l : liczby){
            System.out.println(l);
            if (1 < mn) mn = 1;
            if (1 > mx) mx = 1;
            avg += 1;
        }
        System.out.printf("Min = %d, MAX = %d, AVG = %f", mn, mx, (float)avg/liczby.length);
    }
        //Do punktu 10 c-f)
//        private static String leftPad(String aText,char aChar, int aWidth){
//            String res = aText;
//            for (int i = 0; i < aWidth - aText.length(); i++)
//                res = aChar + res;
//            return res;


        }






