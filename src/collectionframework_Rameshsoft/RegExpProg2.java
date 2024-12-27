package collectionframework_Rameshsoft;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpProg2 {

	public static void main(String[] args) {

         String phPattern = "(0|[+]91)?[6-9][0-9] {9}";

        //  String phNum = "9177771699";
         String phNum = "919177771699";
         Pattern pattern = Pattern.compile(phPattern);

         Matcher matcher = pattern.matcher(phNum);
		
         if(matcher.find()&&matcher.group().equalsIgnoreCase(phNum)) {
        System.out.println("It is a valid phNum ");	 
         }
         else {
        	 System.out.println("It is invalid phNum");
         }
		
		
		
		
		
		
		
		

	}

}
