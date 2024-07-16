/*
 * @author Aiden Lambert, Wesley Lui 
 */
public class Professor extends Person {
	// Member variables
	private String teacherNumber;
	private double salary;

	// Constructor
	public Professor(String name, String phoneNumber, String emailAddress, Address address, String teacherNumber,
			double salary) {
		super(name, phoneNumber, emailAddress, address);
		this.teacherNumber = teacherNumber;
		this.salary = salary;
	}

	// Getters
	public String getTeacherNumber() {
		return this.teacherNumber;
	}

	public double getSalary() {
		return this.salary;
	}

	// Setters
	public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// No additional Methods
}
