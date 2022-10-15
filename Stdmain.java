package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Stdmain {
	

	public static void main(String[] args) {
		
		Student student1= new Student(1, "akshay", 22);
		Student student2= new Student(2, "farate", 23);
		Student student3= new Student(3, "chaudhary", 24);
		Student student4= new Student(4, "pratap", 25);	
		
		//creating arraylist
		
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		
		// getting iterator
		
		Iterator<Student> itr=list.iterator();
		 //traversing elements of ArrayList object  
		while(itr.hasNext())
		{
			Student st = (Student)itr.next();
			System.out.println(st.rollno+" "+st.age+" "+st.name+" "+ "");
		}
		
		
	
}
}
