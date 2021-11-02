package sets2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class IntegerSet {

	public static void main(String[] args) {
		//create empty HS to store Integer type of refs
		HashSet<Integer> hs=new HashSet<>();//<> => type of the RHS is inferred from LHS
		int[] data= {10,12,10,23,1,45,-78,10};
		//populate HS from this int[]
		for(int i : data)
			System.out.println("Added "+hs.add(i));//auto boxing : refs
		//display HS 
		System.out.println(hs);//no dups , un ordered , un sorted!!!!
		System.out.println(hs.size());//6
		
		List<Integer> list=Arrays.asList(10,20,10,20,30,4,5,6,67,20);
		System.out.println(list);//dups , ordered , un sorted
		//create populated HS from fixed size integer list
		//Ctor of HashSet(Collection<? extends E> coll)
		HashSet<Integer> hs2=new HashSet<>(list);
		//can u attach an iterator to HS ? 
		System.out.println("HS2 via Iterator");
		Iterator<Integer> itr=hs2.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());//[67, 20, 4, 5, 6, 4567, 10, 30]
//		//what will happen ?
		System.out.println(hs2.add(4567));//t
		System.out.println(hs2);
//		while(itr.hasNext())
//			System.out.println(itr.next());//ConcurrentModificationExc
		System.out.println(hs2.contains(4567));//t
		System.out.println(hs2.remove(4567));//t
		System.out.println(hs2.contains(4567));//f
		System.out.println(hs2);
		
		

	}

}
