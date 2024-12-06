package Accessmodifiers;

import java.util.ArrayList;

public class conflicts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("John");
		list.add("manju");
		list.add("meda");
		list.add(null);
		list.add("dinesh");
		list.add("dp");
		list.add("dp");
		list.remove(1);
		System.out.println(list);
		System.out.println(list.contains("manju"));
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list.getFirst());
		System.out.println(list.removeFirst());
		
		

		
	}

}
