package corejava;
public class parameters {

	public void method(String username,String password) {
		System.out.println(username);
		System.out.println(password);
		
	}
	public static void main(String[] args) {
		parameters p=new parameters();
		p.method("dp25102003", "secret");
	}
}
