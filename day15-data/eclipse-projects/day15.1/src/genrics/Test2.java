package genrics;

import static utils.GenericUtils.*;

import java.util.Arrays;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List<Double> list = Arrays.asList(1.0, 2d, 3.78, 4.6, 56d);
		// print it's contents
		printListElements(list);
		System.out.println();
		List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
		// print it's contents
		printListElements(list2);
		System.out.println();
		List<String> list3 = Arrays.asList("aa", "bb", "cc");
		// print it's contents
		printListElements(list3);
		//via type parameter : T
		System.out.println("Using generic methods : with T");
		printListElements2(list);
		System.out.println();
		printListElements2(list2);
		System.out.println();
		printListElements2(list3);
	}

}
