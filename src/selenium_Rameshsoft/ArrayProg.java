package selenium_Rameshsoft;

public class ArrayProg {

	public static void main(String[] args) {
				
	String[] str =new String[5];
	/*	for(int i =0; i<str.length; i++)
		{
			System.out.println(str[i]);
		}
*/
	
		str[0] = "java";
		str[1] = "job";
		str[2] ="hardwork";
		str[3] ="hike";
		str[4] ="salary";
		//str[5] = "more hike"--error occurs coz index starts with 0 last index is 4 length is 5
		
				
		for(int i =0; i<str.length; i++)
		{
			System.out.println(str[i]);
		}
		
		int[] in = new int[9];
		
		in[0] = 456;
		in[1] = 7895;
		in[2] =98765;
		in[3] = 6;		
		in[4] = 666;
		in[5] = 4567;
	    in[6] =87443;
	   for(int i =0; i<in.length; i++)
	   {
		   System.out.println(in[i]);
		   
		   	   }
	String[] str1 = {"java","hardwork","job","selenium"};
	for(int i=0; i<str1.length; i++)
	{
		System.out.println(str1[i]);
		
	}
	
	
	
	}

}
