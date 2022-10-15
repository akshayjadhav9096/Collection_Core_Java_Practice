package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class listiteratingWay {

	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<String>();
		list.add("amit");
		list.add("sumit");
		list.add("akshay");
		list.add("jadhav");
		
		Iterator<String> l=list.iterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		System.out.println("for loop..................******");
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i));
			
		}
		System.out.println("after for loop print for each travasing");
		for(String str:list)
		{
			System.out.println(str);
		}

	}

}
