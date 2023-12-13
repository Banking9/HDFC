package DemoPractice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependDemo {
	

	static String trackingNumber = null;
	

	@Test(priority = 3)
	public void createShipment() {
//		System.out.println(5/0);
		
		System.out.println("Create shipment");
		trackingNumber = "SENZ12";
		
		
	}
 @Test(priority =1, dependsOnMethods = {"createShipment"},alwaysRun = true)
	public void trackShipment() throws Exception {
		
	if(trackingNumber != null) {
		System.out.println("TrackShipment");
		
	}else throw new Exception("invalid tracking number");
	 
	 
	}

@Test(priority = -1, dependsOnMethods = {"createShipment","trackShipment"})
	 public void cancelShipment()  throws Exception {
		 
	if(trackingNumber != null) {
		System.out.println("CencelShipment");
		
	}else throw new Exception("invalid tracking number");
	 
	 
	}

	 }
	
	
	


