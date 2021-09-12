package com.example.lab2;

public class Fruit {
	int no;
	String name;
	int price;
	
	public Fruit(int i, String string, int j) {
		no = i;
		name = string;
		price = j;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + price + "]";
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setAge(int price) {
		this.price = price;
	}
}
