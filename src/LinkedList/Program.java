package LinkedList;

import java.util.LinkedList;

public class Program {
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<>();

        //add number of elements to the list
        states.add("Germany");
        states.add("France");
        states.addLast("Great Britain"); //to list end
        states.addFirst("Spain"); //to list beginning
        states.add(1, "Italy"); // add element on the second position in the list

        System.out.printf("List has %d elements \n", states.size());
        System.out.println(states.get(1)); // get element from the list from the second position

        states.set(1, "Portugal");
        for (String state : states
             ) {
            System.out.println(state);
        }

        //checking on containing Germany in the list
        if(states.contains("Germany")){
            System.out.println("List contains Germany");
        }

        //deleting element Germany from the list
        states.remove("Germany");
        states.removeFirst(); //deleting the first element
        states.removeLast(); //deleting the last element

        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));

        people.remove(1); //deleting the second element - Mike

        for (Person person: people
        ) {
            System.out.println(person.getName());
        }

        Person first = people.getFirst();
        System.out.println(first.getName());
    }
}

class Person{
    private String name;

    public Person(String value){
        name = value;
    }

    public String getName() {
        return name;
    }
}
