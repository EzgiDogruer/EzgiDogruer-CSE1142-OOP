
public class Department {
	private int departmentId;
	private String departmentName;
	
	//Define constructor
	public Department(int departmentId,String departmentName) {
		this.departmentId=departmentId;
		this.departmentName=departmentName;
	}

	//Getter setter methods
	public int getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	//toString methods
	public String toString() {
		return String.format("%s%d   %s%s%s","Department  [departmentId=",getDepartmentId()
				,"departmentName=",getDepartmentName(),"]");
	}
}
