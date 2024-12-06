package corejava;

public class riding extends methoverride{
	public void m1(float a,float b) {
		System.out.println(a+b);
	}
	
	public void m1(double a,float b) {
		System.out.println(a+b);
	}
	public static void main(String[] Args) {
		riding r=new riding();
		r.m1(33f, 33.2f);
		r.m1(44.2d, 1.3f);
		r.m1(1,2);
		
	}

}
