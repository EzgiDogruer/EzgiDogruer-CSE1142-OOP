import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Employee extends Person {
	//Fields 
		private double salary;
		private Calendar hireDate;
		private Department department;
		private static int numberofEmployees;
		
		//Define constructors
		public Employee (int id,String firstName,String lastName,String gender,Calendar birthDate,String maritalStatus,String hasDriverLicence,
								double salary,Calendar hireDate,Department department) {
			
			
			super(id,firstName,lastName,gender,birthDate,maritalStatus,hasDriverLicence);
			setSalary(salary);
			setHireDate(hireDate);
			setDepartment(department);
			numberofEmployees++;
			
		}
		
		public Employee(Person person,double salary,Calendar hireDate,Department department) {
			
			super(person.getId(),person.getFirstName(),person.getLastName(),person.getGender(),person.getBirthDate(),person.getMaritalStatus(),person.getHasDriverLicence());
			setSalary(salary);
			setHireDate(hireDate);
			setDepartment(department);
			numberofEmployees++;
			
		}
		
		//If the parameter double percent,use this method
				public double raiseSalary(double percent) throws Exception {
					if(0<=percent&& percent<=1) {
						double plusSalary1=getSalary()*percent + getSalary();
						return plusSalary1;
					}
					else 
						throw new Exception("Percent must be 0<=percent<=1");
				}
				//If the parameter int amount ,use this method
				public double raiseSalary(int amount) {
					double plusSalary2=getSalary()+amount;
					return plusSalary2;
				}
		
		
				//Getter setter methods
				public double getSalary() {
					return salary;
				}
				public void setSalary(double salary) {
					this.salary = salary;
				}
				public Calendar getHireDate() {
					return hireDate;
				}
				public void setHireDate(Calendar hireDate) {
					this.hireDate = hireDate;
				}
				public Department getDepartment() {
					return department;
				}
				public void setDepartment(Department department) {
					this.department = department;
				}
				public static int getNumberofEmployees() {
					return numberofEmployees;
				}
				public static void setNumberofEmployees(int numberofEmployees) {
					Employee.numberofEmployees = numberofEmployees;
				}
				
				
				//to String method
				public String toString() {
					//convert date to string
					DateFormat datef= new SimpleDateFormat("dd/MM/yyyy");
					String hDay=datef.format(hireDate.getTime());
					
					
					
					return String.format("%s\r\n%s %.2f %s %s]",super.toString(),"Employee Info  [salary=",getSalary(),", hireDate=",hDay);
				}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
