public class VarDemo{
	var field = 42;//here`s not compiles, instance field needs to be typed
	public void print(){
	  var name = "Java";//here`s compiles, varieble local and initialized in same line can be var
	  System.out.println(name);
	}
	void method(var x){//here`s not compiles, var cannot be passed with arguments
	System.out.println(x);
	}
	void otherMethod(){
	var x;// not compiles, var need to be initialized
	}
	void varNull(){
	var x = null;//not compiles, var cannot receive the value null 
	}
}