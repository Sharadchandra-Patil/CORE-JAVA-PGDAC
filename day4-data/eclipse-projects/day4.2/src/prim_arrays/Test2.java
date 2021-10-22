package prim_arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Objective -- Accept no of data samples(of type double) from User(using scanner)
Create suitable array & display it using for-loop , to confirm default values.

Accept data from User(scanner) & store it in the array.
Display array data using  for loop.

Display array data using for-each loop

 */
public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of data samples : double");
		double[] data;// no objs created in this statement. data : ref type of var (array type of ref)
		// data can refer to any array object holding double type values(primitive)
		// since it's method local var : mem allocated on stack, no of bytes allocated
		// as per JVM specs.
		data = new double[sc.nextInt()];// 10 
		// array class will be loaded in Method area,
		// array obj will be created in the heap : what will be name of the class loaded
		// in Method area : [D
		// array class : has instance var : length
		System.out.println("Name of the class loaded for array " + data.getClass());
		System.out.println("Default contents of array");
//		for (int i = 0; i < data.length; i++)
//			System.out.println(data[i]);
		for(double d1 : data)//d1=data[0]......d1=data[data.length-1]
			System.out.println(d1);
		// init array contents , from user input
		for (int i = 0; i < data.length; i++) {
			System.out.println("Enter array data");
			data[i] = sc.nextDouble();
		}
		System.out.println("Inited contents of array via for-each");
//		for (int i = 0; i < data.length; i++)
//			System.out.println(data[i]);
		// display array contents using for-each
		for(double d : data)//d=data[0],d=data[1]......d=data[data.length-1]
		{
			System.out.println(d);
			d *= 2;//d= d*2;
		}
		System.out.println("contents of array via for-each again");

		for(double d : data)//d=data[0],d=data[1]......d=data[data.length-1]
		{
			System.out.println(d);
			
		}
		//Is there any built-in API for printing array contents ? : YES
		System.out.println("Array contents via Arrays.toString ");
		System.out.println(Arrays.toString(data));
		sc.close();

	}

}
