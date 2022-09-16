package Shapes;

public class Triangle extends Shape {
	Triangle() {}
	Triangle(float h, float b) {
		super.height = h;
		super.base = b;
	}

	@Override
	public void DrawDia() {
		System.out.println("Drawing a Triangle\n Height of triangle is:  " + height + "cm and Base is: " + base + "cm");
		
	}
	@Override
	public float CalcArea() {
		return (height * base)/2;
	}

	public String toString() {
		DrawDia();
		return "Area of Triangle is: " + CalcArea() + "cm\n";
	}
}
