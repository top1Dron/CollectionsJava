package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();

        //added some elements to ArrayList people
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");
        people.add(1, "Bob");

        //get the second element from people
        System.out.println(people.get(1));
        //set new value to the second element
        people.set(1, "Robert");

        System.out.printf("ArrayList has %d elements \n", people.size());
        for (String person: people) {
            System.out.println(person);
        }

        //checking on containing element
        if(people.contains("Tom")){
            System.out.println("Tom index: " + people.indexOf("Tom"));
            System.out.println("ArrayList contains Tom");
        }

        //deleting some objects
        //deleting the concrete object
        people.remove("Robert");
        //deleting by index
        people.remove(0);

        Object[] peopleArray = people.toArray();
        for (Object person: peopleArray
             ) {
            System.out.println(person);
        }

        //set capacity of the list to 25
        people.ensureCapacity(25);

        //creating new ArrayList, which contains 250 elements of Integer by default (using UpCast)
        List<Integer> numbers = new ArrayList<>(250);
    }
}
