
public class Coureses 
{
	private String courseNumber;
	private String courseTitle;
	private double credits;
	private String major;
	private String description;
	
	public String getCourseNumber() {
		return courseNumber;
	}
	public Coureses(String courseNumber, String courseTitle, double credits, String grade, String type,
			String description) {
		super();
		this.courseNumber = courseNumber;
		this.courseTitle = courseTitle;
		this.credits = credits;
		this.major = type;
		this.description = description;
	}
	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public double getCredits() {
		return credits;
	}
	public void setCredits(double credits) {
		this.credits = credits;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String Major) {
		this.major = Major;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
