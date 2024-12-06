package corejava;

public class abstractchildclass extends abstracteg {


	@Override
	void read() {
		System.out.println("i'm abstract method");
		// TODO Auto-generated method stub
	}
	public static void main(String[] Args) {
		abstractchildclass e=new abstractchildclass();
		e.display();
		e.read();
	}

}
