package thrd_unsafe_coll;

import java.util.List;
import java.util.Vector;
import java.util.stream.IntStream;

public class ThreadUnsafeCollections {
	public static void main(String[] args) throws Exception {
		List<Integer> list = new Vector<>(100000);
		IntStream.range(1, 100000).forEach(list::add);//auto boxing
		// Thread(Runnable instance,String name)
		
		
		  Thread reader = new Thread(() -> { list.forEach(i -> System.out.println("r "
		  + i));// forEach : for-each : implicit Iterator(fail-fast)
		  }, "t1");
		  
		  Thread  writer = new Thread(() -> { IntStream.range(100001,
		  200001).forEach(list::add); }, "t2");
		 

		/*
		 * Thread reader = new Thread(() -> {synchronized(list) { list.forEach(i ->
		 * System.out.println("r " + i));// forEach : for-each : implicit
		 * Iterator(fail-fast) }}, "t1");
		 * 
		 * Thread writer = new Thread(() -> { synchronized(list) {
		 * IntStream.range(10001, 20001).forEach(list::add); }}, "t2");
		 */
		
		reader.start();
		Thread.sleep(10);
		writer.start();
		reader.join();//2 runnable (t1 n t2) main : Blocked on join
		writer.join();
		System.out.println("main over...");
	}
}