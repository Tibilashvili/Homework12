package com.lesson12;

public class Person {

    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name= " + name + '\'' +
                ", age= " + age +
                ", gender= " + gender + '\'' +
                '}';
    }




}
