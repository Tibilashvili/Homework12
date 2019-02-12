package com.lesson12;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Coach Bob", 27, "M");

        Student student = new Student("Lynne Brooke", 16, "F", "student id: HS95129", 3.5);

        Teacher teacher = new Teacher("Duke Java", 34, "M", 50000, "Computer Science");

        CollegeStudent collegeStudent = new CollegeStudent("Ima Frosh", 18, "F", "student id: UCB123", 4.0, 1, "English");

       Person[] persons = {person, student, teacher, collegeStudent};

        for (int i = 0; i < persons.length; i++){
            System.out.println(persons[i]);
        }



    }
}
