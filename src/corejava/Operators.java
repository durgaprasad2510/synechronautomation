package corejava;

public class Operators {
	int a=13;
	public void arth() {
		
		int b=25;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
	}
	
	public static void main(String[] args) {
		Operators op=new Operators();
		op.arth();
	}

}
