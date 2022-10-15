package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ollection.list;

public class ArrayListeven {

	public static void main(String[] args) {
		
		List<Integer> list1=List.of(1,2,3,4,5,6,7,8,9);
		
		ArrayList<Integer> list2= new ArrayList<>();
		for(Integer i:list1)
		{
			if(i%2==0)
			list2.add(i);
		}
		System.out.println(list1);
		System.out.println(list2);
		// using stream api
//	Stream<Integer>	stream=	list1.stream();
//	
//	List<Integer>stream1=stream.filter(i->i%2==0).collect(Collectors.toList());
//	System.out.println(stream1);
//	
		List<Integer> stream= list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(stream);
	
		
		
		
	}

}
