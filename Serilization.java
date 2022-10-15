package collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serilization {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<>();
		
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		
		try {
			
			// serilizabale		
			FileOutputStream fos= new FileOutputStream("file");
			
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(oos);
			fos.close();
			oos.close();
			//Deserialization
			
			FileInputStream fis= new FileInputStream("file");
			ObjectInputStream ios= new ObjectInputStream(fis);
			ArrayList list=(ArrayList)ios.readObject();
			System.out.println(list);
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	     ArrayList<String> al1=new ArrayList<String>();  
         al.add("Ravi");    
         al.add("Vijay");    
         al.add("Ajay");    
           
         try  
         {  
             //Serialization  
             FileOutputStream fos=new FileOutputStream("file");  
             ObjectOutputStream oos=new ObjectOutputStream(fos);  
             oos.writeObject(al1);  
             fos.close();  
             oos.close();  
             //Deserialization  
             FileInputStream fis=new FileInputStream("file");  
             ObjectInputStream ois=new ObjectInputStream(fis);  
           ArrayList  list=(ArrayList)ois.readObject();  
           System.out.println(list);    
         }catch(Exception e)  
         {  
             System.out.println(e);  
         }  
		
		
	}

}
