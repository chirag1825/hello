package q2;

class Emp1 {

	String cmpname;
	String empname;
	double empsal;

	public Emp1(String cmpname, String empname, double empsal) {
		this.cmpname = cmpname;
		this.empname = empname;
		this.empsal = empsal;
	}

	public double empSal(double bounes, double tax) {
		return (this.empsal + bounes) - (((this.empsal + bounes) * tax / 100));
	}
}

class Emp2 extends Emp1 {

	public Emp2(String cmpname, String empname, double empsal) {
		super(cmpname, empname, empsal);
	}

	@Override
	public double empSal(double bounes, double tax) {
		return super.empSal(empsal, bounes);
	}
}

public class Main {
	public static void main(String[] args) {
		Emp1 emp = new Emp1("Google", "sam", 50000);
//		emp.empDetails("Dean", 101);

		System.out.println(emp.empSal(50000, 5));

	}
}
