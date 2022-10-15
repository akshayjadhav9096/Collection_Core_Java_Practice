package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set s= new HashSet();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	  
	}

}
