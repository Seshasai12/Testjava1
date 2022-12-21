package keyWords;

import java.io.InputStream;
import java.util.Scanner;

public class Constructor {
	static int id;  
	static String name;  
//	public Constructor(InputStream in) {
//		// TODO Auto-generated constructor stub
//	}

	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s=new Scanner(System.in);
		Constructor c1=new Constructor();
		Constructor c2=new Constructor();
//		System.out.println(s.nextInt()+"Enter the ID:");
		c1.display();
//		System.out.println(s.next()+"Enter the Name");
		c2.display();
		

	}

}
