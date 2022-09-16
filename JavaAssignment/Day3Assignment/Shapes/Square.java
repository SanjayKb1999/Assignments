package Shapes;

public class Square extends Shape {
	Square() {}
	Square(float s) {
		super.side = s;
	}
	@Override
	public void DrawDia() {
		System.out.println("Drawing a Square-\n Side of square is: " + side + "cm");
		
	}
	@Override
	public float CalcArea() {
		return side * side;
	}
	public String toString() {
		DrawDia();
		return "Area of Square is: " + CalcArea() + "cm\n";
	}
}
