package Deep;

public class encap {
	

    private static void display(int a){
        System.out.println("Got Integer data.");
    }


    private static void display(String a){
        System.out.println("Got String object.");
    }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		encap obj = new encap( );
				
  obj.display(1);
  
  obj.display("bandaru");
				
				

	}

}



