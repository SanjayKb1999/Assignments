package Question2;

import java.util.LinkedList;
import java.util.List;

public class ProductInsert {
	List<Product> insertPro(){
		List<Product> pro = new LinkedList<>();
		pro.add(new Product(211,"Mobile",10000));
		pro.add(new Product(291,"Tshirt",900));
		pro.add(new Product(311,"Laptop",15000));
		pro.add(new Product(481,"Watch",1500));
		pro.add(new Product(500,"TV",35000));
		pro.forEach((Product s1)->{
			if (s1.getProdPrice() < 0) 
				throw new RuntimeException("Price Entered is a negative value");
		});
			
		return pro;
		
	}

}
