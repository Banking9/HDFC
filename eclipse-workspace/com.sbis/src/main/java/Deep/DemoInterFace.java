package Deep;

public class DemoInterFace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		personalLoans obj = new personalLoans();
		
		obj.accountName();
       obj.bankAccount();
	
		
		CreditCardLoans obj1 = new CreditCardLoans();
		
		obj1.accountName();
		obj1.bankAccount();
		
		
	}

}


interface iciciBank {
	
	
	
	void bankAccount();
	
	
	default void accountName() {
		
		
		System.out.println("Account Name Bandaru Pattabhi");
		
	}
	
	
	
	
}





class personalLoans implements iciciBank{
	
	
	public void bankAccount() {
		
		
		int accountNumber = 34525;
		System.out.println("AccountNumber personalLoans" +accountNumber );
		
		
		int upiNumber = 4534;
		System.out.println("AccountNumber personalLoans" +upiNumber );
		
		String TypeLoan = "PersonalLoan";
		System.out.println("AccountNumber personalLoans" +TypeLoan );
	}
	
	
	
	
	
}

class CreditCardLoans implements iciciBank{
	
	
	public void bankAccount() {
		
		
		int accountNumber = 3452222;

		System.out.println("AccountNumber CreditCardLoans" +accountNumber );
		
		int upiNumber = 4539;
		System.out.println("AccountNumber CreditCardLoans" +upiNumber );
		
		String TypeLoan = "Credit Card Loan";
		System.out.println("AccountNumber CreditCardLoans" +TypeLoan );
	}
}