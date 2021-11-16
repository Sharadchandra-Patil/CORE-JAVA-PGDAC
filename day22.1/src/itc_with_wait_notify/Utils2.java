package itc_with_wait_notify;

public class Utils2 {
	private Emp e;
	private boolean dataReady;

	public synchronized void writeData(Emp ref) throws Exception {
		System.out.println("w entered --- " + Thread.currentThread().getName());// producer
		while (dataReady) // stay blocked till data is rdy
			wait();
		// dataRdy : false =>produce data
		e = ref;
		System.out.println("Write Data " + e);
		System.out.println("w exited --- " + Thread.currentThread().getName());// producer
		dataReady = true;
		notify();
	}

	public synchronized Emp readData() throws Exception {
		System.out.println("r entered --- " + Thread.currentThread().getName());// consumer
		while (!dataReady)
			wait();

		// => dataReady : true => consume data
		System.out.println("Read  Data " + e);
		System.out.println("r exited --- " + Thread.currentThread().getName());// consumer
		dataReady = false;
		notify();
		return e;
	}

}
