package EmployeeDet;

public class Address  {
	int doorNo;
	String street;
	String city;
	int pincode;
	Address(int doorNo, String city,String street,int pincode){
		this.doorNo=doorNo;
		this.city=city;
		this.street=street;
		this.pincode=pincode;
	}
	public String toString() {
		return "Adress:\t"+doorNo+","+city+","+street+","+pincode;
	}
}
