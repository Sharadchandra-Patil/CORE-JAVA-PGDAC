package p1;

public class C implements A, B {

	@Override
	public boolean isEven(int value) {
		// when a class implements dup methods from separate i/fs : NO ambiguity : since
		// it's inheriting dup abstract declaration
		return false;
	}

}
