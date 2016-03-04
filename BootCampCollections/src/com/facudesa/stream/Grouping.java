package com.facudesa.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.facudesa.stream.dominio.Person;

public class Grouping {

	public static Map<String, List<Person>> groupByNationality7(List<Person> people) {
        Map<String, List<Person>> map = new HashMap<>();
        for (Person person : people) {
            if (!map.containsKey(person.getNationality())) {
                map.put(person.getNationality(), new ArrayList<>());
            }
            map.get(person.getNationality()).add(person);
        }
        return map;
    }

    public static Map<String, List<Person>> groupByNationality(List<Person> people) {
        return people.stream() // Convert collection to Stream
                .collect(Collectors.groupingBy(Person::getNationality)); // Group people by nationality
    }
    
    
    public static void main(String[] args) {
            Person sara = new Person("Sara", 4, "Norwegian");
            Person viktor = new Person("Viktor", 40, "Serbian");
            Person eva = new Person("Eva", 42, "Norwegian");
            List<Person> collection = Arrays.asList(sara, eva, viktor);
            Map<String, List<Person>> result = groupByNationality(collection);
            System.out.println(result.get("Norwegian"));
            System.out.println(result.get("Serbian"));
            
    }
}
