package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listiteratoe1 {

	public static void main(String[] args) {
		
		List list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
	ListIterator li=list.listIterator();
	while(li.hasNext())
	{
		System.out.println(li.next());
	}
	System.out.println("------------------");
	while(li.hasPrevious())
	{
		System.out.println(li.previous());
	}
	}

}
