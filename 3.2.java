import java.io.*;
import java.util.Scanner;

class Universe {

    public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);
        long wiek = in.nextLong();
        String planeta =in.next();
        double wynik;
        switch(planeta) {
                case "Ziemia":wynik= ((double)wiek)/31557600.0; System.out.printf("%.2f",wynik); break;
                case "Merkury":wynik= (((double)wiek)/31557600.0)/0.2408467; System.out.printf("%.2f",wynik); break;
                case "Wenus":wynik= (((double)wiek)/31557600.0)/0.61519726 ;System.out.printf("%.2f",wynik); break;
                case "Mars":wynik= (((double)wiek)/31557600.0)/1.8808158 ;System.out.printf("%.2f",wynik); break;
                case "Jowisz":wynik= (((double)wiek)/31557600.0)/11.862615 ;System.out.printf("%.2f",wynik); break;
                case "Saturn":wynik= (((double)wiek)/31557600.0)/29.447498 ;System.out.printf("%.2f",wynik); break;
                case "Uran":wynik= (((double)wiek)/31557600.0)/84.016846 ;System.out.printf("%.2f",wynik); break;
                case "Neptun":wynik= (((double)wiek)/31557600.0)/164.79132; System.out.printf("%.2f",wynik); break;

        }
    }
}

