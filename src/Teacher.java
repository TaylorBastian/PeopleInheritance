public class Teacher extends People {

	public int salary;

	public Teacher(String name, int age, int salary) {
		super(name, age);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}