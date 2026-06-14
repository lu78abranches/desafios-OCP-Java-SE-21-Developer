public class BankAccount{
	private double balance;
	private String owner;

	public BankAccount(String Owner){
	 this.owner = owner;
	}

	public double getBalance(){
	  return balance;
	}
	public String getOwner(){
	  return owner;
	}
	public void setBalance(Double balance){
	 if(balance >= 0){	
		this.balance = balance;
	} else {
		System.out.println("Saldo invalido");
	       }
        }
}
	    