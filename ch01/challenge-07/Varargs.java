public class Varargs {
	/*public int sum(int... numbers){
	int total = 0;
	for(int n : numbers){
		total += n;
	}
	return total;
	}
	public int sum(int... a, int... b){
	int total = a;
	for(int n : b){
		total += n;
	}
	return total;
	}
	public int sum(int first, int... rest){
	int total = first;
	for(int n : rest){
		total += n;
	}
	return total;
	}*/

	public static void main(String[] args){
	Varargs obj = new Varargs();
	System.out.println(obj.sum(5));
	System.out.println(obj.sum(1,2,3,4,5));
	System.out.println(obj.sum(new int[]{1, 2, 3}));
	}
}