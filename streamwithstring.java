package ArrayList;

import java.util.stream.Stream;

import ollection.list;

public class streamwithstring {

	public static void main(String[] args) {
		
		String s1="Akshay rajendra jadhav";
		
		Stream<String> stream=Stream.of(s1);
		
		stream.forEach(e->System.out.println(e));
	}

}
