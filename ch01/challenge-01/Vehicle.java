/*### **BLOCO 1 — Classes, Objetos e Ciclo de Vida**

**Desafio 01 — Blueprint e instâncias**
Crie uma classe `Vehicle` com os campos `brand` (String), `year` (int) e `fuelLevel` (double). Crie um método `refuel(double amount)` que soma ao `fuelLevel`. No método `main` de outra classe, instancie dois `Vehicle` distintos, atribua valores diferentes e chame `refuel` em apenas um deles. Imprima os campos de ambos.

> 🔍 *O que o exame vai cobrar:* diferença entre classe (blueprint) e objeto (instância), que campos de instâncias são independentes entre si.*/

public class Vehicle {
	String brand;
	int year;
	Double fuelLevel;
	
	void refuel(double amount){
	 fuelLevel += amount;
	}
	
}