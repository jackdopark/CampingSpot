package com.example.demo.vo;


public class DetailCampingSearchResultVo {

	private int cs_no;
	private String cs_name;
	private String cs_tel;
	private String cs_addr_head;
	private String cs_addr_remain;
	private String cs_url;
	private String cs_account;
	private String cs_camp_fname;
	private String cs_map_fname;
	private int cs_glamping_cnt;
	private int cs_caravan_cnt;
	private int cs_autocamping_cnt;
	private String cs_theme;
	private String cs_fac;
	private String cs_detail;
	private String mb_id;
	private String campingType;
	private String checkin;
	private String checkout;
	private int price;
	private double rate;
	private String weather;
	private double max_temp;
	private double min_temp;
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
	public String getCampingType() {
		return campingType;
	}
	public void setCampingType(String campingType) {
		this.campingType = campingType;
	}
	public String getCheckin() {
		return checkin;
	}
	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}
	public String getCheckout() {
		return checkout;
	}
	public void setCheckout(String checkout) {
		this.checkout = checkout;
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
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public double getMax_temp() {
		return max_temp;
	}
	public void setMax_temp(double max_temp) {
		this.max_temp = max_temp;
	}
	public double getMin_temp() {
		return min_temp;
	}
	public void setMin_temp(double min_temp) {
		this.min_temp = min_temp;
	}
	public DetailCampingSearchResultVo(int cs_no, String cs_name, String cs_tel, String cs_addr_head,
			String cs_addr_remain, String cs_url, String cs_account, String cs_camp_fname, String cs_map_fname,
			int cs_glamping_cnt, int cs_caravan_cnt, int cs_autocamping_cnt, String cs_theme, String cs_fac,
			String cs_detail, String mb_id, String campingType, String checkin, String checkout, int price, double rate,
			String weather, double max_temp, double min_temp) {
		super();
		this.cs_no = cs_no;
		this.cs_name = cs_name;
		this.cs_tel = cs_tel;
		this.cs_addr_head = cs_addr_head;
		this.cs_addr_remain = cs_addr_remain;
		this.cs_url = cs_url;
		this.cs_account = cs_account;
		this.cs_camp_fname = cs_camp_fname;
		this.cs_map_fname = cs_map_fname;
		this.cs_glamping_cnt = cs_glamping_cnt;
		this.cs_caravan_cnt = cs_caravan_cnt;
		this.cs_autocamping_cnt = cs_autocamping_cnt;
		this.cs_theme = cs_theme;
		this.cs_fac = cs_fac;
		this.cs_detail = cs_detail;
		this.mb_id = mb_id;
		this.campingType = campingType;
		this.checkin = checkin;
		this.checkout = checkout;
		this.price = price;
		this.rate = rate;
		this.weather = weather;
		this.max_temp = max_temp;
		this.min_temp = min_temp;
	}
	public DetailCampingSearchResultVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
