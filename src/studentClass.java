
public class studentClass 
{
	private String Status;
	private String Instructor;
	private String Grade;
	private String startEndTime;
	private String startEndDate;
	private String meetingPlace;
	private Coureses course;
	
	
	
	public studentClass(String status, String instructor, String grade, String startEndTime, String startEndDate,
			String meetingPlace, Coureses course) {
		super();
		Status = status;
		Instructor = instructor;
		Grade = grade;
		this.startEndTime = startEndTime;
		this.startEndDate = startEndDate;
		this.meetingPlace = meetingPlace;
		this.course = course;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getInstructor() {
		return Instructor;
	}
	public void setInstructor(String instructor) {
		Instructor = instructor;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
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
	
}
