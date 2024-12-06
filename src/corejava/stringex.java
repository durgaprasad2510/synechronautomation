package corejava;

public class stringex {
	public static void main(String[] args) {
		String s1="new";
		String s2="delhi";
		String s3="greater noida";
		System.out.println(	s1.concat(s2));
		System.out.println(	s1.equals(s2));
		System.out.println(s1.substring(0,2));
		
		//System.out.println(s1.compareTo(s2));
		System.out.println(s1.contains("n"));
		System.out.println(s1.endsWith(s2));
		
		String[] str=s3.split(" ");
		for (String a:str) { 
			System.out.println(a);
		}
			}
}
