package maps;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		System.out.println("Added "+hm.put(101, "abc1"));//null : new entry(k n v pair) : impl auto boxing
		System.out.println("Added "+hm.put(10, "abc2"));//null
		System.out.println("Added "+hm.put(101, "abc3"));//abc1
		System.out.println("Added "+hm.put(11, "abc4"));//null
		System.out.println("Added "+hm.put(101, "abc5"));//abc3
		System.out.println("HM : "+hm);//{101:abc5 , 10:abc2 , 11:abc4}
		System.out.println("size "+hm.size());//3

	}

}
