package com.ramnar.collection;

import java.util.HashSet;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for business objects both equals and hashcode methods need to be overridden
		//hashset, hashtable and hashmap compare based on hashcode and hence these 
		//implementations will fail 
		HashSet<Employee> set = new HashSet<Employee>();
		set.add(new Employee(1, "ram"));
		
		System.out.println(set.contains(new Employee(1, "ram")));

	}

}

class Employee{
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object object) {
		if (object == null || !(object instanceof Employee))
				return false;
		if(object == this) return true;
		
		if (((Employee)object).id == id) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	public int hashCode() {
		return id;
	}
	
	
}
