package Week1.day2;

public class changeOddIndexToUpperCase {
	public static void main(String[] args) {
		String test="changeme";
		char[] chararr=test.toCharArray();
	for(int i=0;i<test.length();i++)
	{
		if(i%2==0)
		{
		
			System.out.println(Character.toUpperCase(chararr[i]));
			
		}
		else
		{
			System.out.println(chararr[i]);
		}
	}
				
		
		
	}

}
