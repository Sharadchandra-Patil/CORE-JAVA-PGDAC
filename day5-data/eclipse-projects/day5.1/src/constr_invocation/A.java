package constr_invocation;

public class A {
	A() {
		super();
		System.out.println("in A");
	}
}

class B extends A {
	B() {
		super();
		System.out.println("in B");
	}
}

class C extends B {
	C() {
		super();//javac implicitly adds super() => invokes immediate super cls' ctor
		System.out.println("in C");
	}
}
