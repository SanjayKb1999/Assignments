package MyOwnAutoShopProject;

public class Ford extends Car {
    int year;
    double manufacturerDiscount;

   Ford(int speed, double regularPrice, String color, int year, double manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }
}
