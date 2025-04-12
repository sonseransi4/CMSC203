//program for bank accounts
//Sonse Ransibrahmanakul

public class CheckingAccount extends BankAccount {
    
	public CheckingAccount (String string1, double numbr) {
	    
		super(string1, numbr);
		
		String string2 = super.getAccountNumber() + " - 10";
		
		super.setAccountNumber(string2);
		
	}
	
	public boolean withdraw(double numbr) {
	    
		double numf = numbr + .15;
		
		return super.withdraw(numf);
		
	}
	
}