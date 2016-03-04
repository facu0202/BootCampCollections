package com.facudesa.stream;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToUpperCase {

    public  List<String> transform7(List<String> collection) {
        List<String> coll = new ArrayList<>();
        for (String element : collection) {
            coll.add(element.toUpperCase());
        }
        return coll;
    }

    public  List<String> transform(List<String> collection) {
        return collection.stream() 
                .map(String::toUpperCase) 
                .collect(toList()); 
    }

    
    
	public static void main(String[] args) {
		 List<String> collection = Arrays.asList("My", "name", "is", "John", "Doe");
		System.out.println((new ToUpperCase()).transform(collection));
		
		
		
	}
}
