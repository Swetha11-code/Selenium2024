package selenium_Rameshsoft;

public class TwoDimensionalArrayProg {

	public static void main(String[] args) {
		String[][] str =new String[2][2];
		str[0][0] ="java";
		str[0][1] ="job";
		str[1][0] ="practice";
		str[1][1] ="java";
		 for(int i=0; i<str.length; i++)
		 {
			 for(int j=0; j<str.length; j++)
			 {
				 System.out.println(str[i][j]);
			 }
		 }
		
	}

}
