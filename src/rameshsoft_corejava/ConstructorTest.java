package rameshsoft_corejava;

public class ConstructorTest
{
	public static void main(String[] args) 
	{
		class ConstructorProg
		{
			public ConstructorProg()
			{
				System.out.println("Default Constructor");
			}
			public void hardwork()
			{
				System.out.println("JOB");
			}
	}
		ConstructorProg prog = new ConstructorProg();
		prog.hardwork();
	}
}


