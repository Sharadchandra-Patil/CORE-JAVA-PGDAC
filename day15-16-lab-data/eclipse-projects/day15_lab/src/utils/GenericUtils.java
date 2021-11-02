package utils;

import java.util.List;

public class GenericUtils {
	/*
	 * 2. Write a method to Find max number from ANY List(AL/LL/Vector) of any
	 * numbers (integer / float / double ...) n return it to the caller. Hint :
	 * compareTo
	 */
	// solve it using ? n Tsyntax
	public static <T extends Number & Comparable<T>> T findMax(List<T> list) {
		T max = list.get(0);
		for (int i = 1; i < list.size(); i++)
			if (list.get(i).compareTo(max) > 0)
				max = list.get(i);
		return max;
	}
	public static <T extends  Comparable<T>> T findAnyMax(List<T> list) {
		T max = list.get(0);
		for (int i = 1; i < list.size(); i++)
			if (list.get(i).compareTo(max) > 0)
				max = list.get(i);
		return max;
	}

}
