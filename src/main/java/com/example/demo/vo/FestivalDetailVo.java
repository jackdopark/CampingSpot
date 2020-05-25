package com.example.demo.vo;

 
public class FestivalDetailVo {

	private String title;
	private String period;
	private String location;
	private String tel;
	private String host;
	private String addr;
	private String detail;
	private String fname;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public FestivalDetailVo(String title, String period, String location, String tel, String host, String addr,
			String detail, String fname) {
		super();
		this.title = title;
		this.period = period;
		this.location = location;
		this.tel = tel;
		this.host = host;
		this.addr = addr;
		this.detail = detail;
		this.fname = fname;
	}
	public FestivalDetailVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
