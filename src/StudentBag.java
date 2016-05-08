import java.util.ArrayList;

public class StudentBag
{
	private ArrayList<Student>  Students = new ArrayList<Student>();

	public StudentBag(ArrayList<Student> students) {
		super();
		Students = students;
	}

	public ArrayList<Student> getStudents() {
		return Students;
	}

	public void setStudents(ArrayList<Student> students) {
		Students = students;
	}
	

	
}
