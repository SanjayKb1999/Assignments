package Day2Assignment;

public class Product {
	int proID;
	String proName;
	double proPrice;
	Product( int id , String name , double price ) {
		this.proID = id;
		this.proName = name;
		this.proPrice = price;
	}
	public double Gstadd (double s) {
		double TotalPrice = proPrice + (proPrice*0.18);
	    return TotalPrice;
	}
	public static void main(String[] args) {
		Product q1 = new Product( 202 , "Laptop" , 20000);
		System.out.println("Product ID: "+ q1.proID +"\nProduct Name: " +q1.proName + "\nPrice Before gst: " + q1.proPrice+ "\nTotal Price(After gst) = " + q1.Gstadd(q1.proPrice) );
	}
}
