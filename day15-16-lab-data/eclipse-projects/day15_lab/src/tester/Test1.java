package tester;

import java.util.Arrays;
import java.util.List;
import static utils.GenericUtils.*;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(100,20,1,4,5,789,546,22);
		System.out.println(findMax(l1));
		List<Double> l2=Arrays.asList(1.3,4.5,4.0,56.78,678d,6123.456);
		System.out.println(findMax(l2));
		List<String> l3=Arrays.asList("one","two","three");
		System.out.println(findAnyMax(l3));
	}

}
