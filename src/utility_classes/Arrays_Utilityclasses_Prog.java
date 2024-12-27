package utility_classes;

import java.util.Arrays;
import java.util.List;

public class Arrays_Utilityclasses_Prog {

	public static void main(String[] args) {

String[]  str = {"hyderabad","telangana","secunderabad","bangalore","assam"};
for(String str1 : str)
{
	System.out.println(str1);
}

Arrays.sort(str);

System.out.println("**********AFTER SORTING***********");
for(String str1 : str)
{
	System.out.println(str1);
}

int status = Arrays.binarySearch(str, "hyderabad");
System.out.println(status);

if(status>=0)
{
	System.out.println("Yes key/value is available in array list");
}
else
{
	System.out.println("No key/value is not available in array list");
}
// TO CONVERT INTO LIST

List list = Arrays.asList(str);
System.out.println(list);





	}

}
