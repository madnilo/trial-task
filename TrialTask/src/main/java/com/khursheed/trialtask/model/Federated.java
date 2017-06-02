package com.khursheed.trialtask.model;

import java.util.List;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@JsonInclude(Include.NON_NULL)
public class Federated {

	private String email;
	private String federatedUserId;
	private String tenantId;
	private String status;
	private String role;
	private List<String> banlist;
	private List<Features> features;
	private List<String> businessSOC;
	private List<String> DIDline;
	private List<String> extensions;
	private List<String> desklines;
	private LogoImage logoImage;
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFederatedUserId() {
		return federatedUserId;
	}
	public void setFederatedUserId(String federatedUserId) {
		this.federatedUserId = federatedUserId;
	}
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<String> getBanlist() {
		return banlist;
	}
	public void setBanlist(List<String> banlist) {
		this.banlist = banlist;
	}
	public List<Features> getFeatures() {
		return features;
	}
	public void setFeatures(List<Features> features) {
		this.features = features;
	}
	public List<String> getBusinessSOC() {
		return businessSOC;
	}
	public void setBusinessSOC(List<String> businessSOC) {
		this.businessSOC = businessSOC;
	}
	public List<String> getDIDline() {
		return DIDline;
	}
	public void setDIDline(List<String> dIDline) {
		DIDline = dIDline;
	}
	public List<String> getExtensions() {
		return extensions;
	}
	public void setExtensions(List<String> extensions) {
		this.extensions = extensions;
	}
	public List<String> getDesklines() {
		return desklines;
	}
	public void setDesklines(List<String> desklines) {
		this.desklines = desklines;
	}
	public LogoImage getLogoImage() {
		return logoImage;
	}
	public void setLogoImage(LogoImage logoImage) {
		this.logoImage = logoImage;
	}
	
	
}
