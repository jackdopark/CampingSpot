package com.example.demo.vo;


public class ReserveSearchVo {

	private int rs_no;
	private int r_no;
	private String rs_date;
	private int cr_no;
	private int  cs_no;
	private String cr_type;
	public int getRs_no() {
		return rs_no;
	}
	public void setRs_no(int rs_no) {
		this.rs_no = rs_no;
	}
	public int getR_no() {
		return r_no;
	}
	public void setR_no(int r_no) {
		this.r_no = r_no;
	}
	public String getRs_date() {
		return rs_date;
	}
	public void setRs_date(String rs_date) {
		this.rs_date = rs_date;
	}
	public int getCr_no() {
		return cr_no;
	}
	public void setCr_no(int cr_no) {
		this.cr_no = cr_no;
	}
	public int getCs_no() {
		return cs_no;
	}
	public void setCs_no(int cs_no) {
		this.cs_no = cs_no;
	}
	public String getCr_type() {
		return cr_type;
	}
	public void setCr_type(String cr_type) {
		this.cr_type = cr_type;
	}
	public ReserveSearchVo(int rs_no, int r_no, String rs_date, int cr_no, int cs_no, String cr_type) {
		super();
		this.rs_no = rs_no;
		this.r_no = r_no;
		this.rs_date = rs_date;
		this.cr_no = cr_no;
		this.cs_no = cs_no;
		this.cr_type = cr_type;
	}
	public ReserveSearchVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
