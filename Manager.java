import java.util.*;
import java.util.Calendar;

public class Manager extends Employee{
	private ArrayList<RegularEmployee>regularEmployees;
	private double bonusBudget;
	
	
	public Manager(int id,String firstName,String lastName,String gender,Calendar birthDate,String maritalStatus,String hasDriverLicence,
			double salary,Calendar hireDate,Department department,double bonusBudget) {
		
		super(id,firstName,lastName,gender,birthDate,maritalStatus,hasDriverLicence,salary,hireDate,department);
		
		setBonusBudget(bonusBudget);
		setRegularEmployees(regularEmployees);
		
	}
	
	
	public Manager(Employee employee, double bonusBudget) {

		super(employee.getId(),employee.getFirstName(),employee.getLastName(),employee.getGender(),employee.getBirthDate(),employee.getMaritalStatus(),
					employee.getHasDriverLicence(),employee.getSalary(),employee.getHireDate(),employee.getDepartment());
		this.bonusBudget = bonusBudget;
	}
	
	public void addEmployee(RegularEmployee e ) {
		regularEmployees.add(e);
	}
	public void removeEmployee(RegularEmployee e) {
		regularEmployees.remove(e);
	}
	
	public void distributeBonusBudget() {
		
	
	}

	//getters and setters
	public ArrayList<RegularEmployee> getRegularEmployees() {
		return regularEmployees;
	}


	public void setRegularEmployees(ArrayList<RegularEmployee> regularEmployees) {
		this.regularEmployees = regularEmployees;
	}


	public double getBonusBudget() {
		return bonusBudget;
	}


	public void setBonusBudget(double bonusBudget) {
		this.bonusBudget = bonusBudget;
	}
	
	
	//toString methods
		public String toString() {
			return String.format("\n%s%d %s%s %s%s %s" ,"Manager [id=",super.getId(),"firstName=",super.getFirstName(),
					"lastName=",super.getLastName(),"]");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
