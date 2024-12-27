package rameshsoft_corejava;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ValidationProg {

	public static void main(String[] args) {
    
		  int num1 = 56 ,num2 = 95;
		  
		/*  if (num1== num2) {
			System.out.println("if");
		}
		  else {
			  System.out.println("else");
		  }
		  System.out.println("normal statement");
		  System.out.println("normal statement");
		  System.out.println("normal statement");
		*/
		
      /* SoftAssert softAssert = new SoftAssert();
       System.out.println("1");
       System.out.println("2");
       softAssert.assertEquals(num1, num2);
       System.out.println("3");
       softAssert.assertTrue(num1>num2);
       System.out.println("4");
       */
       


	       System.out.println("1");
	       System.out.println("2");
	       Assert.assertEquals(num1, num2);
	       System.out.println("3");
	       Assert.assertTrue(num1>num2);
	       System.out.println("4");
      // We get exception because 45 is not equal to 95 
       
       
       
       
       
       

}

}
