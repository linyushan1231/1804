package com.bw.bean;

public class Mtype {

	private Integer tid;
	private String tname;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Mtype() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Mtype [tid=" + tid + ", tname=" + tname + "]";
	}
	
	
}
