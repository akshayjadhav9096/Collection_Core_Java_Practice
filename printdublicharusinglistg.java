package ArrayList;

import java.util.ArrayList;

public class printdublicharusinglistg {

	public static void main(String[] args) {
		
		ArrayList<Character> list= new ArrayList<>();
		
		String s1="AAAAkkkkshaaaa";
		for (int i = 0; i < s1.length(); i++)
		{
			list.add(s1.charAt(i));
			
		}
		for (int i = 0; i < list.size(); i++)
		{
			int count=0;
			for (int j = i+1; j < list.size(); j++) 
			{
				if(list.get(i)==list.get(j))
					count++;
			}
			if(count!=0)
				System.out.println(list.get(i));
			
		}
		
	}

}
