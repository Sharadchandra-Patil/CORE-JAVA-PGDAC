package sets;

import java.util.HashSet;

public class TestEmpSet {

	public static void main(String[] args) {
		// create empty HS<Emp>
		HashSet<Emp> emps=new HashSet<>();
		Emp e1=new Emp(101, "abc", 1000);
		Emp e2=new Emp(101, "abc", 1000);
		Emp e3=new Emp(101, "abc", 1000);
		System.out.println("Aded "+emps.add(e1));//t
		System.out.println("Aded "+emps.add(e2));//t
		System.out.println("Aded "+emps.add(e3));//t
		System.out.println("Emp Set "+emps);//e1 e2 e3
		System.out.println(emps.size());//3
		System.out.println(e1.equals(e2));//t
		System.out.println(e1.equals(e3));//t
		System.out.println(e1.hashCode()+" "+e2.hashCode()+" "+e3.hashCode());//distinct
		

	}

}
