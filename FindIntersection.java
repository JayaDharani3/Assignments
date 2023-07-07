package Week1.day2;

public class FindIntersection {
	public static void main(String[] args) {
		
		int[] intarr1= {3,2,11,4,6,7};
		int[] intarr2= {1,2,8,4,9,7};
		System.out.println("The first array matches");
		for(int i=0;i<intarr1.length;i++)
		{
			for(int j=0+1;j<intarr2.length;j++)
			{
				if(intarr1[i]==intarr2[j])
				{
					
			System.out.println(intarr1[i]);
				}
			}
		}
		
		
	}

}
