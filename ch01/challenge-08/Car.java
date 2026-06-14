public class Car {
	String brand;
        int year;


	public Car() {
          this("Unknown", 0);
        }

        public Car(String brand) {
          this(brand, 0);
        }

        public Car(String brand, int year) {
          this.brand = brand;
          this.year = year;
        }
	public static void main(String[] args){
	Car car = new Car();
	Car car1 = new Car("Volks");
	Car car2 = new Car("Ford", 2019);
	System.out.println("Carro 1: " + " Marca: " + car.brand + " Ano: " + car.year);
	System.out.println("Carro 2: " + " Marca: " + car1.brand + " Ano: " + car1.year);
	System.out.println("Carro 3: " + " Marca: " + car2.brand + " Ano: " + car2.year);
	}


}
	   