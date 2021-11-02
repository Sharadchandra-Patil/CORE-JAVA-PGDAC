package sets;

public class Emp {
	private int id;
	private String name;
	private double salary;
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in emp equals");
		if(o instanceof Emp)
			return this.id==((Emp)o).id;
		return false;
	}
	//override the inherited hashCode method , to follow the CONTRACT between hashCode n equals
	//SAME objects(equals method rets true) MUST produce SAME hashcode
	@Override
	public int hashCode()
	{
		System.out.println("in hashCode");
		return 10;
	}
	
	

}
