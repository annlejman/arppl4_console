import java.util.Scanner;

public class MainPetlaDoWhile {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba= scanner.nextInt();

        do {
            liczba--;

        }while (liczba>0);
        }
    }

