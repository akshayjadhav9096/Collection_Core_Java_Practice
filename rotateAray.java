package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class rotateAray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		 
		int temp=a[a.length-1];
		for (int i = a.length-1; i >0; i--)
		{
			a[i]=a[i-1];	
		}
		a[0]=temp;
		ArrayList<Integer> list=new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			
			list.add(a[i]);
		}
	Iterator<Integer>itr=list.iterator();
	while(itr.hasNext())
		System.out.print(itr.next()+"  ");
	}

}
