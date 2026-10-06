package com.java.standard.edition.serializationdeserialization;

import java.io.Serializable;
//New line added by SDE-3
//New line added by manager
public class Employee implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int eid;
	private String name;
	private float salary;
	private transient String dept;
	//EmployeeConstructor
	public Employee(int eid,String name,float salary,String dept)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getEid() {
		return eid;
	}

	public String getName() {
		return name;
	}

	public float getSalary() {
		return salary;
	}

	public String getDept() {
		return dept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	//new line at line no 51
	//master c1
	//master c2
	//master c3
//new feature added by hemanthdev branch
//new feature by sde-3
}
