package corejava;

public class cons {
	int i;
	String s;
	cons(int a,int b){
		System.out.println("im para");
		System.out.println(a+b);
	}
	cons(){
		System.out.println("im the constructor");
		System.out.println(i+" "+s);
	}
	public void m1() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		cons c=new cons(10,40);
		cons b=new cons();
		c.m1();
		b.m1();
	}
}
