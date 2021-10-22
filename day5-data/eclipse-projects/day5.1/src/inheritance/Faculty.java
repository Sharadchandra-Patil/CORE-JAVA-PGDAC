package inheritance;

public class Faculty extends Person {
	private int experienceInYrs;
	private String sme;

	public Faculty(String fn1, String ln1, int yrs, String sme) {
		super(fn1, ln1);
		System.out.println("in faculty ctor");
		experienceInYrs = yrs;
		this.sme = sme;
	}

	// add overriding form of toString , inherited from Person class
	public String toString() {
		return "Faculty " + super.toString() + " exp in yrs " + experienceInYrs + " expert in " + sme;
	}

}
