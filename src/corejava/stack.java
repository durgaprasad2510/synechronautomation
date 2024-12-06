package corejava;

import java.util.Stack;

public class stack {
	public static void main(String[]Args) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(1);
		s.push(3);
		s.push(4);
		s.push(90);
		s.push(33);
		s.add(56);
		s.push(45);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search(56));
	}

}
