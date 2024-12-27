
public class Lang_package_prog 
{
int hcNum;
public Lang_package_prog(hcNum)
{
	this.hcNum = hcNum;hcNum
}
	@Override
		public int hashCode()
		{
			return hcNum;	
		}		
	public static void main(String[] args) 
	{
		Lang_package_prog prog = new Lang_package_prog();
		int hc = prog.hashCode();
		System.out.println(hc);
		
		Lang_package_prog prog1 = new Lang_package_prog();
		int hc1 = prog1.hashCode();
		System.out.println(hc1);
		
	}

}
