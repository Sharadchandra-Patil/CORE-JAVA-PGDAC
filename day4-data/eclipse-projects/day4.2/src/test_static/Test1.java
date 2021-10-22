package test_static;
//To access ALL static members  of the System class directly (w/o using class name)
import static java.lang.System.*;
import static java.lang.Math.sqrt;

//import static java.lang.System.exit;

public class Test1 {
	//add instance var
	private int i;
	//add static var.
	private static int j;

	public static void main(String[] args) {
	//	int a=10/0;//java.lang.ArithmeticException : done to confirm how main thrd invokes the main method
		// i or j or show
		out.println(j);
//		System.out.println(i);
		show();
		exit(0);
		System.out.println(sqrt(12.34));

	}
	//add static method : show 
	public static void show()
	{
		//what will be accessible directly(w/o inst) : i , j : j
//		System.out.println("instance var "+i);
		System.out.println("static var "+j);
		//in order to acces instance var : create instance n then access using object ref.
		Test1 t1=new Test1();
		System.out.println(t1.i);
		//can u access this / super from a static method? NO
	//	System.out.println(this);
	//	System.out.println(super);
	}
	//add non static method
	public void testMe()
	{
		//i , j show ? all
		System.out.println(i+" "+j);
		show();
	}

}
