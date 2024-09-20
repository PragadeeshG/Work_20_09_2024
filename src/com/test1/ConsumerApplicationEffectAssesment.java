package com.test1;

public class ConsumerApplicationEffectAssesment {
	private String assesmentType;
	private boolean healthCheck;
	private Integer downstreamCode;
	private String currentFlowPath;
	private String onlineAssesment;
	private Integer onlineAssesmentCode;
	private String onlineAssesmentUrl;
	private String qualityControls;
	private Integer dataQualityCode;
	private String dataQualityCheckDoneDate;
	private String dataQualityStatus;
	private String operationsEmail;
	private String impactAalysis;
	private String rootCauseTracker;
	private String entityState;
	private String remarks;

	public ConsumerApplicationEffectAssesment() {

	}

	public ConsumerApplicationEffectAssesment(String assesmentType, boolean healthCheck, Integer downstreamCode,
			String currentFlowPath, String onlineAssesment, Integer onlineAssesmentCode, String onlineAssesmentUrl,
			String qualityControls, Integer dataQualityCode, String dataQualityCheckDoneDate, String dataQualityStatus,
			String operationsEmail, String impactAalysis, String rootCauseTracker, String entityState, String remarks) {
		super();
		this.assesmentType = assesmentType;
		this.healthCheck = healthCheck;
		this.downstreamCode = downstreamCode;
		this.currentFlowPath = currentFlowPath;
		this.onlineAssesment = onlineAssesment;
		this.onlineAssesmentCode = onlineAssesmentCode;
		this.onlineAssesmentUrl = onlineAssesmentUrl;
		this.qualityControls = qualityControls;
		this.dataQualityCode = dataQualityCode;
		this.dataQualityCheckDoneDate = dataQualityCheckDoneDate;
		this.dataQualityStatus = dataQualityStatus;
		this.operationsEmail = operationsEmail;
		this.impactAalysis = impactAalysis;
		this.rootCauseTracker = rootCauseTracker;
		this.entityState = entityState;
		this.remarks = remarks;
	}

	public String getAssesmentType() {
		return assesmentType;
	}

	public void setAssesmentType(String assesmentType) {
		this.assesmentType = assesmentType;
	}

	public boolean isHealthCheck() {
		return healthCheck;
	}

	public void setHealthCheck(boolean healthCheck) {
		this.healthCheck = healthCheck;
	}

	public Integer getDownstreamCode() {
		return downstreamCode;
	}

	public void setDownstreamCode(Integer downstreamCode) {
		this.downstreamCode = downstreamCode;
	}

	public String getCurrentFlowPath() {
		return currentFlowPath;
	}

	public void setCurrentFlowPath(String currentFlowPath) {
		this.currentFlowPath = currentFlowPath;
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

	public String getQualityControls() {
		return qualityControls;
	}

	public void setQualityControls(String qualityControls) {
		this.qualityControls = qualityControls;
	}

	public Integer getDataQualityCode() {
		return dataQualityCode;
	}

	public void setDataQualityCode(Integer dataQualityCode) {
		this.dataQualityCode = dataQualityCode;
	}

	public String getDataQualityCheckDoneDate() {
		return dataQualityCheckDoneDate;
	}

	public void setDataQualityCheckDoneDate(String dataQualityCheckDoneDate) {
		this.dataQualityCheckDoneDate = dataQualityCheckDoneDate;
	}

	public String getDataQualityStatus() {
		return dataQualityStatus;
	}

	public void setDataQualityStatus(String dataQualityStatus) {
		this.dataQualityStatus = dataQualityStatus;
	}

	public String getOperationsEmail() {
		return operationsEmail;
	}

	public void setOperationsEmail(String operationsEmail) {
		this.operationsEmail = operationsEmail;
	}

	public String getImpactAalysis() {
		return impactAalysis;
	}

	public void setImpactAalysis(String impactAalysis) {
		this.impactAalysis = impactAalysis;
	}

	public String getRootCauseTracker() {
		return rootCauseTracker;
	}

	public void setRootCauseTracker(String rootCauseTracker) {
		this.rootCauseTracker = rootCauseTracker;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
