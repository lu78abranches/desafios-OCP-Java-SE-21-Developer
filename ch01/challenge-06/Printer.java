public class Printer {
    public int print(int x){
      System.out.println(x);
      return x;
    }

    public double print(double x){
      System.out.println(x);
      return x;
    }


    public void print(String x){
        System.out.println(x);
    }

    public void print(int x, String y){
        System.out.println(x + " " + y);
    }

    public void print(String x, int y){
        System.out.println(x + " " + y);
    }
    	
	public static void main(String[] args){
		Printer obj = new Printer();
		obj.print(10);//esse e o proximo mudei o retorno e de certo, nao entendi *O que **não** define overloading:* só mudar o tipo de retorno. Tente criar dois métodos `print` que diferem apenas no retorno e observe o erro do compilador.


		obj.print(12.0);
		obj.print("Olá");
		obj.print(10, "hello");//é chamado print(int x, String y)
		obj.print("hello", 10);//é chamado print(String x, int y)

	}
	
}