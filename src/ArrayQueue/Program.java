package ArrayQueue;

import java.util.ArrayDeque;

public class Program {
    public static void main(String[] args) {
        //default capacity is 16
        ArrayDeque<String> states = new ArrayDeque<>();

        //standard adding elements
        states.add("Germany"); //to queue end
        states.addFirst("France"); // to queue start
        states.push("Great Britain"); //to queue start
        states.addLast("Spain"); //to queue end
        states.add("Italy"); //to queue end

        //get first element without deleting
        String sFirst = states.getFirst();
        System.out.println(sFirst); // Great Britain
        String sLast = states.getLast();
        System.out.println(sLast); // Italy

        System.out.println("Queue size now is " + states.size()); // 5

        //brute force queue
        while (states.peekFirst() != null){
            //deleting from the beginning
            System.out.println("Queue element is " + states.pop());
        }

        //ArrayDeque typed Person
        ArrayDeque<Person> people = new ArrayDeque<>(5);//capacity is 5
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));

        //brute force without deleting
        for (Person person: people
             ) {
            System.out.println(person.getName());
        }
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
