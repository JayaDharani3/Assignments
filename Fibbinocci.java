package Week1.day1;

public class Fibbinocci {
 public static void main(String[] args) {
	 

		int Firstnumber=0;
		int Secondnumber=1;
		int Sum=0;
		System.out.println(Firstnumber);
		for(int i=1;i<=11;i++)
			
		{
			
		Sum=Firstnumber+Secondnumber;
		Firstnumber=Secondnumber;
		Secondnumber=Sum;
		System.out.println(Sum);
			
		}
		
	
}

}
