package pl.gornik.student;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int age;
    private String pesel;

    public Student(String name, String surname, int age, String pesel) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public int compareTo(Student s) {
        int result = getSurname().compareTo(s.getSurname());
        if(result != 0) return result;
        else return getName().compareTo(s.getName());

    }
    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Objects.equals(pesel, student.pesel);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(pesel);
//    }
}
