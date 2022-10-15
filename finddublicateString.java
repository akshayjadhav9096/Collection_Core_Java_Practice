package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class finddublicateString {

	public static void main(String[] args) {
		
		ArrayList<Character> s1= new ArrayList<>();
		String s2="Akshay";
		
		for (int i = 0; i < s2.length(); i++)
		{
			s1.add(s2.charAt(i));
				
		}
		for (int i = 0; i < s2.length(); i++)
		{
			int count=0;
			for (int j = i+1; j < s2.length(); j++) 
			{
				if(s2.charAt(i)==s2.charAt(j))
					count++;
				
			}
			if(count!=0)
			{
				s2=s2+s2.charAt(i);
			}
			
			
		}
		
		
		
			
	}

}
