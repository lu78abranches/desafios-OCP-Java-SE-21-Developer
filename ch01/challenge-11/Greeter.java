public interface Greeter{
	public void greet(String name);
	  
	public static void main(String[] args){
		class LocalClass implements Greeter{
			@Override
			public void greet(String name){
			    System.out.println("Bem vindo a classe local " + name + "!");
			}
			
		}
		LocalClass obj = new LocalClass();
		obj.greet("Jonas");

		Greeter anonymousGreeter = new Greeter(){
			@Override
			public void greet(String name){
			 System.out.println("Bem vindo a classe anonima " + name + "!");
			}
		};
		anonymousGreeter.greet("Oscar");  
		
	}
}