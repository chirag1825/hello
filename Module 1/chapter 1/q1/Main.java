package q1;

class Emp {
	String name;
	int id;
	double sal;
	String add;

	public Emp(String name, int id, double sal, String add) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.add = add;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", add=" + add + "]";
	}

}

public class Main {
	public static void main(String[] args) {

		Emp emp = new Emp("SAM", 10, 1000000, "USA");
		System.out.println(emp);

	}
}
