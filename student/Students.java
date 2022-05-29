package Org.student;

public class Students {

	public void getStudentInfo(int studentID) {
		System.out.println("Student ID is :"+studentID);
	}

	public void getStudentInfo(int studentID, String studentName) {
		System.out.println("Studentinformation is: "+studentID+" , "+studentName);
	}

	public void getStudentInfo(String email, String phoneNumber) {
		System.out.println("StudentContactinformation is: ".concat(email).concat(" , " ).concat(phoneNumber));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students students = new Students();

		students.getStudentInfo(12345);
		students.getStudentInfo(54321, "Deepika Paranthaman");
		students.getStudentInfo("deepika.p@testleaf.com", "9723434120");
	}

}
