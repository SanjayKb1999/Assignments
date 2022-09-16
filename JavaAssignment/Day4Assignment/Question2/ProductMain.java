package Question2;

import java.util.LinkedList;
import java.util.List;

public class ProductMain {
	List<Product> prosrt(){
	List<Product> prom = new ProductInsert().insertPro();
	prom.sort((Product q1,Product q2)->q1.getProdPrice()-q2.getProdPrice());
	return prom;
	}
	public static void myException(Product q1)throws CustomExcep {
		
		if(q1.getProdPrice()<0)
			throw new CustomExcep("Price Entered is Negative Value");
		else
			System.out.println("The Price of product is: ");
		
	}
		public static void main(String args[])throws Exception {
			System.out.println(new ProductMain().prosrt());
			