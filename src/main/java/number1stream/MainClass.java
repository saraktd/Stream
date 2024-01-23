package number1stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Alice", 25, "Female", "New York", "Software Engineer"),
                new Person("Bob", 30, "Male", "London", "Accountant"),
                new Person("Charlie", 35, "Male", "San Francisco", "Doctor"),
                new Person("David", 40, "Male", "Paris", "Lawyer"),
                new Person("Eve", 45, "Female", "Tokyo", "Architect"),
                new Person("Frank", 28, "Male", "London", "Teacher"),
                new Person("Grace", 38, "Female", "New York", "Data Scientist"),
                new Person("Henry", 32, "Male", "San Francisco", "Engineer"),
                new Person("Ivy", 42, "Female", "Paris", "Artist"),
                new Person("Jack", 50, "Male", "Tokyo", "Businessman"));


        List<String> femalesName = people.stream()
                .filter(person -> person.getGender().equals("female"))
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println(femalesName);

        OptionalDouble average = OptionalDouble.of(people.stream()
                .filter(person -> person.getCity().equals("london"))
                .mapToInt(Person::getAge)
                .average()
                .orElse(0));
        System.out.println(average.getAsDouble());

        List<String> collect = people.stream()
                .filter(person -> person.getAge() > 35)
                .map(Person::getOccupation)
                .collect(Collectors.toList());
        System.out.println(collect);

        List<String> collect1 = people.stream()
                .limit(2)
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println(collect1);

        List<Person> teacher = people.stream()
                .filter(person -> person.getOccupation()
                        .equals("Teacher"))
                .collect(Collectors.toList());
        System.out.println(teacher);

        int oldestAge = people.stream()
                .mapToInt(Person::getAge)
                .max()
                .orElse(0);
        System.out.println(oldestAge);

        List<String> paris = people.stream()
                .filter(person -> person.getCity().equals("paris"))
                .map(Person::getName)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(paris);

        List<Person> mail = people.stream()
                .filter(person -> person.getGender().equals("mail"))
                .collect(Collectors.toList());
        System.out.println(mail);

        double london = people.stream()
                .filter(person -> person.getCity().equals("london"))
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
        System.out.println(london);

        List<String> collect2 = people.stream()
                .filter(person -> person.getAge() >= 30 && person.getAge() <= 40)
                .map(Person::getName).toList();
        System.out.println(collect2);

        boolean b = people.stream()
                .allMatch(person -> person.getCity() != null);
        System.out.println(b);

        boolean y = people.stream()
                .allMatch(person -> person.getName().endsWith("y"));
        System.out.println("y");

        int i = people.stream()
                .filter(person -> person.getAge() < 40)
                .mapToInt(Person::getAge)
                .max()
                .orElse(0);
        System.out.println(i);

        List<String> a = people.stream()
                .filter(person -> person.getName().equals("A"))
                .map(Person::getOccupation)
                .collect(Collectors.toList());
        System.out.println(a);

        String collect3 = people.stream()
                .map(Person::getCity)
                .distinct()
                .collect(Collectors.joining());
        System.out.println(collect3);


    }
}