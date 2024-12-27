package collectionframework_Rameshsoft;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressionProg {
	public static void main(String[] args) {

String str = "java selenium JAVA jacket job adp $zebra &help *now ";
//Pattern pattern =Pattern.compile("a");// to get a alphabet
//Pattern pattern =Pattern.compile("java");	// to get java word
//Pattern pattern =Pattern.compile("[a-z]");	// to get all lower case alphabets
//Pattern pattern =Pattern.compile("[A-Z]");	// to get all upper case alphabets
//Pattern pattern =Pattern.compile("[a-zA-Z]");	// to get all  alphabets
//Pattern pattern =Pattern.compile("0-9");	// to get digits
//Pattern pattern =Pattern.compile("[^a-zA-Z0-9]");	// to get special characters
Pattern pattern =Pattern.compile("[java]");	// to get either "a" or either "j" or either "v"



Matcher matcher = pattern.matcher(str);
	int count = 0;
	
	while (matcher.find())
	{
		count++;
		String grp = matcher.group();
		int startIndx = matcher.start();
	int endIndx = matcher.end();
	System.out.println(grp+" = "+startIndx+" = "+endIndx);
	}
	
	System.out.println("No.of occurences of char is = "+count);
	}

}
