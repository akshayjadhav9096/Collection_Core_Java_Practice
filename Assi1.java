package ArrayList;

import java.util.ArrayList;

public class Assi1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		// add
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		
		// get
		int element =list.get(0);
		System.out.println(element);
		
		// add element in to between
		list.add(0, 100);
		System.out.println(list);
		
		// set element pahila element change
		
		list.set(0, 200);
		System.out.println(list);
		
	// delete store element
		list.remove(4);
		System.out.println(list);

		// size
		int size=list.size();
		System.out.println(size);
		
		System.out.println("after loop");
		for (int i = 0; i <list.size(); i++) 
		{
		System.out.println(list.get(i));	
		}
		
	}

}
