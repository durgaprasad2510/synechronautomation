package corejava;

import java.util.Vector;

public class vectoreg {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(5);
		v.add(6);
		v.add(2);
		v.add(88);
		v.add(90);
		v.add(23);
		v.add(44);
		v.add(34);
		v.add(33);
		v.add(22);
		System.out.println(v.capacity());
		System.out.println(v);

	}

}
