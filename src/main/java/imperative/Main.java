package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
        new Person("Ahmed", Person.Gender.MALE),
        new Person("Shahd", Person.Gender.FEMALE),
        new Person("Jana", Person.Gender.FEMALE),
        new Person("Sarah", Person.Gender.FEMALE),
        new Person("Yesmaine", Person.Gender.FEMALE));

        System.out.println("Imperative approach");
        System.out.println("------------------------------------");
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (Person.Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        for (Person female : females) {
            System.out.println(female);
        }
        System.out.println("_______________________________________");

        System.out.println();
        System.out.println("Declarative approach");
        System.out.println("_______________________________________");

        List<Person> female2 = people.stream().
                filter(person -> Person.Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList());
        female2.forEach(System.out::println);
    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        enum Gender {
            MALE,
            FEMALE
        }
    }
}