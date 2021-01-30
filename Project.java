
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Project {
	private String projectName;
	private java.util.Calendar startDate;
	private boolean state;
	
	
	//Define constructor
	public Project(String pName,Calendar startDate,String state) {
		projectName=pName;
		this.startDate=startDate;
		this.state=Boolean.valueOf(state);
	}

	
	//getter setter methods
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public java.util.Calendar getStartDate() {
		return startDate;
	}

	public void setStartDate(java.util.Calendar startDate) {
		this.startDate = startDate;
	}
	
	public String getState() {
		if(this.state==true) {
			return "true";
		}
		else if(this.state==false) {
		return "false";
		}
		return "Unknown";
	}
	//If state is open,convert to true
	//If state is close,convert to false
	public void setState(String state) {
		if(state.equals("Open")) {
			this.state=Boolean.valueOf(true);
		}
		else if (state.equals("Close")){
			this.state=Boolean.valueOf(false);
		}
	}
	
	//If project is open,this method closed the this project.
	public void close() {
		if(Boolean.valueOf(state)==true){
			System.out.println("Project is closed.");
			
		}
		else if(Boolean.valueOf(state)==false){
			System.out.println("Project is already closed.");
		}
	}
	
	//toString methods
	public String toString() {
		
				//convert date to string
				DateFormat datef= new SimpleDateFormat("dd/MM/yyyy");
				String sDay=datef.format(startDate.getTime());
				
		return String.format("%s%s%s%s%s%s]","Project  [projectName=" ,getProjectName(),", startDate=",sDay,",  state=",getState());
	}
}
