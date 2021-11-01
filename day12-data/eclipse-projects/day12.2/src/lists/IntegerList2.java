package lists;

import java.util.ArrayList;
import java.util.Iterator;

public class IntegerList2 {

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
		list.add(0,999);
		System.out.println("list after insert "+list);//999, 10, 23, 45, -1, 45, 10, 45, 78, 22, 33, 67]
		//create another populated AL<Integer> having same elems as list
	//	ArrayList<Integer> list2=new ArrayList<Integer>(list);
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.addAll(list);
		System.out.println("List2 contents "+list2);//999, 10, 23, 45, -1, 45, 10, 45, 78, 22, 33, 67]
		System.out.println(list2.set(list.size()-1, 5555));//67
		System.out.println("list after set "+list);//999, 10, 23, 45, -1, 45, 10, 45, 78, 22, 33, 67
		System.out.println("list2 after set "+list2);//999, 10, 23, 45, -1, 45, 10, 45, 78, 22, 33, 5555
		System.out.println(list.contains(10));//t
		System.out.println(list.indexOf(10)+" "+list.lastIndexOf(10));//1 6
		System.out.println(list.remove(0));//10, 23, 45, -1, 45, 10, 45, 78, 22, 33, 67
		System.out.println(list.indexOf(10));//0
		
		
	}

}
