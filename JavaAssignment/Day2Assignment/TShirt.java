package Day2Assignment;

public class TShirt {

	String color;
	String material;
	String design;
	
	TShirt ( String color , String material , String design ) {
	this.color = color;
	this.material = material;
   this.design = design;
	}
	public static void main(String[] args) {	
		TShirt[] Small = new TShirt[3];
		Small[0] = new TShirt( "Yellow" , "Polyester" , "Collar" );
		Small[1] = new TShirt( "Black" , "Cotton" , "Collar Less" );
		Small[2] = new TShirt( "White" , "Rayon" , "Collar" );
		
		TShirt[] Large = new TShirt[3];
		Large[0] = new TShirt( "Yellow" , "Polyester" , "Collar" );
		Large[1] = new TShirt( "White" , "Rayon" , "Collar" );
		Large[2] = new TShirt( "Black" , "Cotton" , "Collar Less" );		
		
		TShirt[] XLarge = new TShirt[3];
		XLarge[0] = new TShirt( "Black" , "Cotton" , "Star Wars: Dark Side" );
		XLarge[1] = new TShirt( "White" , "Polyester" , "Iron Man: Tony's Choice" );
		XLarge[2] = new TShirt( "Green" , "Linen" , "Solids Oversized: Sage Green" );		
		
		
		System.out.println("\tSize------------Small\n");
		for( int i = 0 ; i < Small.length ; i++ ) {
			System.out.println( "T-Shirt Color: " + Small[i].color + "\tT-Shirt Material: " + Small[i].material + "\tT-Shirt Design: " + Small[i].design  );
		}		
		
		
	
		System.out.println("\tSize---------------Large\n");
		for( int i = 0 ; i < Large.length ; i++ ) {
			System.out.println( "T-Shirt Color: " + Large[i].color + "\tT-Shirt Material: " + Large[i].material + "\tT-Shirt Design: " + Large[i].design  );
		}
		
		
		System.out.println("\tSize-------------------X-Large\n");
		for( int i = 0 ; i <XLarge.length ; i++ ) {
			System.out.println( "T-Shirt Color: " + XLarge[i].color + "\tT-Shirt Material: " + XLarge[i].material + "\tT-Shirt Design : " + XLarge[i].design);
		}	
	}
}
