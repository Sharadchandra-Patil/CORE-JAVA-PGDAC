package sets;

import java.util.HashSet;

public class TestEmpSet2 {

	public static void main(String[] args) {
		// create empty HS<Emp>
		HashSet<Emp> emps = new HashSet<>();
		Emp e1 = new Emp(101, "abc1", 1000);
		Emp e2 = new Emp(10, "abc2", 1000);
		Emp e3 = new Emp(50, "abc3", 1000);
		Emp e4 = new Emp(50, "abc3", 1000);
		System.out.println("Aded " + emps.add(e1));// t
		System.out.println("Aded " + emps.add(e2));// t
		System.out.println("Aded " + emps.add(e3));// t
		System.out.println("Aded " + emps.add(e4));// f
		System.out.println("Emp Set " + emps);// [e1 e2 e3]
		System.out.println(emps.size());// 3
		System.out.println(e1.equals(e2));// f
		System.out.println(e1.equals(e3));// f
		System.out.println(e3.equals(e4));// t
		System.out.println(e1.hashCode() + " " + e2.hashCode() + " " + e3.hashCode() + " " + e4.hashCode());// SAME

	}

}
