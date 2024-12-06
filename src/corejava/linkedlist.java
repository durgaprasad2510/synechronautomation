package corejava;

import java.util.LinkedList;

public class linkedlist {
	public static void main(String[] Args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add(null);
		list.add("ravi");
		list.add(null);
		list.add(3, "seetha");
		list.add(1, "ramu");
		list.add("ravi");
	
		System.out.println(list);
		
		
	}

}
