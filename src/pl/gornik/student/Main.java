package pl.gornik.student;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //sposób 1
//        Set<Student> students = new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                int result = s1.getSurname().compareTo(s2.getSurname());
//                if(result != 0) return result;
//                else return s1.getAge() - s2.getAge();
//
//            }
//        });
//        Set<Student> students = new TreeSet<>(new ComparatorByAgeThenByPesel()); //sposób 2

        //sposób 3 - klasa student
        Set<Student> students = new TreeSet<>();
        students.add(new Student("Jan","Kowalski",33,"98648901236"));
        students.add(new Student("Mirek","Nowak",25,"912374890121"));
        students.add(new Student("Radosław","Brzęczyszkiewicz",33,"99988908971"));
        students.add(new Student("Ali","Cali",21,"98648901236"));

        for(Student student : students) System.out.println(student);
    }
}
