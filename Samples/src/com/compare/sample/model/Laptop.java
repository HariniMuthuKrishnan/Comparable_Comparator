package com.compare.sample.model;

public class Laptop {
	private Integer lapid;
	private String lapname;
	private int price;

	public Laptop(Integer lapid, String lapname, int price) {
		super();
		this.lapid = lapid;
		this.lapname = lapname;
		this.price = price;
	}

	public Integer getLapid() {
		return lapid;
	}

	public void setLapid(Integer lapid) {
		this.lapid = lapid;
	}

	public String getLapname() {
		return lapname;
	}

	public void setLapname(String lapname) {
		this.lapname = lapname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [lapid=" + lapid + ", lapname=" + lapname + ", price=" + price + "]";
	}
}
