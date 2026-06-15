/*### **BLOCO 1 — Classes, Objetos e Ciclo de Vida**

**Desafio 01 — Blueprint e instâncias**
Crie uma classe `Vehicle` com os campos `brand` (String), `year` (int) e `fuelLevel` (double). Crie um método `refuel(double amount)` que soma ao `fuelLevel`. No método `main` de outra classe, instancie dois `Vehicle` distintos, atribua valores diferentes e chame `refuel` em apenas um deles. Imprima os campos de ambos.

> *O que o exame vai cobrar:* diferença entre classe (blueprint) e objeto (instância), que campos de instâncias são independentes entre si.*/

public class Main {
	public static void main(String [] args) {
	Vehicle vehicle1 = new Vehicle();
	vehicle1.brand = "Volks";
        vehicle1.year = 2014;
        vehicle1.fuelLevel = 54.0;

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

		 
	
	

	}
}

	
	