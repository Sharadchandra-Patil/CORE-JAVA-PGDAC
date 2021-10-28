package test_inheritance;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

public class Test3 {

	public static void main(String[] args) {
		Person p = new Student("a1", "b1", 2020, "PG-DAC", 123456, 80);// up casting
		System.out.println(p);// JVM : invokes toString on Student's object
		if (p instanceof Student)
			((Student) p).study();// explicit down casting needed : when super cls ref---> sub class obj n trying
		else
			System.out.println("Invalid Type 1");
		// to call sub class specific func.
		// give me eg of class cast exc
		// Before performing downcasting : check for RTTI(run time type information) :
		// instanceof
		if (p instanceof Faculty)// run time type checking
			((Faculty) p).teach();// run time err
		else
			System.out.println("Invalid Type 2");

		p = new Faculty("a2", "b2", 20, "Java React DBT");// up casting
		System.out.println(p);// JVM : invokes toString on Faculty's object
		if (p instanceof Faculty)
			((Faculty) p).teach();
		else
			System.out.println("Invalid Type 3");
		// Can you invoke study method ?
		if (p instanceof Student)
			((Student) p).study();// no javac err , run time err : YESS -- java.lang.ClassCastException : Faculty
									// can't be cast into a Student
		else
			System.out.println("invalid type 4");
	
		if (p instanceof Person)//true : since Faculty IS-A Object
			((Student) p).study();//class cast exc
		else
			System.out.println("invalid type 5");

	}

}
