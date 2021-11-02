package genrics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<?> list=Arrays.asList(1.0,2d,3.78,4.6,56d);//int ---> Integer --XX--> Double
		System.out.println(list);//ordered o/p
		Collections.reverse(list);
		System.out.println(list);//reversed o/p

	}

}
