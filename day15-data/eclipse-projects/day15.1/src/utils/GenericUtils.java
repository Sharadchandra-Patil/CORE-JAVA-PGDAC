package utils;

import java.util.List;

import genrics.Emp;

public class GenericUtils {
	// Write a static method in GenericUtils class : to print elements of ANY
	// List(AL/LL/Vector) of ANY type(?)
	public static void printListElements(List<?> list) {
		for (Object o : list)
			System.out.print(o + " ");
	}

	// convert the method below : using generic syntax : Type parameter
	public static <T> void printListElements2(List<T> list) {
		for (T o : list)
			System.out.print(o + " ");
	}
	/*
	 * Add static method which can accept ANY List(AL/LL/Vector) of any type of
	 * emps(Emp /Mgr / SalesMgr / Worker/ TempWorker) & compute salary.
	 */
	//Method below can accept List(AL/LL/Vector) of Emp or it's sub type (Mgr/SM/Worker.....)
	public static void invokeComputeSalary(List<? extends Emp> emps)
	{
		for(Emp e : emps)
			e.computeSalary();
	}
	//equivalent version of above method : using bounded type parameter.
	public static <T extends Emp> void invokeComputeSalary2(List<T> emps)
	{
		for(Emp e : emps)
			e.computeSalary();
	}
	

}
