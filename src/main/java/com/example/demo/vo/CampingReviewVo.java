package com.example.demo.vo;

import java.util.Date;


public class CampingReviewVo {

   private int cre_no;
   private String cre_content;
   private int cre_rate;
   private Date cre_date;
   private String mc_id;
   private String mb_id;
   private int cs_no;
   private String cre_re_contents;
public int getCre_no() {
	return cre_no;
}
public void setCre_no(int cre_no) {
	this.cre_no = cre_no;
}
public String getCre_content() {
	return cre_content;
}
public void setCre_content(String cre_content) {
	this.cre_content = cre_content;
}
public int getCre_rate() {
	return cre_rate;
}
public void setCre_rate(int cre_rate) {
	this.cre_rate = cre_rate;
}
public Date getCre_date() {
	return cre_date;
}
public void setCre_date(Date cre_date) {
	this.cre_date = cre_date;
}
public String getMc_id() {
	return mc_id;
}
public void setMc_id(String mc_id) {
	this.mc_id = mc_id;
}
public String getMb_id() {
	return mb_id;
}
public void setMb_id(String mb_id) {
	this.mb_id = mb_id;
}
public int getCs_no() {
	return cs_no;
}
public void setCs_no(int cs_no) {
	this.cs_no = cs_no;
}
public String getCre_re_contents() {
	return cre_re_contents;
}
public void setCre_re_contents(String cre_re_contents) {
	this.cre_re_contents = cre_re_contents;
}
public CampingReviewVo(int cre_no, String cre_content, int cre_rate, Date cre_date, String mc_id, String mb_id,
		int cs_no, String cre_re_contents) {
	super();
	this.cre_no = cre_no;
	this.cre_content = cre_content;
	this.cre_rate = cre_rate;
	this.cre_date = cre_date;
	this.mc_id = mc_id;
	this.mb_id = mb_id;
	this.cs_no = cs_no;
	this.cre_re_contents = cre_re_contents;
}
public CampingReviewVo() {
	super();
	// TODO Auto-generated constructor stub
}
   
   
   
}
