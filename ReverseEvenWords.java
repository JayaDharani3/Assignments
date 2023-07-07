package Week1.day2;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test = "I Am a software tester";
		// I ma a erawtfos tester
		String[] s = test.split(" ");

		for (int i = 0; i < s.length; i++) {
			if (i % 2 != 0) {
				char[] chararr = s[i].toCharArray();
				for (int j = chararr.length - 1; j >= 0; j--) {
					System.out.print(chararr[j]);

				}

			} else {
				System.out.print(s[i]);
			}
			System.out.print(" ");
		}
	}
	
}
