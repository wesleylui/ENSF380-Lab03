/*
 * @author Aiden Lambert, Wesley Lui 
 */
public class University {
	public static void main(String args[]) {
		// Create Address for Professor
		Address professorAddress = new Address("123", "CityA", "StateA", "T3HA0A", "CountryA");

		// Create Address for Student
		Address studentAddress = new Address("24", "CityB", "StateB", "T3H 2L4", "CountryB");

		// Create Professor Dr. Lui
		Professor professorLui = new Professor("Dr. Lui", "123-123-1234", "lui@example.com", professorAddress, "1234",
				100000);
		System.out.println("Professor successfully created!");

		// Create Student Kobe Bryant
		Student studentKobe = new Student("Kobe Bryant", "824-824-2424", "kobe24@example.com", studentAddress, "24",
				professorLui, 2.4);
		System.out.println("Student successfully created!");

		// Print Professor details
		System.out.println("Professor Details:\n");
		System.out.println("Name: " + professorLui.getName());
		System.out.println("Phone Number: " + professorLui.getPhoneNumber());
		System.out.println("Email: " + professorLui.getEmailAddress());
		System.out.println("Address: " + professorLui.getAddress().outputAsLabel());
		System.out.println("Teacher Number: " + professorLui.getTeacherNumber());
		System.out.println("Salary: " + professorLui.getSalary());
		System.out.println("Address Valid: " + professorLui.hasValidAddress());

		// Print Student Details
		System.out.println("\nStudent Details:\n");
		System.out.println("Name: " + studentKobe.getName());
		System.out.println("Phone Number: " + studentKobe.getPhoneNumber());
		System.out.println("Email: " + studentKobe.getEmailAddress());
		System.out.println("Address: " + studentKobe.getAddress().outputAsLabel());
		System.out.println("Student Number: " + studentKobe.getStudentNumber());
		System.out.println("Supervisor: " + studentKobe.getSupervisor().getName());
		System.out.println("Average Mark: " + studentKobe.getAverageMark());
		System.out.println("Address Valid: " + studentKobe.hasValidAddress());
	}
}
