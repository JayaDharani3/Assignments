package Week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		String value="MADAM";
		String rev="";
		char[] chararr= value.toCharArray();
		 
		for(int i=value.length()-1;i>=0;i--)
		{
			rev= rev+chararr[i];
			
		}
		
		
		System.out.println(value);
		if(rev.equals(value))
		{
			System.out.println("String is Palindrome");
		
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
	}

}
