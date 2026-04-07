package com.softserve.edu13time;

import java.util.Arrays;
import java.util.Comparator;

class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\n\tPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static int compareByName(Person a, Person b) {
        return a.name.compareTo(b.name);
    }

    public static int compareByAge(Person a, Person b) {
        return a.age.compareTo(b.age);
    }
}


public class Main {

    public static void main(String[] args) {
        Person[] persons = {new Person("Ivan", 34),
                new Person("Vasyl", 29),
                new Person("Olga", 26),
                new Person("Anna", 41)};
        //1
        Arrays.sort(persons, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("sort Comparator<Person>() = " + Arrays.toString(persons));
        //2
        Arrays.sort(persons, (p1, p2) -> Person.compareByName(p1, p2));
        System.out.println("sort lambda = " + Arrays.toString(persons));
        //System.out.println();
        //3
        Arrays.sort(persons, Person::compareByAge);
        System.out.println("Person::compareByAge = " + Arrays.toString(persons));

    }
}
