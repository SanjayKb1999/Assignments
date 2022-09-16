package Shapes;

public class Rectangle extends Shape {
	Rectangle() {}
	Rectangle(float l, float w) {
		super.length = l;
		super.width = w;
	}
	
	@Override
	public void DrawDia() {
		System.out.println("Drawing a Rectangle-\n Length of the rectangle:  " + length + "cm and Width is - " + width + "cm");
		
	}
	@Override
	public float CalcArea() {
		return length * width;
	}
	public String toString() {
		DrawDia();
		return "Area of Rectangle is: " +  CalcArea() + "cm\n";
	
	}

}
