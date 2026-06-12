import java.util.Scanner;
public class Library{
	static Scanner scan = new Scanner(System.in);
	static String[] lista = new String[4];
	static class Catalog{
		public void list(){
			for(int i = 0; i < lista.length; i++) {
			String livro = scan.nextLine();
			lista[i] = livro;
			
		}
		for(String livro: lista){
			System.out.println("Livro: " + livro);
		}
	    }	
		
	}
	class Member{
	   String name;
	
	   public void borrow(){
		System.out.println("Pegou emprestatdo um Livro: " + name);
 	   }
	}
	public static void main(String[] args){
	Catalog obj = new Catalog();
	obj.list();
	Library lib = new Library();
	Library.Member obj2 = lib.new Member();
	obj2.name = "Carlos";
	obj2.borrow();
	}
}		
		