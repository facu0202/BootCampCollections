package com.facudesa.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.facudesa.stream.dominio.Person;

public class Joining {
	
	  public static String namesToString7(List<Person> people) {
	        String label = "Names: ";
	        StringBuilder sb = new StringBuilder(label);
	        for (Person person : people) {
	            if (sb.length() > label.length()) {
	                sb.append(", ");
	            }
	            sb.append(person.getName());
	        }
	        sb.append(".");
	        return sb.toString();
	    }

	    public static String namesToString(List<Person> people) {
	        return people.stream() // Convert collection to Stream
	                .map(Person::getName) // Map Person to name
	                .collect(Collectors.joining(", ", "Names: ", ".")); // Join names
	    }
	    
	    public static void main(String[] args) {
	    	
	    	Person sara = new Person("Sara", 4);
	        Person viktor = new Person("Viktor", 40);
	        Person eva = new Person("Eva", 42);
	        List<Person> collection = Arrays.asList(sara, viktor, eva);
	        System.out.println(namesToString(collection));
	                
	    	
	    }

}
