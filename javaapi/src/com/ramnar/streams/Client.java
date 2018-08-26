package com.ramnar.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Java streams concepts
 * 
 * @author tomato
 *
 */
public class Client {

	/**
	 * -> Streams are used to process collection of objects
	 * -> Streams use internal iterators which can leverage parallel processing
	 * -> Streams are collection of objects on which operations are performed like 
	 *   filter, map, limit, foreach, parallel streams, sorted, reduced
	 * -> pipeline is performing multiple operations on streams
	 * -> Streams take arrays, collections and I/O as source
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> names = Arrays.asList("ram", "", "", "rahul", "gita", "sita", "");
		
		//print all strings
		names.stream().forEach(System.out::println);
		
		//print count of empty strings
		long count = names.stream().filter(name -> name.isEmpty()).count();
		System.out.println("Empty String count : " + count);
		
		//print count of strings with length 3
		count = names.stream().filter(name -> name.length() == 3).count();
		System.out.println("Count of names with length 3 : " + count);
		
		//print all non empty strings
		String content = names.stream().filter(name -> !name.isEmpty()).collect(Collectors.joining(","));
		System.out.println(content);

	}

}
