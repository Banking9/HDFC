import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demopara {
	@Parameters({"i","j"})
	@Test
	public void add(int i ,int j) {
		
		System.out.println(i+j);
		
		
	}
	@Parameters({"i","j"})
	@Test
	public void sub(int i ,int j) {
		
		System.out.println(i - j);
		
		
	}


}
