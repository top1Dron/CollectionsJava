package ComparableSort;

import java.util.Comparator;
import java.util.TreeSet;

public class TestComparator {
    public static void main(String[] args) {
        Comparator<PersonWithAge> personName = (name1, name2) -> name1.getName().compareTo(name2.getName());
        Comparator<PersonWithAge> personAge = (age1, age2) -> age1.getAge() - age2.getAge();
        Comparator<PersonWithAge> pcomp = personName.thenComparing(personAge);

        TreeSet<PersonWithAge> people = new TreeSet<>(pcomp);
        people.add(new PersonWithAge("Tom", 11));
        people.add(new PersonWithAge("Tom", 23));
        people.add(new PersonWithAge("Nick",34));
        people.add(new PersonWithAge("Tom",11));
        people.add(new PersonWithAge("Bill",14));

        for(PersonWithAge  p : people){

            System.out.println(p.getName() + " " + p.getAge());
        }
    }
}

class PersonWithAge{

    private String name;
    private int age;
    public PersonWithAge(String name, int age){

        this.name=name;
        this.age=age;
    }
    String getName(){return name;}
    int getAge(){return age;}
}
