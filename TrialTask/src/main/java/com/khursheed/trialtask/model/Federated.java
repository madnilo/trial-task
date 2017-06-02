package com.khursheed.trialtask.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@JsonInclude(Include.NON_NULL)
public class Federated {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String email;
	private String federatedUserId;
	private String tenantId;
	private String status;
	private String role;
	
	private String[] banlist;
	
	@OneToMany
	private List<Features> features;
	
	private String[] businessSOC;
	private String[] didLine;
	private String[] extensions;
	private String[] desklines;
	
	@OneToOne
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
	public String[] getBanlist() {
		return banlist;
	}
	public void setBanlist(String[] banlist) {
		this.banlist = banlist;
	}
	public List<Features> getFeatures() {
		return features;
	}
	public void setFeatures(List<Features> features) {
		this.features = features;
	}
	public String[] getBusinessSOC() {
		return businessSOC;
	}
	public void setBusinessSOC(String[] businessSOC) {
		this.businessSOC = businessSOC;
	}
	public String[] getDIDline() {
		return didLine;
	}
	public void setDIDline(String[] dIDline) {
		didLine = dIDline;
	}
	public String[] getExtensions() {
		return extensions;
	}
	public void setExtensions(String[] extensions) {
		this.extensions = extensions;
	}
	public String[] getDesklines() {
		return desklines;
	}
	public void setDesklines(String[] desklines) {
		this.desklines = desklines;
	}
	public LogoImage getLogoImage() {
		return logoImage;
	}
	public void setLogoImage(LogoImage logoImage) {
		this.logoImage = logoImage;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
}
