import java.io.*;
import java.util.*;
import java.text.*;
public class Test {
	
		public static void main(String[] args) throws FileNotFoundException,Exception {
	//Define input and output files.
			File fileInput= new File("input.txt");
			File fileOutput=new File("output.txt");
			
			ArrayList<Department> ArrayListDepartment= new ArrayList<Department>();
			ArrayList<Person> ArrayListPerson = new ArrayList<Person>();
			ArrayList<Manager> ArrayListManager = new ArrayList<Manager>();
			ArrayList<Employee> ArrayListEmployee = new ArrayList<Employee>();
			ArrayList<RegularEmployee> ArrayListRegularEmployee = new ArrayList<RegularEmployee>();
			ArrayList<Developer> ArrayListDeveloper = new ArrayList<Developer>();
			ArrayList<SalesEmployee> ArrayListSalesEmployee = new ArrayList<SalesEmployee>();
			ArrayList<Customer> ArrayListCustomer = new ArrayList<Customer>();
			ArrayList<Product> ArrayListProduct = new ArrayList<Product>();
			ArrayList<Project> ArrayListProject = new ArrayList<Project>();
			ArrayList<Integer>  personIdArrayList=new ArrayList<Integer>();
			
			try (Scanner file = new Scanner(fileInput)){
				
				while(file.hasNext()) {
					String className = file.next();
					
				//Read Departments
					
				if(className.equals("Department")) {
					int departmentId = file.nextInt();
					String departmentName = file.next();
					
					Department department = new Department (departmentId,departmentName);
					ArrayListDepartment.add(department);
				}
					
				//Read Projects
				
				if(className.equals("Project")) {
					String projectName = file.next();
					String sDate = file.next();
					String state1 = file.next();
					//set startDate
					Calendar calendar = Calendar.getInstance();
					DateFormat startDate = new SimpleDateFormat("dd/MM/yyyy");
					calendar.setTime(startDate.parse(sDate));
					
					Project project = new Project (projectName,calendar,state1);
					ArrayListProject.add(project);
				}
				//Read Product
				
				if(className.equals("Product")) {
					String productName = file.next();
					String trDate = file.next();
					double price = file.nextDouble();
					//set transactionDate
					Calendar calendar = Calendar.getInstance();
					DateFormat trDay = new SimpleDateFormat("dd/MM/yyyy");
					calendar.setTime(trDay.parse(trDate));
					
					Product product = new Product (productName,calendar,price);
					ArrayListProduct.add(product);
				}
					
				//Read Person	
					
				if(className.equals("Person")) {
					String firstName = file.next();
					String lastName = file.next();
					int Ýd = file.nextInt();
					String gender = file.next();
					String birthDate = file.next();
					String maritalStatus = file.next();
					String hasDriverLicence = file.next();
					
					//set birthDate
					Calendar calendar = Calendar.getInstance();
					DateFormat bDay = new SimpleDateFormat("dd/MM/yyyy");
					calendar.setTime(bDay.parse(birthDate));
					
					
					Person person = new Person(Ýd,firstName,lastName,gender,calendar,maritalStatus,hasDriverLicence);
					ArrayListPerson.add(person);
					
				}
					
				//Read customer
				
				if(className.equals("Customer")) {
					int customerId = file.nextInt();
					String productName = file.next();
					Product[] prodArray=ArrayListProduct.toArray(new Product[ArrayListProduct.size()]);
					Person[] perArray = ArrayListPerson.toArray(new Person[ArrayListPerson.size()]);
					
					for(int i=0 ;i<prodArray.length;i++) {
						if(productName.equals(prodArray[i].getProductName())) {
							ArrayList <Product> productS=new ArrayList<Product>();
							productS.add(prodArray[i]);
							
							for(int k=0; k<perArray.length; k++) {
								if(perArray[k].getId()==customerId) {
									
									Customer customer = new Customer(perArray[k],productS);	
									ArrayListCustomer.add(customer);
								}
								
						     }
					   }
				   }
		    	}	
					
				//Read employees
				if(className.equals("Employee")){
					int employeeId=file.nextInt();
					double salary=file.nextDouble();
					String hireDate=file.next();
					String d=file.next();
					
					//Generate a array from arraylists.
					Person[] personArray= ArrayListPerson.toArray(new Person[ArrayListPerson.size()]);
					Department[] departmentArray=ArrayListDepartment.toArray(new Department[ArrayListDepartment.size()]);
					
					//set hireDate
					Calendar calendar2= Calendar.getInstance();
					DateFormat hDay = new SimpleDateFormat("dd/MM/yyyy"); 
					calendar2.setTime(hDay.parse(hireDate));
					
					for(int k=0; k<departmentArray.length; k++) {
					if(d.equals(departmentArray[k].getDepartmentName())){
					for(int i=0; i<personArray.length;i++) {
						//If emloyee Id and person Id are equal,generate new Employee object
						if(employeeId==personArray[i].getId()) {
							Employee employee = new Employee(personArray[i],salary,calendar2,departmentArray[k]);
							ArrayListEmployee.add(employee);
						}	
	}
}
}
				}
			//Read Managers
				if(className.equals("Manager")) {
					int managerId=file.nextInt();
					double mbonusBudget=file.nextDouble();
					
					Employee[] employeeArray= ArrayListEmployee.toArray(new Employee[ArrayListEmployee.size()]);
					
					//If employee Id and manager Id are equal,to generate new object for manager class 
					for(int k=0; k<employeeArray.length; k++) {
						if(managerId==employeeArray[k].getId()){
							
							Manager manager=new Manager(employeeArray[k],mbonusBudget);
							ArrayListManager.add(manager);
	}
	}
				}
			//Read regularEmployees
				if(className.equals("RegularEmployee")) {
					int regularId=file.nextInt();
					double perforScore=file.nextDouble();
					
					Employee[] employeeArray= ArrayListEmployee.toArray(new Employee[ArrayListEmployee.size()]);
					//If employee Id and regularEmployee Id are equal,to generate new object for regular employee class 
					for(int k=0; k<employeeArray.length; k++) {
						if(regularId==employeeArray[k].getId()){
							
							RegularEmployee regemployee=new RegularEmployee(employeeArray[k],perforScore);
							ArrayListRegularEmployee.add(regemployee);
				}
					}
				}
			//Read salesEmployees
				if(className.equals("SalesEmployee")) {
					int salesId=file.nextInt();
					String producT=file.next();
					
					//Convert arraylists to arrays
					Product[] productArray= ArrayListProduct.toArray(new Product[ArrayListProduct.size()]);
					RegularEmployee[] remployeeArray= ArrayListRegularEmployee.toArray(new RegularEmployee[ArrayListRegularEmployee.size()]);
					for(int k=0; k<productArray.length;k++) {
						if(producT.equals(productArray[k].getProductName())) {
						ArrayList<Product> parrayList=new ArrayList<>();
						parrayList.add(productArray[k]);
							for(int i=0; i<remployeeArray.length ; i++) {
								if(salesId==remployeeArray[i].getId()) {
									
									SalesEmployee semployee=new SalesEmployee(remployeeArray[i],parrayList);
									ArrayListSalesEmployee.add(semployee);
								}
							}
					}
				}
				}
			//Read developers
				if(className.equals("Developer")) {
					int developerId=file.nextInt();
					String projectname=file.next();
					
					//Convert arraylist to array
					Project[] projectArray=ArrayListProject.toArray(new Project[ArrayListProject.size()]);
					RegularEmployee[] remployeeArray= ArrayListRegularEmployee.toArray(new RegularEmployee[ArrayListRegularEmployee.size()]);
					
					
					for(int k=0; k<projectArray.length;k++) {
						if(projectname.equals(projectArray[k].getProjectName())){
						ArrayList<Project> projectarrayList=new ArrayList<>();
						projectarrayList.add(projectArray[k]);
							//If developer Id and regularEmployee Id are equal,generate new developer class 
							//Put the objects in the developer arraylist
							for(int i=0; i<remployeeArray.length ; i++) {
								if(developerId==remployeeArray[i].getId()) {
									
									Developer developer=new Developer(remployeeArray[i],projectarrayList);
									ArrayListDeveloper.add(developer);
									
								}
							}
					}
				}
			}
				
			}
		}
		
		//These codes write in the output file with using inputfile informations.
					
			try(PrintWriter output = new PrintWriter("output.txt"))
			{
				//Convert to arraylists to arrays.
				Person[] personArrayresult= ArrayListPerson.toArray(new Person[ArrayListPerson.size()]);
				Department[] departmentArrayresult=ArrayListDepartment.toArray(new Department[ArrayListDepartment.size()]);
				Manager[] managerArrayresult= ArrayListManager.toArray(new Manager[ArrayListManager.size()]);
				Employee[] employeeArrayresult= ArrayListEmployee.toArray(new Employee[ArrayListEmployee.size()]);
				RegularEmployee[] remployeeArrayresult= ArrayListRegularEmployee.toArray(new RegularEmployee[ArrayListRegularEmployee.size()]);
				Product[] productArrayresult= ArrayListProduct.toArray(new Product[ArrayListProduct.size()]);
				Project[] projectArrayresult=ArrayListProject.toArray(new Project[ArrayListProject.size()]);
				Developer[] developerArray=ArrayListDeveloper.toArray(new Developer[ArrayListDeveloper.size()]);
				SalesEmployee[] semployeeArray=ArrayListSalesEmployee.toArray(new SalesEmployee[ArrayListSalesEmployee.size()]);
				Customer[] customerArray=ArrayListCustomer.toArray(new Customer[ArrayListCustomer.size()]);
				
				
				
				//for loop " departmentArrayresult"
				for(int i=0; i<departmentArrayresult.length; i++) {
					int a =0;
				output.println("************************************************************************");
				output.println(departmentArrayresult[i].toString());
				//Print manager
				for(int k=0; k<managerArrayresult.length;k++) {
					for(int y=0; y<employeeArrayresult.length; y++) {
						if(managerArrayresult[k].getId()==employeeArrayresult[y].getId()
								&&( (employeeArrayresult[y].getDepartment()).equals(departmentArrayresult[i]))) {
							output.println(managerArrayresult[k].toString());
					}
					}
					
				}
				//Print developers
				for(int d=0; d<developerArray.length;d++) {
					if((developerArray[d].getDepartment()).equals(departmentArrayresult[i]) ) {
						output.println("\r\n"+ ++a +".Developer");
						output.println(developerArray[d].toString());
						
					}
				}
				//Print sales employees
				for(int s=0 ;s<semployeeArray.length; s++) {
					if((semployeeArray[s].getDepartment()).equals(departmentArrayresult[i])) {
						output.println("\r\n"+ ++a +".SalesEmployee");
						output.println(semployeeArray[s].toString());
					
					}
				}
				//Print regular employees
				for(int r=0; r<remployeeArrayresult.length;r++) {
					for(int de=0; de<developerArray.length;de++) {
						for(int se=0; se<semployeeArray.length;se++) {
							if(remployeeArrayresult[r].getDepartment().equals(departmentArrayresult[i])
									&& remployeeArrayresult[r].getId()!=developerArray[de].getId()
									&&remployeeArrayresult[r].getId()!=semployeeArray[se].getId()
									&&developerArray[de].getDepartment().equals(departmentArrayresult[i])
									&&semployeeArray[se].getDepartment().equals(departmentArrayresult[i])) {
								output.println("\r\n"+ ++a  +".RegularEmployee");
								output.println(remployeeArrayresult[r].toString());
							}
						}
					}
				}
				

				}
				//Print customers
				output.println("\r\n*************************CUSTOMERS***************************************");
				for(int i=0; i<customerArray.length; i++) {
					output.println(customerArray[i].toString());
				}
				
				//Print people
				output.println("*************************PEOPLE******************************************");
				for(int i=0; i<personArrayresult.length; i++) {
					personIdArrayList.add(personArrayresult[i].getId());
				}
				for(int i=0; i<customerArray.length;i++) {
					personIdArrayList.remove(new Integer(customerArray[i].getId()));
				}
				for(int i=0; i<employeeArrayresult.length;i++) {
					personIdArrayList.remove(new Integer(employeeArrayresult[i].getId()));
				}
				Integer[] idArray=personIdArrayList.toArray(new Integer[personIdArrayList.size()]);
				for(int i=0; i<personArrayresult.length; i++) {
					for(int j=0; j<idArray.length ; j++) {
						if(personArrayresult[i].getId()==idArray[j]) {
							output.println(personArrayresult[i].toString());
						}
					}
				}
				
				//Close the output file because of saving informations.
					output.close();
			
			}
			
			}
			
			
		}
	
			

	

