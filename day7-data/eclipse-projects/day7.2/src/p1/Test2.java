package p1;

public class Test2 {

	public static void main(String[] args) {
		Printer p;// p : ref type (i/f type of the ref) : mem allocated : stack
		// Fruit f=new Mango(...);
		p = new ConsolePrinter();// up casting : implicitly done by javac : since ConsolePrinter IS-A Printer
									// (implements) : indirect ref
		p.print("New Message!!!!");// no javac err : since Printer i/f has : print method decl. : JVM resolves
									// method binding by the type of the object : ConsolePrinter -- run time poly
		//Dynamic method dispatch
		p=new NetworkPrinter();//up casting
		p.print("New Message!!!!");
		//Can i/f reference DIRECTLY (w/o type casting) refer to ANY imple . class instance ? YESS

	}

}
