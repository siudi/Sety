package pl.gornik;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zakres liczb to 1-10");
        System.out.println("Podaj kolejno 5 liczb z tego zakresu");
        Set<Integer> userNumbers = new HashSet<>();
        Set<Integer> numbers = new HashSet<>();
        for(int i = 0; i < 5; i++) {
            userNumbers.add(scanner.nextInt());
        }
        System.out.println("Twoje liczby " + userNumbers);
        for (int i = 1; i <= 20 ; i++) {
          numbers.add(i);
        }
        System.out.println("Wszysrtkie liczby" + userNumbers);




    }
}
