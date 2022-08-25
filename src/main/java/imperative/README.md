### Imperative approach

```java
 List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (Person.Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        for (Person female : females) {
            System.out.println(female);
        }
```

### Declarative approach

```java
List<Person> female2 = people.stream().
                filter(person -> Person.Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList());
        female2.forEach(System.out::println);
```

