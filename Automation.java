package week03.day01;

public class Automation extends MultipleLangauge {
	
	//Interface :Language
	//Methods   :Java()
	//Interface :TestTool
	//Methods   :Selenium()
	//AbstractClass :MultipleLangauge
	//Methods   :python() and un implemented method as ruby()
	//Execution class: Automation 
	//Implement all the methods of interface and abstract class in Automation class

	public void Selenium() {
		
		System.out.println("Selenium-----Testtool ");
		
	}

	public void Java() {
		
		System.out.println("Java---Language");
		
		
	}

	@Override
	public void ruby() {
		
		System.out.println("Ruby--Abstract class");
	}
	
	public static void main(String[] args) {
		
		Automation a=new Automation();
		a.Selenium();
		a.Java();
		a.ruby();
		a.python();
		
		
		
		
	}
	
	
}
