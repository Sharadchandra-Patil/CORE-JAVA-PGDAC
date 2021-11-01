package lists;

import java.util.ArrayList;
import java.util.Iterator;

public class IntegerList {

	public static void main(String[] args) {
		// Create empty ArrayList(AL) to hold Integer type of refs
		ArrayList<Integer> list = new ArrayList<>();// size=0,capa=10 : single AL instance created heap
		System.out.println("init contents of the list"); // iterate over the size =0
		for (int i : list)
			System.out.println(i);
		// int[] : sample data
		int[] data = { 10, 23, 45, -1, 45, 10, 45, 78, 22, 33, 67 };
		// populate AL from this sample data
		for (int i : data)// impl conversion : NONE ! i=data[0],i=data[1]....
			list.add(i);// impl conversion : int --->Integer (auto boxing)
		System.out.println("List contents via toString " + list);
		System.out.println("printing list using for-each");
		// can u attach implicit Iterator(for-each) to the AL ? YES
		for (int i : list)// impl conversion : Integer -->int : auto un boxing
			System.out.println(i);
		// can u attach for loop ?
		System.out.println("printing list using for loop");
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));//if u access outside 0---size-1 : IndexOutOfBoundsException
		System.out.println("printing list using Iterator");
		// 1 . Attach Iterator to the AL
		Iterator<Integer> itr = list.iterator();//position of Itr : BEFORE the 1st element
		while(itr.hasNext())
			System.out.println(itr.next());
		//what's pos if Iterator : after last elem
	//	System.out.println(itr.next());//java.util.NoSuchElementException

	}

}
