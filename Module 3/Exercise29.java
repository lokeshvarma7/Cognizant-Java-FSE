// 29. Records (Java 16+)
record Person(String name, int age) {}

import java.util.*;
import java.util.stream.Collectors;

public class Exercise29 {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Lokesh", 19),
            new Person("Rahul", 25)
        );

        List<Person> adults = people.stream()
                                    .filter(p -> p.age() >= 21)
                                    .collect(Collectors.toList());

        System.out.println("Adults: " + adults);
    }
}