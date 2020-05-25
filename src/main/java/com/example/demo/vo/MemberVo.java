package com.example.demo.vo;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;


public class MemberVo {

	private String mc_id;
	private String mc_pwd;
		private String salt;
	private String mc_email;
	private String mc_name;
	private String mc_nickname;
	private String mc_tel;
	private String mc_taste;
	private String mc_fname;
		private MultipartFile uploadFile;	
	private Date mc_regdate;
	private Date mc_recdate;
	private int mc_point;
	private int mc_auth;
	public String getMc_id() {
		return mc_id;
	}
	public void setMc_id(String mc_id) {
		this.mc_id = mc_id;
	}
	public String getMc_pwd() {
		return mc_pwd;
	}
	public void setMc_pwd(String mc_pwd) {
		this.mc_pwd = mc_pwd;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getMc_email() {
		return mc_email;
	}
	public void setMc_email(String mc_email) {
		this.mc_email = mc_email;
	}
	public String getMc_name() {
		return mc_name;
	}
	public void setMc_name(String mc_name) {
		this.mc_name = mc_name;
	}
	public String getMc_nickname() {
		return mc_nickname;
	}
	public void setMc_nickname(String mc_nickname) {
		this.mc_nickname = mc_nickname;
	}
	public String getMc_tel() {
		return mc_tel;
	}
	public void setMc_tel(String mc_tel) {
		this.mc_tel = mc_tel;
	}
	public String getMc_taste() {
		return mc_taste;
	}
	public void setMc_taste(String mc_taste) {
		this.mc_taste = mc_taste;
	}
	public String getMc_fname() {
		return mc_fname;
	}
	public void setMc_fname(String mc_fname) {
		this.mc_fname = mc_fname;
	}
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	public Date getMc_regdate() {
		return mc_regdate;
	}
	public void setMc_regdate(Date mc_regdate) {
		this.mc_regdate = mc_regdate;
	}
	public Date getMc_recdate() {
		return mc_recdate;
	}
	public void setMc_recdate(Date mc_recdate) {
		this.mc_recdate = mc_recdate;
	}
	public int getMc_point() {
		return mc_point;
	}
	public void setMc_point(int mc_point) {
		this.mc_point = mc_point;
	}
	public int getMc_auth() {
		return mc_auth;
	}
	public void setMc_auth(int mc_auth) {
		this.mc_auth = mc_auth;
	}
	public MemberVo(String mc_id, String mc_pwd, String salt, String mc_email, String mc_name, String mc_nickname,
			String mc_tel, String mc_taste, String mc_fname, MultipartFile uploadFile, Date mc_regdate, Date mc_recdate,
			int mc_point, int mc_auth) {
		super();
		this.mc_id = mc_id;
		this.mc_pwd = mc_pwd;
		this.salt = salt;
		this.mc_email = mc_email;
		this.mc_name = mc_name;
		this.mc_nickname = mc_nickname;
		this.mc_tel = mc_tel;
		this.mc_taste = mc_taste;
		this.mc_fname = mc_fname;
		this.uploadFile = uploadFile;
		this.mc_regdate = mc_regdate;
		this.mc_recdate = mc_recdate;
		this.mc_point = mc_point;
		this.mc_auth = mc_auth;
	}
	public MemberVo() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	/*

	아이디
	패스워드
	솔트
	이메일
	이름
	별명
	전화번호
	취향
	프로필
	가입일
	최근접속일
	포인트
	권한

	 */
	
}