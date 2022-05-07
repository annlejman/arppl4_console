package pl.sda.arp4.console;

import java.util.Scanner;

public class MainZadanie2DoWhile {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int liczba;
        do{
        System.out.println("Podaj liczbę");
        liczba= scanner.nextInt();

            System.out.println("Hello World");

            if (liczba>0){
                break;
            }




        }while (liczba>0);
    }
}

