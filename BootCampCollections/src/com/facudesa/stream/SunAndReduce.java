package com.facudesa.stream;

import java.util.Arrays;
import java.util.List;

public class SunAndReduce {

	
	 public static int calculate7(List<Integer> numbers) {
	        int total = 0;
	        for (int number : numbers) {
	            total += number;
	        }
	        return total;
	    }

	    public static int calculate(List<Integer> people) {
	        return people.stream() // Convert collection to Stream
	                .reduce(0, (total, number) -> total + number); // Sum elements with 0 as starting value
	    }

	    
	    public static void main(String[] args) {
	        List<List<String>> collection = Arrays.asList(Arrays.asList("Viktor", "Farcic"), Arrays.asList("John", "Doe", "Third"));
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
			System.out.println(calculate(numbers));
		}
}
