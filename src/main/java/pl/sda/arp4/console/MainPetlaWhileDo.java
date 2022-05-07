package pl.sda.arp4.console;

import java.util.Scanner;

public class MainPetlaWhileDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj poczatek zakresu");
        int początekZakresu = scanner.nextInt();
        System.out.println("Podaj koniec zakresu");
        int koniecZakresu = scanner.nextInt();

        for (int i = początekZakresu; i < koniecZakresu + 1; i++) {

        }
        System.out.println("Podaj dzielnik");
        int dzielnik= scanner.nextInt();
        for(int i=początekZakresu; i<koniecZakresu; i++){
            if((i%dzielnik==0)){
                System.out.println(i);
            }
        }

    }}

