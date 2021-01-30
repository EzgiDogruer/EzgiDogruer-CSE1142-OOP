
import java.util.*;


	public class Customer extends Person {
		private ArrayList<Product> products;



		//Define constructor
		public Customer(int id, String firstName, String lastName, String gender, 
		Calendar birthDate, String maritalStatus,String hasDriverLicence,ArrayList<Product> products) {
		
			
			super(id, firstName, lastName, gender,birthDate,  maritalStatus, hasDriverLicence);
			
			setProducts(products);
			
		}

		public Customer(Person person,ArrayList<Product> products) {
			super(person.getId(), person.getFirstName(),person.getLastName(),person.getGender()
			,person.getBirthDate(),person.getMaritalStatus(), person.getHasDriverLicence());
			
			setProducts(products);
		}

		//Getter setter methods.
		public ArrayList<Product> getProducts() {
			return products;
		}

		public void setProducts(ArrayList<Product> products) {
			this.products=products;
		}
		
		//toString method
		public String toString() {
			return String.format("%s %d %s]", "Customer  [id:",super.getId(),getProducts());
		}
		








}
