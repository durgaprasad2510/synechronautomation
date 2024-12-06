package Accessmodifiers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class files {
	public static void main(String[]args) throws IOException  {
		FileInputStream  fi=new FileInputStream("C:\\Users\\kiosk_user\\Desktop\\files\\resume.txt");
		int i=0;
		while((i=fi.read())!=-1) {
			
			System.out.print((char)i);
		}
	}

}
