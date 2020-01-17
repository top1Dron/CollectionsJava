package ComparableSort;

import java.util.Comparator;
import java.util.TreeSet;

public class TestComparable {
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>();
        people.add(new Person("Tom"));
        people.add(new Person("Som"));
        for (Person p: people
             ) {
            System.out.println(p.getName());
        }

//        Comparator<Person> pcomp = (a, b) -> a.getName().compareTo(b.getName());
        Comparator<Person> pcomp = Comparator.comparing(Person::getName);
        people = new TreeSet<Person>(pcomp);
        people.add(new Person("Tom"));
        people.add(new Person("Nick"));
        people.add(new Person("Alice"));
        people.add(new Person("Tom"));
        people.add(new Person("Bill"));
        for(Person  p : people){

            System.out.println(p.getName());
        }
    }
}

class Person implements Comparable<Person> {

    private String name;
    Person(String name){

        this.name=name;
    }
    String getName(){return name;}

    @Override
    public int compareTo(Person p) {
        return name.compareTo(p.getName());
    }
}
