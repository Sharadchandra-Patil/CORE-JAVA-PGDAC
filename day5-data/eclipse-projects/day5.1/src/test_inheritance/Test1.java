package test_inheritance;
import inheritance.*;

public class Test1 {

	public static void main(String[] args) {
		// hard code student details n create it's instance
		Student s1=new Student("a1", "b1",2020, "PG-DAC", 123456,80);
		//print student details : using inherited (from java.lang.Object class) toString
	//	System.out.println(s1.toString());
		System.out.println(s1);//it will implicitly call s1.toString (HOW ? ans is in javadocs)
		// hard code faculty details n create it's instance
		Faculty f1=new Faculty("a2", "b2", 20, "Java React DBT");
		//print faculty details : using inherited (from java.lang.Object class) toString
		System.out.println(f1);//inheritance.Faculty@45456
		
		
		

	}

}
