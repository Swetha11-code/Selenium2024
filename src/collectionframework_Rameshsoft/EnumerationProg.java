package collectionframework_Rameshsoft;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationProg {

	public static void main(String[] args) {
		
		Vector vector= new Vector<>();
		
		vector.add(8976);
		vector.add(7987);
		vector.add(567);
		vector.add(876);
		vector.add(4);
		vector.add(9865);
		vector.add(56);
		
		Enumeration enu = vector.elements();
		While(enu.hasMoreElements());
		{
			Object obj = enu.nextElement();
			int i=(int) obj;
			if(i==456)
			{
				System.out.println("HELLO");
			}
			System.out.println(i);
			
		}
		
		
		// APPLICABLE ONLY FOR LEGACY 
		
		
		
		
		
	}

}
