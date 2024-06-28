package com.demo.beans;

public class Customer {
	
	private int cid;
	private String cname;
	private String mob;
	
	public Customer() {
		super();
	}

	public Customer(int cid, String cname, String mob) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mob = mob;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", mob=" + mob + "]";
	}
	
	

}
