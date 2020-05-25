package com.example.demo.vo;


public class CampingSearchResultVo {

	private String name;
	private int no;
	private int price;
	private double rate;
	private String addr_head;
	private String addr_remain;
	private String detail;
	private String tel;
	private String theme;
	private String fac;
	private String camp_fname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getAddr_head() {
		return addr_head;
	}
	public void setAddr_head(String addr_head) {
		this.addr_head = addr_head;
	}
	public String getAddr_remain() {
		return addr_remain;
	}
	public void setAddr_remain(String addr_remain) {
		this.addr_remain = addr_remain;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getFac() {
		return fac;
	}
	public void setFac(String fac) {
		this.fac = fac;
	}
	public String getCamp_fname() {
		return camp_fname;
	}
	public void setCamp_fname(String camp_fname) {
		this.camp_fname = camp_fname;
	}
	public CampingSearchResultVo(String name, int no, int price, double rate, String addr_head, String addr_remain,
			String detail, String tel, String theme, String fac, String camp_fname) {
		super();
		this.name = name;
		this.no = no;
		this.price = price;
		this.rate = rate;
		this.addr_head = addr_head;
		this.addr_remain = addr_remain;
		this.detail = detail;
		this.tel = tel;
		this.theme = theme;
		this.fac = fac;
		this.camp_fname = camp_fname;
	}
	public CampingSearchResultVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
