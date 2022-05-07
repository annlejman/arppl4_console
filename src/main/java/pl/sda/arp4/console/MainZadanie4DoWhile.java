package pl.sda.arp4.console;

import java.util.Scanner;

public class MainZadanie4DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj poczatek zakresu");
        int początekZakresu = scanner.nextInt();
        System.out.println("Podaj koniec zakresu");
        int koniecZakresu = scanner.nextInt();
        if(początekZakresu>koniecZakresu){
            System.out.println("Błędne dane, petla się nie wykona");


        }
        System.out.println("Podaj dzielnik");
        int dzielnik= scanner.nextInt();
        int i= początekZakresu;
        do{
            if(i%dzielnik==0){
                System.out.println(i);
            }
            i++;

        }while (i<koniecZakresu+1);

    }}

