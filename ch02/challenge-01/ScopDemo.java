public class ScopDemo{
	int instanceVar = 10;
	public void demostrate(){
	  int localVar = 20;
	  if(localVar > instanceVar){
		int blockVar = 30;
		blockVar += localVar;
	  }
	  System.out.println(blockVar);//here not compiles, is out of if scop
	}
	
	public void otherMethod(){
	  System.out.println(localVar);//here not compiles, is out of demostrate scop method
	}
}