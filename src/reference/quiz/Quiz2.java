package reference.quiz;

public class Quiz2 {
	public static void main(String[] args) {
		Employee emp1 = new Employee("둘리",23,400,2);
		Employee emp2 = new Employee("또치",33,500,3);
		Employee emp3 = new Employee("마이콜",43,600,4);
		Employee emp4 = new Employee("치치",53,700,7);
		Department dep = new Department(emp1, emp2, emp3);
		System.out.println(dep.toString());
	}
}

class Department{
	Employee emp1;
	Employee emp2;
	Employee emp3;
	
	public Department(Employee emp1, Employee emp2, Employee emp3) {
		super();
		this.emp1 = emp1;
		this.emp2 = emp2;
		this.emp3 = emp3;
	}

	@Override
	public String toString() {
		return "Department [emp1=" + emp1 + ", emp2=" + emp2 + ", emp=" + emp3 + "]";
	}
	
	
	
}

class Employee{
	String name;
	int age;
	int pay;
	int year;
	
	public Employee(String name, int age, int pay, int year) {
		super();
		this.name = name;
		this.age = age;
		this.pay = pay;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", pay=" + pay + ", year=" + year + "]\n";
	}

	
	
	
}
