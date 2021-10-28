package inheritance;

public class Student extends Person {
//additional state : grad year,course,fees,marks
	private int gradYear;
	private String courseName;
	private double fees;
	private int marks;
//	public Student() {
//		super();
//	}

	// add a paramterized ctor to init COMPLETE state of the student
	public Student(String fn, String ln, int gradYear, String courseName, double fees, int marks) {
		super(fn, ln);
		System.out.println("in student's ctor");
		// invoke parameterized MATCHING super cls ctor
		// init remaining state
		this.gradYear = gradYear;
		this.courseName = courseName;
		this.fees = fees;
		this.marks = marks;
	}

	// add overriding form of the method to return COMPLETE state of the Student
	@Override
	public String toString() {
		return "Student " +super.toString()+ " passed in " + gradYear + " course " + courseName + " fees paid " + fees + " marks "
				+ marks;
	}
	//add new functionality
	public void study()
	{
		//Display student's first name studying in course name
		System.out.println(getFirstName()+" studying in "+courseName);
	}

}
