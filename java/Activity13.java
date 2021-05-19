package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		 Scanner s= new Scanner(System.in);
		 ArrayList<Integer> arrList= new ArrayList<Integer>();
		 Random rn=new Random();
		 
		 System.out.print("Enter integers please ");
	     System.out.println("(EOF or non-integer to terminate): ");
	     while (s.hasNextInt()) {
	    	 arrList.add(s.nextInt());
	     }
	     Integer num[]= arrList.toArray(new Integer[0]);
	     int index= rn.nextInt(num.length);
	     System.out.println("Index value generated: " + index);
	     System.out.println("Value in arary at generated index: " + num[index]);
	     s.close();

	}

}
