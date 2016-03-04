package com.facudesa.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.facudesa.stream.dominio.Person;

public class OldestPerson {

    public static Person getOldestPerson7(List<Person> people) {
        Person oldestPerson = new Person("", 0);
        for (Person person : people) {
            if (person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }

    public static Person getOldestPerson(List<Person> people) {
        return people.stream() // Convert collection to Stream
                .max(Comparator.comparing(Person::getAge)) // Compares people ages
                .get(); // Gets stream result
    }
    
    public static void main(String[] args) {
        
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = Arrays.asList(sara, eva, viktor);
		System.out.println((new OldestPerson()).getOldestPerson(collection));	
	}

}
