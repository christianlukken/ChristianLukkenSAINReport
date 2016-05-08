import java.util.ArrayList;

public class InstructorBag 
{
	private ArrayList<Instructor>  ListOfInstructors = new ArrayList<Instructor>();

	public ArrayList<Instructor> getListOfInstructors() {
		return ListOfInstructors;
	}

	public void setListOfInstructors(ArrayList<Instructor> listOfInstructors) {
		ListOfInstructors = listOfInstructors;
	}
}
