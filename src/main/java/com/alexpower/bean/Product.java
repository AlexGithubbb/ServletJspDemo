package com.alexpower.bean;

public class Product {

	public int id;
	public String name;
	public String field;
	
	public Product() {
		super();
	}

	public Product(int id, String name, String field) {
		super();
		this.id = id;
		this.name = name;
		this.field = field;
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
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", field=" + field + "]";
	}
	
	
}
