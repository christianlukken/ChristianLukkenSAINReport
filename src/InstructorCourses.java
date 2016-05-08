import java.util.ArrayList;

public class InstructorCourses
{
	
	private String startEndTime;
	private String startEndDate;
	private String meetingPlace;
	private Coureses course;
	ArrayList<ClassList>  classList = new ArrayList<ClassList>();
	
	
	
	public InstructorCourses(String startEndTime, String startEndDate, String meetingPlace, Coureses course,
			ArrayList<ClassList> classList) {
		super();
		this.startEndTime = startEndTime;
		this.startEndDate = startEndDate;
		this.meetingPlace = meetingPlace;
		this.course = course;
		this.classList = classList;
	}
	public String getStartEndTime() {
		return startEndTime;
	}
	public void setStartEndTime(String startEndTime) {
		this.startEndTime = startEndTime;
	}
	public String getStartEndDate() {
		return startEndDate;
	}
	public void setStartEndDate(String startEndDate) {
		this.startEndDate = startEndDate;
	}
	public String getMeetingPlace() {
		return meetingPlace;
	}
	public void setMeetingPlace(String meetingPlace) {
		this.meetingPlace = meetingPlace;
	}
	public Coureses getCourse() {
		return course;
	}
	public void setCourse(Coureses course) {
		this.course = course;
	}
	public ArrayList<ClassList> getClassList() {
		return classList;
	}
	public void setClassList(ArrayList<ClassList> classList) {
		this.classList = classList;
	}
	
	
}
