package com.cts.bean;

public class EmpDetails {

	private int id;
	private String name;
	private String add;

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
