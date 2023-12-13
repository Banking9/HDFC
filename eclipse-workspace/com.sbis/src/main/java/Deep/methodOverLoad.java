package Deep;

public class methodOverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		languages obj = new languages();
		
		obj.languagesNames();
		
		
		lan obj1 = new lan();
		
		obj1.languagesNames();
		
		
	}

}


class languages {
	
	
	
	
	void languagesNames() {
		
		System.out.println("Language Names");
		
		
	}
	
	
	
	
	
}

class lan extends languages{
	
	@Override
void languagesNames() {
		
		System.out.println("Language2");
		
		
	}
	
	
}