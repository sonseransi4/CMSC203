//program for bank accounts
//Sonse Ransibrahmanakul

public class SavingsAccount extends BankAccount {
    
	public int numbr = 0;
	
	public String account = "";
	
	public SavingsAccount(String thing, double ini) {
	    
		super(thing, ini);
		
		String thing2 = super.getAccountNumber() + " - " + numbr;
		
		account = thing2;
		
	}
	
	public String getAccountNumber() {
	    
		return account;
		
	}
	
	public SavingsAccount(SavingsAccount thing, double ini) {
	    
		super(thing, ini);
		
		numbr = thing.numbr++;
		
		String thing2 = super.getAccountNumber() + " - " + numbr;
		
		account = thing2;
		
	}
	
	public void postInterest() {
	    
		double num = 1d + .025/12;
		
		double ans = super.getBalance()*(num);
		
		super.setBalance(ans);
		
	}
	
}