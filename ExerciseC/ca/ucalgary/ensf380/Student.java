/*
 * @author Aiden Lambert, Wesley Lui 
 */
public class Student extends Person{
	// Member Variables
	private String studentNumber;
	private Professor supervisor;
	private double averageMark;

	// Constructor
	public Student(String name, String phoneNumber, String emailAddress, Address address,
			String studentNumber, Professor supervisor, double averageMark) {
		super(name, phoneNumber, emailAddress, address);
		this.studentNumber = studentNumber;
		this.supervisor = supervisor;
		this.averageMark = averageMark;
	}

	// Getters
	public String getStudentNumber() {
		return this.studentNumber;
	}

	public Professor getSupervisor() {
		return this.supervisor;
	}

	public double getAverageMark() {
		return this.averageMark;
	}

	// Setters

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public void setSupervisor(Professor supervisor) {
		this.supervisor = supervisor;
	}

	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}

	// More methods
	public boolean isEligibleToEnroll() {
		// Imagine a student needs an average mark above 2.0 to be eligible to enroll
		return averageMark >= 2.0;
	}
}
