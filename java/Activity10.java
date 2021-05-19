package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		HashSet<String> h= new HashSet<String>();
		h.add("M");
		h.add("A");
		h.add("R");
		h.add("S");
		h.add("M");
		h.add("H");
		h.add("m");

		System.out.println("Original HashSet: " + h);
		System.out.println("Size of HashSet: " + h.size());
		System.out.println("removing M from HashSet: " + h.remove("M"));
		System.out.println("Size of HashSet: " + h.size());
		System.out.println("Checking if M is present: " + h.contains("M"));
		System.out.println("Is HashSet empty: " + h.isEmpty());
		  
		  
	}

}
