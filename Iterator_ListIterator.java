package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator_ListIterator {

	public static void main(String[] args) {
		
		List list=  new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add("akshay");
		list.add("jadhav");
		
		Iterator l=list.iterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		
		
		ListIterator ill=list.listIterator();
		while(ill.hasNext())
		{
			System.out.println(ill.next());
		}
		
		ListIterator li=list.listIterator();
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}

}
