public class BankAccount{
	private double balance;
	private String owner;

	public double getBalance(){
	  return balance;
	}
	public String getOwner(){
	  return owner;
	}
	public void setBalance(){
	 if(balance >= 0){	
		this.balance = balance;
	} else {
		System.out.println("Saldo invalido");
	       }
        }
}
	    