package com.example.demo.vo;

public class CampingWishVo {
   
   private int cw_no;
   private String mc_id;
   private int cs_no;
public int getCw_no() {
	return cw_no;
}
public void setCw_no(int cw_no) {
	this.cw_no = cw_no;
}
public String getMc_id() {
	return mc_id;
}
public void setMc_id(String mc_id) {
	this.mc_id = mc_id;
}
public int getCs_no() {
	return cs_no;
}
public void setCs_no(int cs_no) {
	this.cs_no = cs_no;
}
public CampingWishVo(int cw_no, String mc_id, int cs_no) {
	super();
	this.cw_no = cw_no;
	this.mc_id = mc_id;
	this.cs_no = cs_no;
}
public CampingWishVo() {
	super();
	// TODO Auto-generated constructor stub
}
 
   
}
