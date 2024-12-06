package corejava;

public class methoverload {
	public void m1(int a) {
		System.out.println(a);
	}
	public void m1(int a,float b) {
		System.out.println(a+b);
	}
	public void m1(int a,float b,int c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		methoverload o=new methoverload();
		o.m1(2);
		o.m1(1, 1.1f);
		o.m1(1, 9.8f, 7);
	}

}
