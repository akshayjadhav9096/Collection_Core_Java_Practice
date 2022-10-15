package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class usingarraylistobj {

	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(60);
		list.add(70);
		
	Stream<Integer> l=list.stream();
	l.forEach(e->System.out.println(e));
	
	String s1="Akshay Rajendra jadhav";
		
	List<String> s=List.of(s1);
	
	List<String> p=	s.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
			

	}

}
