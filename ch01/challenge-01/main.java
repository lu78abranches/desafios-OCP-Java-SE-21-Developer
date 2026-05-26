public class Main {
	public static void main(String [] args) {
	Vehicle vehicle1 = new Vehicle();
	vehicle1.brand = "Volks";
        vehicle1.year = 2014;
        //vehicle1.fuelLevel = 54.0;

        vehicle1.refuel(30.0);

        System.out.println("Vehicle 1:");
        System.out.println(vehicle1.brand);
        System.out.println(vehicle1.year);
        System.out.println(vehicle1.fuelLevel);
	
	Vehicle vehicle2 = new Vehicle(); 
	vehicle2.brand = "Ford";
        vehicle2.year = 1985;
        vehicle2.fuelLevel = 30.0;

        System.out.println("\nVehicle 2:");
        System.out.println(vehicle2.brand);
        System.out.println(vehicle2.year);
        System.out.println(vehicle2.fuelLevel);

	Vehicle a = new Vehicle();
	Vehicle b = a;
	b.fuelLevel = 99.0;
	System.out.println(a.fuelLevel);

	Vehicle car3 = new Vehicle();
	Vehicle car4 = vehicle1;
	Vehicle car5 = vehicle1;
	car4 = null;// Unreferenced object eligible for garbage collection
	
	

	}
}

	
	