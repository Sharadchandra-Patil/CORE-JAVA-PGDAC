package p4;

public class C implements A, B {

	@Override
	public boolean isEven(int value) {
		// when a class implements dup methods from separate i/fs : NO ambiguity : since
		// it's inheriting dup abstract declaration
		System.out.println(A.DATA+" "+B.DATA);		
		return false;
	}

}
