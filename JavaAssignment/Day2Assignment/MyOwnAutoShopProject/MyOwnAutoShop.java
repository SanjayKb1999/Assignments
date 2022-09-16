package MyOwnAutoShopProject;

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan s = new Sedan(150, 30000, "black", 19);
        Ford Figo = new Ford(110, 20000, "white", 2020, 55);
        Ford Eco = new Ford(250, 65000, "Grey", 2022, 66);
        Car c = new Car(100, 90000, "Green");
       
        System.out.println("Sedan:\t"+s.getSalePrice());
        System.out.println("Figo:\t"+Figo.getSalePrice());
        System.out.println("Eco:\t"+Eco.getSalePrice());
        System.out.println("Car:\t"+c.getSalePrice());
    }
}