package Deep;

public abstract class demoAbst {
	
//method of abtact class 
	
	abstract  void sound();
	abstract  void sound1();
	public void display() {
		
		System.out.println("This is java programming ");	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Language obj = new Language();
	
	obj.display();
		
	obj.sound();
	
	
	s obj1 = new s();
	

	obj1.sound1();
	}
	

	
	
	
}


class Language extends demoAbst{
	
	
	
	void sound() {
		
		
		System.out.println("Animal make good sound ");
		
	}
	
void sound1() {
		
		
		System.out.println("Animal make good sound ");
		
	}
	
	
	
	
	
	
}



class s extends demoAbst{
	
	
	void sound() {
		
		
		System.out.println("Animal make good sound ");
		
	}
	
void sound1() {
		
		
		System.out.println("Animal make good sound ");
		
	}
	
	
	
	
	
}