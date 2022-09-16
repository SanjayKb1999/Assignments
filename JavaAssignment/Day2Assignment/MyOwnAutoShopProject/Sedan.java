package MyOwnAutoShopProject;

public class Sedan extends Car {
   int length;
    Sedan(int speed, double regularPrice, String color, int length) {
       super(speed, regularPrice, color);
        this.length = length;
    }
    
    public double getSalePrice(int length ) {
		if(length > 20) {
			return super.getSalePrice()-5/100;
		}
		else {
			return super.getSalePrice()-10/100;
		}
		}
		
}