package inheritance;

public class Person {
	private String firstName;
	private String lastName;
//	public Person(String firstName,String lastName) {
//		this.firstName=firstName;
//		this.lastName=lastName;
//	}
	public Person(String firstName, String lastName) {
	//	super();
		System.out.println("in person'c ctor");
		this.firstName = firstName;
		this.lastName = lastName;
	}
//	public Person() {
//		// TODO Auto-generated constructor stub
//	}
	//modify inherited toString
	//How ? : Method overriding
	//rules : access spec : same or wider --public
	//ret type : same  , method name : same , method args : same
	public String toString()
	{
		return firstName+" "+lastName;
	}
	

}
