import java.util.*;
import java.util.Calendar;

public class RegularEmployee extends Employee {
	
	private double performanceScore;
	private double bonus;
	
	public RegularEmployee(int id,String firstName,String lastName,String gender,Calendar birthDate,String maritalStatus,String hasDriverLicence,
								double salary,Calendar hireDate,Department department,double performanceScore) {
		
		super(id,firstName,lastName,gender,birthDate,maritalStatus,hasDriverLicence,salary,hireDate,department);
		
		setPerformanceScore(performanceScore);					
		
	}
	
	public RegularEmployee(Employee employee, double perfScore) {
		

		super(employee.getId(),employee.getFirstName(),employee.getLastName(),employee.getGender(),employee.getBirthDate(),employee.getMaritalStatus(),
					employee.getHasDriverLicence(),employee.getSalary(),employee.getHireDate(),employee.getDepartment());
		
		setPerformanceScore(perfScore);
		
		
	}
	
	//Getter and Setters

	public double getPerformanceScore() {
		return performanceScore;
	}

	public void setPerformanceScore(double performanceScore) {
		this.performanceScore = performanceScore;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	//toString method
		public String toString() {
			return String.format("%s\r\n%s%.1f %s %.1f %s",super.toString(),"RegularEmployee Info  [performanceScore= ",
					getPerformanceScore(),"bonus=" ,getBonus(),"]");
					
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
