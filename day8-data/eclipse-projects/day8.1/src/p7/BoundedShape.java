package p7;

public abstract class BoundedShape implements Computable {
	private int x,y;

	public BoundedShape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}
	

	
}
