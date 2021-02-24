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

	/*
	 * Comparing all the attributes
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lapid == null) ? 0 : lapid.hashCode());
		result = prime * result + ((lapname == null) ? 0 : lapname.hashCode());// Can be neglected when no need to
																				// consider name
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Laptop other = (Laptop) obj;
		if (lapid == null) {
			if (other.lapid != null)
				return false;
		} else if (!lapid.equals(other.lapid))
			return false;
		//// Can be neglected when no need to consider name
		if (lapname == null) {
			if (other.lapname != null)
				return false;
		} else if (!lapname.equals(other.lapname))
			return false;
		return true;
	}
}
