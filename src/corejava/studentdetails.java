package corejava;

public class studentdetails {
	int studentid=34;
	String studentname="dp";
	
public void fetchdomain() {
	System.out.println("testing");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentdetails st=new studentdetails();
	
		System.out.println(st.studentid);
		System.out.println(st.studentname);
		st.fetchdomain();	
	}

}
