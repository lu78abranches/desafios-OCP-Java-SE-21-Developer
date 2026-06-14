class ImmutablePoint{
	private final int x;
	private final int y;

	public ImmutablePoint(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX(){
	  return x;
	}
	public int getY(){
	  return y;
	}
	public ImmutablePoint translate(int dx, int dy) {
        return new ImmutablePoint(this.x + dx, this.y + dy);
        }

        public static void main(String[] args) {

	      
           
              ImmutablePoint point = new ImmutablePoint(10, 20);
	      ImmutablePoint moved = point.translate(54,45);
	      System.out.println(moved.getX());
	      System.out.println(moved.getY());
              System.out.println("Valor de X: " + point.getX());
	      System.out.println("Valor de X: " + point.getY());
	}
}

	