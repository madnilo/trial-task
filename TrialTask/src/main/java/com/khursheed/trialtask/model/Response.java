package com.khursheed.trialtask.model;

public class Response {
	
	private long iamUserId;
	private String email;
	private String tenantId;
	private String errorDescription;
	private String errorDetail;
	
	
	public long getIamUserId() {
		return iamUserId;
	}
	public void setIamUserId(long l) {
		this.iamUserId = l;
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
