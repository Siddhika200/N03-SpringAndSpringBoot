package org.tnsif.literals;

public class XUVEngine implements IEngine {
	
	private String company;
	private double cost;
	

	public double cost() {
		return cost;
	}
	public String display() {
		return "India";
	}
    //setter method :DI types using  setter
	
	public void setCompany(String company) {
		this.company = company;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Origin of company :"+company+" "+ fuel;
	}
	//Default constructor :DI using constructor
	public XUVEngine(String company, double cost) {
		super();
		this.company = company;
		this.cost = cost;
	}
	
	
}
