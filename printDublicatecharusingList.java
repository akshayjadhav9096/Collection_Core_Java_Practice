package ArrayList;

import java.util.ArrayList;

public class printDublicatecharusingList {

	public static void main(String[] args) {
		
		ArrayList<Character> list= new ArrayList<>();
		String s2="aakkss";
		String s3="";
	
		
		for (int i = 0; i < s2.length(); i++) 
		{
			int count=0;
			for (int j = i+1; j <s2.length(); j++) 
			{
				if(s2.charAt(i)==s2.charAt(j))
					count++;
				
			}
			if(count!=0)
				s3=s3+s2.charAt(i);	
		}
		for (int i = 0; i < s3.length(); i++) 
		{
			list.add(s3.charAt(i));
			
		}
		System.out.println(list);
		

	}

}
