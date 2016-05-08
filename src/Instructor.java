import java.util.ArrayList;

public class Instructor 
{
	private String officeHours;
	private String phoneNumber;
	private String userName;
	private String password;
	private Address address;
	
	ArrayList<InstructorCourses> courses = new ArrayList<InstructorCourses>();
	ArrayList<InstructorCourses> pastCourses= new ArrayList<InstructorCourses>();

	public Instructor(String userName, String password, Address address, ArrayList<InstructorCourses> courses, ArrayList<InstructorCourses> pastCourses) {
		super();
		this.userName = userName;
		this.password = password;
		this.address = address;
		this.courses = courses;
		this.pastCourses= pastCourses;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ArrayList<InstructorCourses> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<InstructorCourses> courses) {
		this.courses = courses;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
