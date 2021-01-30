
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Product {
	private String productName;
	private java.util.Calendar saleDate;
	private double price;
	
	//Define constructors
	public Product(String sName,java.util.Calendar sDate,double price) {
		productName=sName;
		saleDate=sDate;
		this.price=price;
	}

	//getter setter methods
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public java.util.Calendar getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(java.util.Calendar saleDate) {
		this.saleDate = saleDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	//toString methods
	public String toString() {
		
		DateFormat datef= new SimpleDateFormat("dd/MM/yyyy");
		String trsDay=datef.format(saleDate.getTime());
		
		
		return String.format("%s%s,  %s %s %s%.2f]", "products =[productName=",
				getProductName(),"transactionDate=",trsDay,",  price=",getPrice());
	}
}
