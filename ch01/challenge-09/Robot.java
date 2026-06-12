public class Robot{
	static String brand = "Generic";
	int serialNumber;
	
	static {
	    System.out.println("Static Init");
	    brand = "Brand alterada";
	}
	{
	System.out.println("Instance Init");
	serialNumber = 100;
	}
	public Robot(){
	System.out.println("Constructor");
	}
	public static void main(String[] args){
	Robot robot1 = new Robot();
	Robot robot2 = new Robot();
	}
}
	 