public class Student extends People {

	public String major;
	
	

	public Student(String name, int age,String major) {
		super(name, age);
		this.major=major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
