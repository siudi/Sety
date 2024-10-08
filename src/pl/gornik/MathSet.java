package pl.gornik;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MathSet {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>(Arrays.asList(3,1,9,7,5,11));
        System.out.println(setA);
        Set<Integer> setB = new HashSet<>(Arrays.asList(2,3,4,6,7,8,12));
        System.out.println(setB);

        Set<Integer> setAsumB = new HashSet<>(setA);
        setAsumB.addAll(setB);
        System.out.println(setAsumB);

        Set<Integer> setAsubstractB = new HashSet<>(setA);
        setAsubstractB.removeAll(setB);
        System.out.println(setAsubstractB);

        Set<Integer> setAmultiplayB = new HashSet<>(setA);
        setAmultiplayB.retainAll(setB);
        System.out.println(setAmultiplayB);

        Set<Integer> sortedSetA = new TreeSet<>(setA);
        System.out.println(sortedSetA);
    }
}
