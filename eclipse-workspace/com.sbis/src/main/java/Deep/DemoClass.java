package Deep;

public class DemoClass {
	
	//Fileds
	String carModel;
	
     int Price ;
     
     //Constructor
     DemoClass(String carModel,int Price){
    	 
    	 this.carModel = carModel;
    	 this.Price = Price;
    	 
    	 
     }
     

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Create a  Instance 
		DemoClass obj = new DemoClass("SUV",450000);
		DemoClass obj2 = new DemoClass("Thar",550000);
		
		// accessing  the object through the  
        System.out.println(obj.carModel);
        System.out.println(obj.Price);
        System.out.println(obj2.carModel);
        System.out.println(obj2.Price);
		

	}

}
