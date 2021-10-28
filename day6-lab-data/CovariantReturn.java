package covariance_demo;

class Grain {

	@Override
	public String toString() {
		return "Grain";
	}
}

class Wheat extends Grain {
	@Override
	public String toString() {
		return "Wheat";
	}
}

class Mill {
	
	Grain process() {
		return new Grain();
	}
}

class WheatMill extends Mill {
	@Override
	Wheat process() { //eg of co-variant ret type
		return new Wheat();
	}
}

public class CovariantReturn {
	public static void main(String[] args) {
		Mill m = new Mill();//direct ref 
		Grain g = m.process();//RHS : Grain , LHS : Grain => direct ref.
		System.out.println(g);//g.toString() : "Grain"
		m = new WheatMill();//LHS : Mill , RHS : WheatMill --super cls ref ----> sub class obj (up casting)
		g = m.process();//whr will javac chk for process method : exists --no javac err, JVM : whose process method :
		//on WheatMill object : rets Wheat 
		//in line 38 : LHS : g : Grain ---> Wheat 
		System.out.println(g);//g.toString, JVM : Wheat's toString : Wheat
	}
}
