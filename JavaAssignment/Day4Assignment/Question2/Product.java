package Question2;

public class Product {
int prodID;
String prodName;
double prodPrice;
public Product(int prodID, String prodName, double prodPrice) {
	super();
	this.prodID = prodID;
	this.prodName = prodName;
	this.prodPrice = prodPrice;
}
public int getProdID() {
	return prodID;
}
public void setProdID(int prodID) {
	this.prodID = prodID;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public double getProdPrice() {
	return prodPrice;
}
public void setProdPrice(double prodPrice) {
	this.prodPrice = prodPrice;
}
}
