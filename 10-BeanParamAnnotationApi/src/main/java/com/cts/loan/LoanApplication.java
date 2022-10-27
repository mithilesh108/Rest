package com.cts.loan;

import jakarta.ws.rs.CookieParam;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;

public class LoanApplication {

	@PathParam("loanType")
	private String loanType;
	@QueryParam("address")
	@DefaultValue("bhagalpur")
	private String address;

	@FormParam("applicantName")
	private String applicantName;
	@FormParam("mobile")
	private Long mobile;
	@FormParam("tenaure")
	private Integer tenaure;
	@FormParam("principleAmount")
	private Double principleAmount;
	@FormParam("pan")
	@DefaultValue("abcd")
	private String pan;

	@HeaderParam("appCode")
	private String appCode;
	@CookieParam("sessionId")
	private String sessionId;

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public Integer getTenaure() {
		return tenaure;
	}

	public void setTenaure(Integer tenaure) {
		this.tenaure = tenaure;
	}

	public Double getPrincipleAmount() {
		return principleAmount;
	}

	public void setPrincipleAmount(Double principleAmount) {
		this.principleAmount = principleAmount;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getAppCode() {
		return appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@Override
	public String toString() {
		return "LoanApplication [loanType=" + loanType + ", address=" + address + ", applicantName=" + applicantName
				+ ", mobile=" + mobile + ", tenaure=" + tenaure + ", principleAmount=" + principleAmount + ", pan="
				+ pan + ", appCode=" + appCode + ", sessionId=" + sessionId + "]";
	}

}
