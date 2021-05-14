package kampOdev;

public class StudentManager extends UserManager{
	
	@Override
	public void add(User user) {
		System.out.println("Student " + user.getFirstName() +" "+ "Added.");
	}
	@Override
	public void delete(User user) {
		System.out.println("Student " + user.getFirstName() + " "+ "Deleted.");
	}
	@Override
	public void about(User user) {
		System.out.println("Student International ID : " + user.getInternationalId() +" \nStudent Name :  "+ user.getFirstName() + "\nStudent Last Name :" + user.getLastName()+ 
				"\nStudent International ID : " + user.getInternationalId());
	}
	
}
