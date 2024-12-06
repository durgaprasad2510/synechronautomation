package corejava;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
		HashSet<Float> h=new HashSet<Float>();
		h.add(12.6f);
		h.add(null);
		h.add(23.8f);
		h.add(12.6f);
		h.add(34.9f);
		h.add(89.8f);
		Iterator itr=h.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.hasNext());
		
		}
		
		
	}

}
