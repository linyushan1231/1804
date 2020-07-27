package com.bw.bean;

public class Meeting {

	private Integer mid;
	private Integer code;
	private String name;
	private String start_time;
	private String end_time;
	private String creat_time;
	private Integer tid;
	private String tname;
	
	
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getCreat_time() {
		return creat_time;
	}
	public void setCreat_time(String creat_time) {
		this.creat_time = creat_time;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Meeting() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Meeting [mid=" + mid + ", code=" + code + ", name=" + name + ", start_time=" + start_time
				+ ", end_time=" + end_time + ", creat_time=" + creat_time + ", tid=" + tid + "]";
	}
	
	
}
