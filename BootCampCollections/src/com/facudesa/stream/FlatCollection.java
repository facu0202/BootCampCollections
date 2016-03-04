package com.facudesa.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FlatCollection {

    public static List<String> transform7(List<List<String>> collection) {
        List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection : collection) {
            for (String value : subCollection) {
                newCollection.add(value);
            }
        }
        return newCollection;
    }

    public static List<String> transform(List<List<String>> collection) {
        return collection.stream() // Convert collection to Stream
                .flatMap(value -> value.stream()) // Replace list with stream
                .collect(toList()); // Collect results to a new list
    }

   
    /*
     * 
     
    Diferente Map Vs FlatMap
    
    Both map and flatMap can be applied to a Stream<T> and they both return a Stream<R>. The difference is that the map operation produces one output value for each input value, whereas the flatMap operation produces an arbitrary number (zero or more) values for each input value.

	This is reflected in the arguments to each operation.
	
	The map operation takes a Function, which is called for each value in the input stream and produces one result value, which is sent to the output stream.
	
	The flatMap operation takes a function that conceptually wants to consume one value and produce an arbitrary value. However, in Java, it's cumbersome for a method to return an arbitrary number of values, since methods can return only zero or one value. One could imagine an API where the mapper function for flatMap takes a value and returns an array or a List of values, which are then sent to the output. Given that this is the streams library, a particularly apt way to represent an arbitrary number of return values is for the mapper function itself to return a stream! The values from the stream returned by the mapper are drained from the stream and are passed to the output stream. The "clumps" of values returned by each call to the mapper function are not distinguished at all in the output stream, thus the output is said to have been "flattened."
	
	Typical use is for the mapper function of flatMap to return Stream.empty() if it wants to send zero values, or something like Stream.of(a, b, c) if it wants to return several values. But of course any stream can be returned.
     */
    
    
    public static void main(String[] args) {
        List<List<String>> collection = Arrays.asList(Arrays.asList("Viktor", "Farcic"), Arrays.asList("John", "Doe", "Third"));
		System.out.println((new FlatCollection()).transform(collection));	
	}

}