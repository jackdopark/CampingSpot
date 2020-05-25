package com.example.demo.vo;


public class CampingSpotVo {

	private int cs_no;
	private String cs_name;
	private String cs_tel;
	private String cs_addr_head;
	private String cs_addr_remain;
	private String cs_url;
	private String cs_account;
	private String cs_licence_fname;
	private String cs_camp_fname;
	private String cs_map_fname;
	private double cs_lati;
	private double cs_long;
	private int cs_glamping_cnt;
	private int cs_caravan_cnt;
	private int cs_autocamping_cnt;
	private String cs_theme;
	private String cs_fac;
	private String cs_detail;
	private String mb_id;
	public int getCs_no() {
		return cs_no;
	}
	public void setCs_no(int cs_no) {
		this.cs_no = cs_no;
	}
	public String getCs_name() {
		return cs_name;
	}
	public void setCs_name(String cs_name) {
		this.cs_name = cs_name;
	}
	public String getCs_tel() {
		return cs_tel;
	}
	public void setCs_tel(String cs_tel) {
		this.cs_tel = cs_tel;
	}
	public String getCs_addr_head() {
		return cs_addr_head;
	}
	public void setCs_addr_head(String cs_addr_head) {
		this.cs_addr_head = cs_addr_head;
	}
	public String getCs_addr_remain() {
		return cs_addr_remain;
	}
	public void setCs_addr_remain(String cs_addr_remain) {
		this.cs_addr_remain = cs_addr_remain;
	}
	public String getCs_url() {
		return cs_url;
	}
	public void setCs_url(String cs_url) {
		this.cs_url = cs_url;
	}
	public String getCs_account() {
		return cs_account;
	}
	public void setCs_account(String cs_account) {
		this.cs_account = cs_account;
	}
	public String getCs_licence_fname() {
		return cs_licence_fname;
	}
	public void setCs_licence_fname(String cs_licence_fname) {
		this.cs_licence_fname = cs_licence_fname;
	}
	public String getCs_camp_fname() {
		return cs_camp_fname;
	}
	public void setCs_camp_fname(String cs_camp_fname) {
		this.cs_camp_fname = cs_camp_fname;
	}
	public String getCs_map_fname() {
		return cs_map_fname;
	}
	public void setCs_map_fname(String cs_map_fname) {
		this.cs_map_fname = cs_map_fname;
	}
	public double getCs_lati() {
		return cs_lati;
	}
	public void setCs_lati(double cs_lati) {
		this.cs_lati = cs_lati;
	}
	public double getCs_long() {
		return cs_long;
	}
	public void setCs_long(double cs_long) {
		this.cs_long = cs_long;
	}
	public int getCs_glamping_cnt() {
		return cs_glamping_cnt;
	}
	public void setCs_glamping_cnt(int cs_glamping_cnt) {
		this.cs_glamping_cnt = cs_glamping_cnt;
	}
	public int getCs_caravan_cnt() {
		return cs_caravan_cnt;
	}
	public void setCs_caravan_cnt(int cs_caravan_cnt) {
		this.cs_caravan_cnt = cs_caravan_cnt;
	}
	public int getCs_autocamping_cnt() {
		return cs_autocamping_cnt;
	}
	public void setCs_autocamping_cnt(int cs_autocamping_cnt) {
		this.cs_autocamping_cnt = cs_autocamping_cnt;
	}
	public String getCs_theme() {
		return cs_theme;
	}
	public void setCs_theme(String cs_theme) {
		this.cs_theme = cs_theme;
	}
	public String getCs_fac() {
		return cs_fac;
	}
	public void setCs_fac(String cs_fac) {
		this.cs_fac = cs_fac;
	}
	public String getCs_detail() {
		return cs_detail;
	}
	public void setCs_detail(String cs_detail) {
		this.cs_detail = cs_detail;
	}
	public String getMb_id() {
		return mb_id;
	}
	public void setMb_id(String mb_id) {
		this.mb_id = mb_id;
	}
	public CampingSpotVo(int cs_no, String cs_name, String cs_tel, String cs_addr_head, String cs_addr_remain,
			String cs_url, String cs_account, String cs_licence_fname, String cs_camp_fname, String cs_map_fname,
			double cs_lati, double cs_long, int cs_glamping_cnt, int cs_caravan_cnt, int cs_autocamping_cnt,
			String cs_theme, String cs_fac, String cs_detail, String mb_id) {
		super();
		this.cs_no = cs_no;
		this.cs_name = cs_name;
		this.cs_tel = cs_tel;
		this.cs_addr_head = cs_addr_head;
		this.cs_addr_remain = cs_addr_remain;
		this.cs_url = cs_url;
		this.cs_account = cs_account;
		this.cs_licence_fname = cs_licence_fname;
		this.cs_camp_fname = cs_camp_fname;
		this.cs_map_fname = cs_map_fname;
		this.cs_lati = cs_lati;
		this.cs_long = cs_long;
		this.cs_glamping_cnt = cs_glamping_cnt;
		this.cs_caravan_cnt = cs_caravan_cnt;
		this.cs_autocamping_cnt = cs_autocamping_cnt;
		this.cs_theme = cs_theme;
		this.cs_fac = cs_fac;
		this.cs_detail = cs_detail;
		this.mb_id = mb_id;
	}
	public CampingSpotVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
