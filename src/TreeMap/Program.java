package TreeMap;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        TreeMap<Integer, String> states = new TreeMap<>();
        states.put(10, "Germany");
        states.put(2, "Spain");
        states.put(14, "France");
        states.put(3, "Italy");

        System.out.println(states.get(2));
        // перебор элементов
        for (Map.Entry<Integer, String> item: states.entrySet()
             ) {
            System.out.printf("Key: %d Value: %s \n", item.getKey(), item.getValue());
        }
        // получим весь набор ключей
        Set<Integer> keys = states.navigableKeySet();

        // получить набор всех значений
        Collection<String> values = states.values();

        // получаем все объекты, которые стоят после объекта с ключом 4
        Map<Integer, String> tailMap = states.tailMap(4);

        Map<Integer, String> headerMap = states.headMap(10);

        Map.Entry<Integer, String> lastEl = states.lastEntry();

        System.out.printf("Last element: key - %d, value - %s \n", lastEl.getKey(), lastEl.getValue());

        Map<String, Person> people = new TreeMap<>();
        people.put("1564i55", new Person("Bill"));
        people.put("1240i54", new Person("Tom"));
        people.put("4540i56", new Person("Nick"));

        for(Map.Entry<String, Person> item : people.entrySet()){

            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
        }
    }
}

class Person{

    private String name;
    public Person(String name){

        this.name = name;
    }
    String getName(){return name;}
}
