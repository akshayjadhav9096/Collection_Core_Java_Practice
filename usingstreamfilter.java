package ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class usingstreamfilter {

	public static void main(String[] args) {
		
		List<Integer> list1=List.of(1,2,3,4,5,6,7,8,9);
		
		List<Integer> newstream=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newstream);
		
		List<Integer> bade=list1.stream().filter(i->i>=5).collect(Collectors.toList());
		System.out.println(bade);
	}

}
