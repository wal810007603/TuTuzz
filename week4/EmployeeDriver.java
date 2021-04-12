package week4;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee e1 = new Employee("003", "ÕÅÈý", 3000f);
		Employee e2 = new Employee("004", "ÀîËÄ", 4000f);
		Employee e3 = new Employee("005", "ÍõÎå", 5000f);

 e1.updateSalary();
 e2.updateSalary();
 e3.updateSalary();

		System.out.println(e1.detail());
		System.out.println(e2.detail());
		System.out.println(e3.detail());
	}

}
