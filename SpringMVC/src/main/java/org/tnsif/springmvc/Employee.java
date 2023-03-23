package org.tnsif.springmvc;

import org.springframework.stereotype.Component;

@Component

public class Employee {
    private Integer empid;
    private String empname;
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
    public void print(){
    	System.out.println("Employees are belongs to IT");
    	System.out.println("Emp ID: "+empid+" "+"Employee Name :"+empname);
    }
}
