package corejava;

public class exceptionhandling {
	public void nulldisplay() {
	try {
		String s=null;
		System.out.println(s.length());		
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	public static void main (String[] args) {
		exceptionhandling e=new exceptionhandling();
		e.nulldisplay();
	}
}
