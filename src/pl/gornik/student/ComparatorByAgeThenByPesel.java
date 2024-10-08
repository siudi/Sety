package pl.gornik.student;

import java.util.Comparator;

public class ComparatorByAgeThenByPesel implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int result = s1.getAge() - s2.getAge();
        if(result != 0 ) return result;
        else return s1.getPesel().compareTo(s2.getPesel());
    }
}
