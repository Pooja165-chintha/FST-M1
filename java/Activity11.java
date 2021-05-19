package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
	HashMap<Integer,String> hm= new HashMap<Integer,String>();
	hm.put(1, "A");
	hm.put(2, "B");
	hm.put(3, "C");
	hm.put(4, "D");
	hm.put(5, "E");
	hm.put(4, "F");
	
	 System.out.println("The Original map: " + hm);
	 hm.remove(2);
	 System.out.println("After removing:"+hm);
	 if(hm.containsValue("E"))
	 {
		  System.out.println("Contains");
	 }
	 else
		  System.out.println("donot contains");
	
	 System.out.println("Size "+hm.size());
	}
}
