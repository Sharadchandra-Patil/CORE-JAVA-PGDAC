package test_inheritance;

import inheritance.*;

public class Test2 {

	public static void main(String[] args) {
		// super class ref , super class object , sub class ref , sub class object
		// Person : super class , Student , Faculty : sub class
		Person p;// p : super class ref
		// System.out.println(p);
		p = new Person("a1", "b1");// super class ref ---> super class object : DIRECT referencing
		Student s1 = new Student("a1", "b1", 2020, "PG-DAC", 123456, 80);// sub class ref --> sub class obj DIRECT
																			// referencing
		p=s1;//Student IS-A Person : yes (extends) : up casting
		//in run time : (dynamic) -- p ---->instance of Student(super cls ref ---> sub class object)
		System.out.println(p);//p.toString() : javac resolves call by the type of the reference
		//JVM resolves by type of instance (Student) : toString : Student ---run time polymorphism
		p=new Faculty("a2", "b2", 20, "Java React DBT");//up casting : javac chks : Faculty IS-A Person
		System.out.println(p);//javac : type of the ref :Person , chks if toString exists in Person class
		//JVM : type of instance : auot will invoke toString : Faculty --- run time poly.

	}

}
