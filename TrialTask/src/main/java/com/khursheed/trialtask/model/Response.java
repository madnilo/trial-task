package com.khursheed.trialtask.model;

public class Response {
	
	private String iamUserId;
	private String email;
	private String tenantId;
	private String errorDescription;
	private String errorDetail;
	
	
	public String getIamUserId() {
		return iamUserId;
	}
	public void setIamUserId(String iamUserId) {
		this.iamUserId = iamUserId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public String getErrorDescription() {
		return errorDescription;
	}
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}
	public String getErrorDetail() {
		return errorDetail;
	}
	public void setErrorDetail(String errorDetail) {
		this.errorDetail = errorDetail;
	}

}
