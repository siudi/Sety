package pl.gornik;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst");

        String text = scanner.nextLine();
        Set<Character> uniqueChars = new HashSet<>();
        Set<Character> uniqueChars1 = new HashSet<>();

        for(Character character : text.toCharArray()){
            if(Character.isLetter(character)) {
                uniqueChars.add(character);
            }
        }
        for (int i = 0; i < text.length(); i++) {
            uniqueChars1.add(text.charAt(i));
        }

        System.out.println("Unikalne znaki");
        for(Character char1 : uniqueChars) System.out.print(char1 + " ");
        System.out.println("\n==============================");
        for(Character char1 : uniqueChars1) System.out.print(char1 + " ");
    }
}
