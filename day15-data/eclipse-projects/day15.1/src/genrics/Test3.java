package genrics;
import static utils.GenericUtils.*;

import java.util.Arrays;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		//create fixed size emp list
		List<Emp> list1=Arrays.asList(new Emp(),new Emp(),new Emp());
		invokeComputeSalary(list1);
		//SalesMgr IS-A Emp
		//create fixed size sales mgr list
		List<SalesMgr> list2=Arrays.asList(new SalesMgr(),new SalesMgr());
		invokeComputeSalary(list2);
		//create fixed size Temp worker list
		List<TempWorker> list3=Arrays.asList(new TempWorker(),new TempWorker(),new TempWorker());
		invokeComputeSalary(list3);
		List<Double> list4=Arrays.asList(1.0,2d,3.78,4.6,56d);
//		invokeComputeSalary(list4);//javac err : ? extends Emp : Double IS NOT A Emp
		invokeComputeSalary2(list3);

	}

}
