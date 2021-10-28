package strings;

public class Test1 {

	public static void main(String[] args) {
		String s1 = new String("hello");
		s1.concat("hi");
		System.out.println(s1);// hello
		s1 += "12345";// s1 = s1 + "12345"; + : concat
		System.out.println(s1);// hello12345 :
		String s2=s1.concat("abc");
		System.out.println(s1);//hello12345
		System.out.println(s2);//hello12345abc
		s2=s1.toUpperCase();
		System.out.println(s1);// orig ? : hello12345
		System.out.println(s2);//uppercased
		System.out.println(s1.replace('l', 'r'));//herro12345
		System.out.println(s1);//hello12345
		
	}

}
