package com.mvc.upgrade.model.dto;

public class MemberDto {
	private int memberno;
	private String memberid;
	private String memberpw;
	private String meembername;
	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberDto(int memberno, String memberid, String memberpw, String meembername) {
		super();
		this.memberno = memberno;
		this.memberid = memberid;
		this.memberpw = memberpw;
		this.meembername = meembername;
	}
	public int getMemberno() {
		return memberno;
	}
	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public String getMemberpw() {
		return memberpw;
	}
	public void setMemberpw(String memberpw) {
		this.memberpw = memberpw;
	}
	public String getMeembername() {
		return meembername;
	}
	public void setMeembername(String meembername) {
		this.meembername = meembername;
	}
	
	
}
