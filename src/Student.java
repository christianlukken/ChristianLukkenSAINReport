import java.util.ArrayList;

public class Student 
{
	private String name;
	private String userName;
	private String password;
	private Address address;
	private double gpa;

	ArrayList<Coureses>  coursesTakenInMajor = new ArrayList<Coureses>();
	ArrayList<Coureses>  coursesTakenOther = new ArrayList<Coureses>();
	ArrayList<Coureses>  coursesFailed = new ArrayList<Coureses>();
	ArrayList<Coureses>  coursesTaking = new ArrayList<Coureses>();
	ArrayList<Coureses>  coursesNeeded = new ArrayList<Coureses>();
	
	public Student(String name, String userName, String password, Address address, double gpa,
			ArrayList<Coureses> coursesTakenInMajor, ArrayList<Coureses> coursesTakenOther,
			ArrayList<Coureses> coursesFailed, ArrayList<Coureses> coursesTaking, ArrayList<Coureses> coursesNeeded) {
		super();
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.address = address;
		this.gpa = gpa;
		this.coursesTakenInMajor = coursesTakenInMajor;
		this.coursesTakenOther = coursesTakenOther;
		this.coursesFailed = coursesFailed;
		this.coursesTaking = coursesTaking;
		this.coursesNeeded = coursesNeeded;
	}
	
	
	public ArrayList<Coureses> getCoursesTakenInMajor() {
		return coursesTakenInMajor;
	}

	public void setCoursesTakenInMajor(ArrayList<Coureses> coursesTakenInMajor) {
		this.coursesTakenInMajor = coursesTakenInMajor;
	}

	public ArrayList<Coureses> getCoursesTakenOther() {
		return coursesTakenOther;
	}

	public void setCoursesTakenOther(ArrayList<Coureses> coursesTakenOther) {
		this.coursesTakenOther = coursesTakenOther;
	}

	public ArrayList<Coureses> getCoursesFailed() {
		return coursesFailed;
	}

	public void setCoursesFailed(ArrayList<Coureses> coursesFailed) {
		this.coursesFailed = coursesFailed;
	}

	public ArrayList<Coureses> getCoursesTaking() {
		return coursesTaking;
	}

	public void setCoursesTaking(ArrayList<Coureses> coursesTaking) {
		this.coursesTaking = coursesTaking;
	}

	public ArrayList<Coureses> getCoursesNeeded() {
		return coursesNeeded;
	}

	public void setCoursesNeeded(ArrayList<Coureses> coursesNeeded) {
		this.coursesNeeded = coursesNeeded;
	}

	
	

	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public Address getAddress()
	{
		return address;
	}
	public void setAddress(Address address) 
	{
		this.address = address;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
		

}
