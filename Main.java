package kampOdev;

public class Main {

	public static void main(String[] args) {

		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setInternationalId("74102589632");
		instructor.setInstructorRate("8");

		Student student = new Student();
		student.setId(2);
		student.setFirstName("Ceyda");
		student.setLastName("Önal");
		student.setInternationalId("11071107110");
		student.setStudentNumber("818");

		User user = new User();

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		System.out.println(" ");
		instructorManager.delete(instructor);
		System.out.println(" ");
		instructorManager.about(instructor);
		System.out.println("********************************************");

		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		System.out.println(" ");
		studentManager.delete(student);
		System.out.println(" ");
		studentManager.about(student);
		System.out.println("********************************************");

		UserManager userManager = new UserManager();
		userManager.add(user);
		System.out.println(" ");
		userManager.delete(user);
		System.out.print("");

	}
}
