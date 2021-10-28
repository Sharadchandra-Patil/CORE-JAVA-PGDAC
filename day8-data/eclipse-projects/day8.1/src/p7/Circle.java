package p7;

public class Circle extends BoundedShape{
	private double radius;
	

	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return PI*radius*radius;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 2*PI*radius;
	}

	@Override
	public String toString() {
		return "Circle "+super.toString()+" radius=" + radius;
	}
	
	//can Circle add a new behaviour ? YES
	public void drawArc(double angle)
	{
		System.out.println("Drawing arc with angle "+angle);
	}

}
