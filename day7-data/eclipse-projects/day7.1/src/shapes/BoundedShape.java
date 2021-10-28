package shapes;

public abstract class BoundedShape {
	private int x, y;

	public BoundedShape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "x=" + x + " y=" + y;
	}

	// add common method in the super class : simply supply declaration
	public  abstract double area();

}

//abstract class A {
//	public void show() {
//
//	}
//}
