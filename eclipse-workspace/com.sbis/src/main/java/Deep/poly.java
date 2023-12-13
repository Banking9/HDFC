package Deep;

public class poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		poly1 obj = new poly1();
		
		obj.courses();
		
		poly2 obj2 = new poly2();
		
		obj2.courses();
		
		poly3 obj3 = new poly3();
		
		obj3.courses();
		
		
		
		
	}

}



class poly1{
	
	
	
	public void courses() {
		
		
		System.out.println("Data Science class");
		
	}
	
	
	
	
}




class poly2 extends poly1{
	
	
public void courses() {
		
		
		System.out.println("cyber secure class");
		
	}
	
	
}

class poly3 extends poly1{
	
	
public void courses() {
		
		
		System.out.println("Phyton class");
		
	}
	
	
}