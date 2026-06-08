public class Counter {
	static int totalCreated;
	int id;

	public Counter(){
		Counter.totalCreated++;
		this.id = totalCreated;
		
	}

	public static int getTotal(){
		return totalCreated;
	}
	public int getId(){
		return this.id;
	}
	
	public static void main(String[] args){
	Counter obj1 = new Counter();
	Counter obj2 = new Counter();
	Counter obj3 = new Counter();

	System.out.println("id obj1: " + obj1.getId());
	System.out.println("id obj2: " + obj2.getId());
	System.out.println("id obj3: " + obj3.getId());
	System.out.println("Total de objetos criados: " + getTotal());
	}
}