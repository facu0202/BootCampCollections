package com.facudesa.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.facudesa.stream.dominio.Person;

public class Kid {
	
	  public static Set<String> getKidNames7(List<Person> people) {
	        Set<String> kids = new HashSet<>();
	        for (Person person : people) {
	            if (person.getAge() < 18) {
	                kids.add(person.getName());
	            }
	        }
	        return kids;
	    }

	    public static Set<String> getKidNames(List<Person> people) {
	        return people.stream()
	                .filter(person -> person.getAge() < 18) // Filter kids (under age of 18)
	                .map(Person::getName) // Map Person elements to names
	                .collect(Collectors.toSet()); // Collect values to a Set
	    }	

	    
	    public static void main(String[] args) {
	    Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        Person anna = new Person("Anna", 5);
        List<Person> collection = Arrays.asList(sara, eva, viktor, anna);
        System.out.println(getKidNames(collection));
	    }

}
