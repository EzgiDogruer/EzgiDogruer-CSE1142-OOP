
import java.util.*;
public class Developer extends RegularEmployee{
	//Fields.
	private ArrayList<Project> projects=new ArrayList<Project>();
	private static int numberOfDevelopers;
	
	//Define constructors
	public Developer(int id,String firstName,String lastName,String gender,Calendar birthDate,
			String maritalStatus,String hasDriverLicence,double salary,Calendar hireDate,
			Department department,double pScore,ArrayList<Project> p) {
		super(id, firstName,lastName, gender, birthDate,
		maritalStatus, hasDriverLicence,salary,hireDate,department,pScore);
		
		setProjects(p);
		numberOfDevelopers++;
		
	}
	public Developer(RegularEmployee re, ArrayList<Project> p) {
		super(re.getId(),re.getFirstName(),re.getLastName(),re.getGender(),re.getBirthDate()
		,re.getMaritalStatus(),re.getHasDriverLicence(),
		re.getSalary(),re.getHireDate(),re.getDepartment(),re.getPerformanceScore());
		setProjects(p);
		numberOfDevelopers++;
	}
	public boolean addProject(Project s) {
		projects.add(s);
		return true;
	}
	public boolean remove(Project s) {
		projects.remove(s);
		return true;
	}
	
	//getter setter methods
	public ArrayList<Project> getProjects() {
		return projects;
	}
	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}
	public static int getNumberOfDevelopers() {
		return numberOfDevelopers;
	}
	public static void setNumberOfDevelopers(int numberOfDevelopers) {
		Developer.numberOfDevelopers = numberOfDevelopers;
	}
	
	
	//toString methods
	public String toString() {
		return String.format("%s \r\n%s",super.toString(),getProjects().toString());
	}
}
