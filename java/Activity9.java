package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		ArrayList<String> arrList= new ArrayList<String>();
        arrList.add("Samsung");
        arrList.add("oppo");
        arrList.add("realMe");
        arrList.add(1,"iphone11");
        arrList.add(2,"iphoneX");
        System.out.println("Print All the Objects:");
        for (String arrLists:arrList) {
        	System.out.println(arrLists);
        }
        
        System.out.println("2nd element in list "+arrList.get(1));
        System.out.println("ipones in list "+arrList.contains("iphoneX"));
        System.out.println("Array list size "+ arrList.size());
        arrList.remove("oppo");
        System.out.println("Array list size "+ arrList.size());
	}

}
