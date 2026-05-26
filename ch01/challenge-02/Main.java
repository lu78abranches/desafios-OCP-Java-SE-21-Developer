public class Main {
	public static void main(String [] args) {

	Vehicle varA = new Vehicle();
	Vehicle varB = varA;
	Vehicle varC = varA;
	varA = null; // not yet eligible because varB and varC points to the varA
	varB = null; // not yet eligible because varC points to the varA 
	varC = null; // yes now eligible because no variable points to the varA.

	}
}

	
	