package strings;

public class Test2 {

	public static void main(String[] args) {
		String s1=new String("testing strings");
		String s2=new String("testing strings");
		System.out.println(s1==s2);//reference equality : false
		System.out.println(s1.equals(s2));//String class has overridden the equals method inherited from Object class
		//to replace ref equality by content equality (seq of chars) : case sensitive manner : true
		String s3=s1.toUpperCase();//s3 : upper cased
		System.out.println(s1.equals(s3)); //false
		System.out.println(s1.equalsIgnoreCase(s3));//true
		System.out.println(s1==s3);//false
		
		

	}

}
