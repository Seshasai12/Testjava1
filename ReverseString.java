package keyWords;

import java.util.ArrayList;
import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalStr = "Sesha sai";
		String reversedStr = "";
		ArrayList<String> list=new ArrayList<String>();  
		list.add("Ravi"); 
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay"); 
		list.add("Ravi"); 
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay"); 
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());

		for (int i = 0; i < originalStr.length(); i++) {
		  reversedStr = originalStr.charAt(i) + reversedStr;
		}
		System.out.println("originalStr: "+originalStr);

		System.out.println("Reversed string: "+ reversedStr);

	}

}}
