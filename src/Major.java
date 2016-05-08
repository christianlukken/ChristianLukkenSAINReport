import java.util.ArrayList;

public class Major 
{
	private String title;
	private String ID;
	private double credits;
	private ArrayList<Coureses>  coursesInMajor = new ArrayList<Coureses>();
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public double getCredits() {
		return credits;
	}
	public void setCredits(double credits) {
		this.credits = credits;
	}
	public ArrayList<Coureses> getCoursesInMajor() {
		return coursesInMajor;
	}
	public void setCoursesInMajor(ArrayList<Coureses> coursesInMajor) {
		this.coursesInMajor = coursesInMajor;
	}
	
}
