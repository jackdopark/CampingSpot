package com.example.demo.vo;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;


public class BusinessVo {
	
		private String mb_id;
		private String mb_pwd;
			private String salt;
		private String mb_email;
		private String mb_name;
		private String mb_nickname;
		private String mb_tel;
		private String mb_licence;
		private String mb_fname;
			private MultipartFile uploadFile;	
		private Date mb_regdate;
		private Date mb_recdate;
		private int mb_auth;
		public String getMb_id() {
			return mb_id;
		}
		public void setMb_id(String mb_id) {
			this.mb_id = mb_id;
		}
		public String getMb_pwd() {
			return mb_pwd;
		}
		public void setMb_pwd(String mb_pwd) {
			this.mb_pwd = mb_pwd;
		}
		public String getSalt() {
			return salt;
		}
		public void setSalt(String salt) {
			this.salt = salt;
		}
		public String getMb_email() {
			return mb_email;
		}
		public void setMb_email(String mb_email) {
			this.mb_email = mb_email;
		}
		public String getMb_name() {
			return mb_name;
		}
		public void setMb_name(String mb_name) {
			this.mb_name = mb_name;
		}
		public String getMb_nickname() {
			return mb_nickname;
		}
		public void setMb_nickname(String mb_nickname) {
			this.mb_nickname = mb_nickname;
		}
		public String getMb_tel() {
			return mb_tel;
		}
		public void setMb_tel(String mb_tel) {
			this.mb_tel = mb_tel;
		}
		public String getMb_licence() {
			return mb_licence;
		}
		public void setMb_licence(String mb_licence) {
			this.mb_licence = mb_licence;
		}
		public String getMb_fname() {
			return mb_fname;
		}
		public void setMb_fname(String mb_fname) {
			this.mb_fname = mb_fname;
		}
		public MultipartFile getUploadFile() {
			return uploadFile;
		}
		public void setUploadFile(MultipartFile uploadFile) {
			this.uploadFile = uploadFile;
		}
		public Date getMb_regdate() {
			return mb_regdate;
		}
		public void setMb_regdate(Date mb_regdate) {
			this.mb_regdate = mb_regdate;
		}
		public Date getMb_recdate() {
			return mb_recdate;
		}
		public void setMb_recdate(Date mb_recdate) {
			this.mb_recdate = mb_recdate;
		}
		public int getMb_auth() {
			return mb_auth;
		}
		public void setMb_auth(int mb_auth) {
			this.mb_auth = mb_auth;
		}
		public BusinessVo(String mb_id, String mb_pwd, String salt, String mb_email, String mb_name, String mb_nickname,
				String mb_tel, String mb_licence, String mb_fname, MultipartFile uploadFile, Date mb_regdate,
				Date mb_recdate, int mb_auth) {
			super();
			this.mb_id = mb_id;
			this.mb_pwd = mb_pwd;
			this.salt = salt;
			this.mb_email = mb_email;
			this.mb_name = mb_name;
			this.mb_nickname = mb_nickname;
			this.mb_tel = mb_tel;
			this.mb_licence = mb_licence;
			this.mb_fname = mb_fname;
			this.uploadFile = uploadFile;
			this.mb_regdate = mb_regdate;
			this.mb_recdate = mb_recdate;
			this.mb_auth = mb_auth;
		}
		public BusinessVo() {
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
		사업자등록번호
		프로필
		가입일
		최근접속일
		권한

		 */
		
		
		
}