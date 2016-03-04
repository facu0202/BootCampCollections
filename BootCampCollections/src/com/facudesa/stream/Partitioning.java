package com.facudesa.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.facudesa.stream.dominio.Person;

public class Partitioning {

    public static Map<Boolean, List<Person>> partitionAdults7(List<Person> people) {
        Map<Boolean, List<Person>> map = new HashMap<>();
        map.put(true, new ArrayList<>());
        map.put(false, new ArrayList<>());
        for (Person person : people) {
            map.get(person.getAge() >= 18).add(person);
        }
        return map;
    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
        return people.stream() // Convert collection to Stream
                .collect(Collectors.partitioningBy(p -> p.getAge() >= 18)); // Partition stream of people into adults (age => 18) and kids
    }
    
    public static void main(String[] args) {
    	
    	 Person sara = new Person("Sara", 4);
         Person viktor = new Person("Viktor", 40);
         Person eva = new Person("Eva", 42);
         List<Person> collection = Arrays.asList(sara, eva, viktor);
         Map<Boolean, List<Person>> result = partitionAdults(collection);
         System.out.println(result.get(true));
         System.out.println(result.get(false));
    }

}
