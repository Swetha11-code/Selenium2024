//WAP to extract the digits and do the sum 4+5+6

package collectionframework_Rameshsoft;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpProg1 {

	public static void main(String[] args) {
		String str = "adp456";
		
		Pattern pattern = Pattern.compile("[0-9]"); 
        Matcher matcher = pattern.matcher(str);

        int sum=0;//4
        
while(matcher.find())
{
	String str1 = matcher.group() ;//6
	System.out.println(str1); // to get "4" "5" "6"
	int val = Integer.parseInt(str1);//6
	sum = sum+val;//9+6
}

System.out.println("Sum value is = "+sum);
	}

}
