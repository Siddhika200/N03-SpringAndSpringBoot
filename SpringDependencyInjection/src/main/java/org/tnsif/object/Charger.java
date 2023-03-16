package org.tnsif.object;

public class Charger {

	private String brand;
	private int volt;
	private String type;
	//using setter 
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setVolt(int volt) {
		this.volt = volt;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Charger [brand=" + brand + ", volt=" + volt + ", type=" + type + "]";
	}
	public void power()
	{
		System.out.println("Brand:"+brand+" "+"voltage"+volt+" Type"+type);
	}
	
	

}
