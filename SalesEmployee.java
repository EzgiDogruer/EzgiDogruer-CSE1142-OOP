
import java.util.*;
public class SalesEmployee extends RegularEmployee {
	private ArrayList<Product> sales;
	private static int numberofSalesEmployees;
	
	//Define constructors
	public SalesEmployee(int id,String firstName,String lastName,String gender,Calendar birthDate,
		String maritalStatus,String hasDriverLicence,double salary,Calendar hireDate,
		Department department,double pScore,ArrayList<Product> s) {
		
		super(id,firstName,lastName,gender,birthDate,maritalStatus,
				hasDriverLicence,salary,hireDate,department,pScore);
		
		setSales(s);
		numberofSalesEmployees++;
	}
	public SalesEmployee(RegularEmployee re,ArrayList<Product> s) {
		super(re.getId(),re.getFirstName(),re.getLastName(),re.getGender(),
		re.getBirthDate(),re.getMaritalStatus(),re.getHasDriverLicence(),
		re.getSalary(),re.getHireDate(),re.getDepartment(),re.getPerformanceScore());
		
		setSales(s);
		numberofSalesEmployees++;
	}
	
	public boolean addSale(Product s) {
		if(sales.add(s)) 		
			return true;
		else
			return false;
	}
	public boolean removeSale(Product s) {
		if(sales.remove(s)) 
			return true;	
		
		else
			return false;
		
	}
	//getter setter methods
	public ArrayList<Product> getSales() {
		return sales;
	}
	public void setSales(ArrayList<Product> sales) {
		this.sales = sales;
	}
	public static int getNumberofSalesEmployees() {
		return numberofSalesEmployees;
	}
	public static void setNumberofSalesEmployees(int numberofSalesEmployees) {
		SalesEmployee.numberofSalesEmployees = numberofSalesEmployees;
	}
	
	//toString methods
	public String toString() {
		return String.format("%s\r\n%s",super.toString(),getSales());
	}
}

