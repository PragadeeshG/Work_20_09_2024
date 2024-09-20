package com.test1;

public class ConsumedApplicationEffectAssesment {
	private String assesmentType;
	private String currrentFlowPath;
	private boolean healthCheck;
	private Integer flowBreakIndicator;
	private String consumedApplicationName;
	private String onlineAssesment;
	private Integer onlineAssesmentCode;
	private String onlineAssesmentUrl;
	private String credentials;
	private Integer offlineAssesmentCode;
	private String offlineAssesmentLocation;
	private String operationsEmail;
	private String flowBreakRootCause;

	public ConsumedApplicationEffectAssesment() {

	}

	public ConsumedApplicationEffectAssesment(String assesmentType, String currrentFlowPath, boolean healthCheck,
			Integer flowBreakIndicator, String consumedApplicationName, String onlineAssesment,
			Integer onlineAssesmentCode, String onlineAssesmentUrl, String credentials, Integer offlineAssesmentCode,
			String offlineAssesmentLocation, String operationsEmail, String flowBreakRootCause) {
		super();
		this.assesmentType = assesmentType;
		this.currrentFlowPath = currrentFlowPath;
		this.healthCheck = healthCheck;
		this.flowBreakIndicator = flowBreakIndicator;
		this.consumedApplicationName = consumedApplicationName;
		this.onlineAssesment = onlineAssesment;
		this.onlineAssesmentCode = onlineAssesmentCode;
		this.onlineAssesmentUrl = onlineAssesmentUrl;
		this.credentials = credentials;
		this.offlineAssesmentCode = offlineAssesmentCode;
		this.offlineAssesmentLocation = offlineAssesmentLocation;
		this.operationsEmail = operationsEmail;
		this.flowBreakRootCause = flowBreakRootCause;
	}

	public String getAssesmentType() {
		return assesmentType;
	}

	public void setAssesmentType(String assesmentType) {
		this.assesmentType = assesmentType;
	}

	public String getCurrrentFlowPath() {
		return currrentFlowPath;
	}

	public void setCurrrentFlowPath(String currrentFlowPath) {
		this.currrentFlowPath = currrentFlowPath;
	}

	public boolean isHealthCheck() {
		return healthCheck;
	}

	public void setHealthCheck(boolean healthCheck) {
		this.healthCheck = healthCheck;
	}

	public Integer getFlowBreakIndicator() {
		return flowBreakIndicator;
	}

	public void setFlowBreakIndicator(Integer flowBreakIndicator) {
		this.flowBreakIndicator = flowBreakIndicator;
	}

	public String getConsumedApplicationName() {
		return consumedApplicationName;
	}

	public void setConsumedApplicationName(String consumedApplicationName) {
		this.consumedApplicationName = consumedApplicationName;
	}

	public String getOnlineAssesment() {
		return onlineAssesment;
	}

	public void setOnlineAssesment(String onlineAssesment) {
		this.onlineAssesment = onlineAssesment;
	}

	public Integer getOnlineAssesmentCode() {
		return onlineAssesmentCode;
	}

	public void setOnlineAssesmentCode(Integer onlineAssesmentCode) {
		this.onlineAssesmentCode = onlineAssesmentCode;
	}

	public String getOnlineAssesmentUrl() {
		return onlineAssesmentUrl;
	}

	public void setOnlineAssesmentUrl(String onlineAssesmentUrl) {
		this.onlineAssesmentUrl = onlineAssesmentUrl;
	}

	public String getCredentials() {
		return credentials;
	}

	public void setCredentials(String credentials) {
		this.credentials = credentials;
	}

	public Integer getOfflineAssesmentCode() {
		return offlineAssesmentCode;
	}

	public void setOfflineAssesmentCode(Integer offlineAssesmentCode) {
		this.offlineAssesmentCode = offlineAssesmentCode;
	}

	public String getOfflineAssesmentLocation() {
		return offlineAssesmentLocation;
	}

	public void setOfflineAssesmentLocation(String offlineAssesmentLocation) {
		this.offlineAssesmentLocation = offlineAssesmentLocation;
	}

	public String getOperationsEmail() {
		return operationsEmail;
	}

	public void setOperationsEmail(String operationsEmail) {
		this.operationsEmail = operationsEmail;
	}

	public String getFlowBreakRootCause() {
		return flowBreakRootCause;
	}

	public void setFlowBreakRootCause(String flowBreakRootCause) {
		this.flowBreakRootCause = flowBreakRootCause;
	}

}
