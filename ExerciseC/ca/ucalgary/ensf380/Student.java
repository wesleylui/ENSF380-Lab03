/*
 * @author Aiden Lambert, Wesley Lui 
 */
public class Student {
	// Member Variables
	private String studentNumber;
	private Professor supervisor;
	private double averageMark;

	// Constructor

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

	}
}
