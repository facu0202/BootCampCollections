package com.facudesa.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterCollection {

    public static List<String> transform7(List<String> collection) {
        List<String> newCollection = new ArrayList<>();
        for (String element : collection) {
            if (element.length() > 2) {
                newCollection.add(element);
            }
        }
        return newCollection;
    }

    public static List<String> transform(List<String> collection) {
        return collection.stream() 
                .filter(value -> value.length() > 2)
                .collect(Collectors.toList()); 
    }
    
    public static void main(String[] args) {
		 List<String> collection = Arrays.asList("My", "name", "is", "John", "Doe");
		System.out.println((new FilterCollection()).transform(collection));	
	}

}