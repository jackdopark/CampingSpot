package com.example.demo.vo;

public class FestivalListVo {

	private String title;
	private String period;
	private String addr;
	private String detailHead;
	private String detailAll;
	private String ingStatus;
	private String url;
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getDetailHead() {
		return detailHead;
	}
	public void setDetailHead(String detailHead) {
		this.detailHead = detailHead;
	}
	public String getDetailAll() {
		return detailAll;
	}
	public void setDetailAll(String detailAll) {
		this.detailAll = detailAll;
	}
	public String getIngStatus() {
		return ingStatus;
	}
	public void setIngStatus(String ingStatus) {
		this.ingStatus = ingStatus;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public FestivalListVo(String title, String period, String addr, String detailHead, String detailAll,
			String ingStatus, String url, String fname) {
		super();
		this.title = title;
		this.period = period;
		this.addr = addr;
		this.detailHead = detailHead;
		this.detailAll = detailAll;
		this.ingStatus = ingStatus;
		this.url = url;
		this.fname = fname;
	}
	public FestivalListVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
