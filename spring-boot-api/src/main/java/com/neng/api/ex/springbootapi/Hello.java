package com.neng.api.ex.springbootapi;

public class Hello {

	long id;
	String hi;
	public long getId() {
		return id;
	}
	
	public Hello(long id, String hi) {
		this.id = id;
		this.hi = hi;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getHi() {
		return hi;
	}
	public void setHi(String hi) {
		this.hi = hi;
	}
	
	
	
}
