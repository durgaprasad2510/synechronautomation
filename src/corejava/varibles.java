package corejava;

public class varibles {
	int a=1;
	static int b=2;
	final public void student() {
		final int c=3;
		 //c=6;
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		varibles v=new varibles();
		v.student();
		System.out.println(v.a);
		System.out.println(b);
	}

}
