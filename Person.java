
import java.util.*;
import java.text.*;
import java.util.Calendar;


//Define data fields.
		public class Person {
	private int id;
	private String firstName;
	private String lastName;
	private byte gender;
	private Calendar birthDate;
	private byte maritalStatus;
	private boolean hasDriverLicence;
	
	
	
		
		
		public Person(int id,String firstName,String lastName,String gender,Calendar birthDate,String maritalStatus,String hasDriverLicence) {
			
			this.id=id;
			this.firstName=firstName;
			this.lastName=lastName;
			this.birthDate=birthDate;
			
			//Gender
			if(gender.equals("Man")){
				this.gender=Byte.valueOf("1");
			}
			if(gender.equals("Woman")){
			this.gender=Byte.valueOf("2");
			}
			//MaritalStatus
			if(maritalStatus.equals("Single")){
				this.maritalStatus=Byte.valueOf("1");
			}
			if(maritalStatus.equals("Married")){
			this.maritalStatus=Byte.valueOf("2");
			}
			//hasDriverLicence
			if(hasDriverLicence.equals("Yes")){
				this.hasDriverLicence=Boolean.valueOf(true);
			}
			if(hasDriverLicence.equals("No")){
				this.hasDriverLicence=Boolean.valueOf(false);
			}
			
		}

		//getter and setters
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getGender() {
			if(this.gender==1){
				return "Man";
			}
			if(this.gender==2){
				return "Woman";
		}
			return "Unknown";
		}
		//Set gender if String gender equals to Man or Woman.
		public void setGender(String gender) throws Exception {
			//Program converts Man to 1,
			//Program converts Woman to 2
			if(gender.equals("Man")){
				this.gender=Byte.valueOf("1");
			}
			else if(gender.equals("Woman")){
			this.gender=Byte.valueOf("2");
			}
			else 
				throw new Exception("Invalid input");
		}

		public Calendar getBirthDate() {
			return birthDate;
		}

		public void setBirthDate(Calendar birthDate) {
			this.birthDate = birthDate;
		}

		public String getMaritalStatus() {
			if(this.maritalStatus==1){
				return "Single";
			}
			if(this.maritalStatus==2){
				return "Married";
		}
			return "Unknown";
		}

		public void setMaritalStatus(String maritalStatus) throws Exception {
			//Program converts "Single" to 1,
			//Program converts "Married" to 2
			if(maritalStatus.equals("Single")){
				this.maritalStatus=Byte.valueOf("1");
			}
			else if(maritalStatus.equals("Married")){
				this.maritalStatus=Byte.valueOf("2");
			}
			else
				throw new Exception("Invalid input");
		}

		public String getHasDriverLicence() {
			if(this.hasDriverLicence==true) {
				return "Yes";
			}
			if(this.hasDriverLicence==false) {
				return "No";
			}
			return "Unknown";
		}

		public void setHasDriverLicence(String hasDriverLicence) throws Exception {
			//Program converts "Yes" to true,
			//Program converts "No" to false
			if(hasDriverLicence.equals("Yes")){
				this.hasDriverLicence=Boolean.valueOf(true);
			}
			else if(hasDriverLicence.equals("No")){
				this.hasDriverLicence=Boolean.valueOf(false);
			}
			else
				throw new Exception("Invalid input");
		}
		//toString method of Person Class
		@Override
	    public String toString() {
			
			//convert date to string
			DateFormat datef= new SimpleDateFormat("dd/MM/yyyy");
			String bDay=datef.format(birthDate.getTime());
			
			 
	        return "\nPerson Info [id=" + getId() + ",  firstName=" +getFirstName() +
	        	",  lastName="+getLastName()+", birthDate="+bDay+", gender="+getGender()+
	        	",  MaritalStatus="+getMaritalStatus()+",  DriverLicence="+getHasDriverLicence()+"]";
	    
		}

		
		
		

	}
		
			