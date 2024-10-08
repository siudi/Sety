package pl.gornik;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz kolejne słowa\nAby wyjść z programu wpisz 'Q' ");
        Set<String> uniqueWords = new HashSet<>();
        String word = "";
        do{
            word = scanner.nextLine();
            uniqueWords.add(word);
        } while (!word.equalsIgnoreCase("Q"));

        for(String word1 : uniqueWords){
            System.out.println(word1 + ", ");
        }
    }
}