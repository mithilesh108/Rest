package com.cts.loan;

public class EmpDetails {

	private int id;
	private String name;
	private String add;
	
	/*
	public EmpDetails(String idName) {
		id = Integer.parseInt(idName.substring(0, 2));
		name = idName.substring(2, 6);
	    add = idName.substring(5,8);
		
	}*/
	
	public static EmpDetails valueOf(String idName) {
		EmpDetails e = new EmpDetails();
		e.setId(Integer.parseInt(idName.substring(0, 2)));
		e.setName(idName.substring(2, 6));
	    e.setAdd(idName.substring(5,8));
	    System.out.println(e);
	    return e;
		
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

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "EmpDetails [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	
}
