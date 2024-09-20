package com.test1;

public class EffectAssesment {
	private String assesmentType;
	private String sourceApplication;
	private String sourceDataset;
	private String applicableToAllData;
	private String modelName;
	private String modelRefrenceCode;
	private String assesmentMedium;
	private Integer maxAllowedFailures;
	private String followUpRequired;
	private String reAssesmentRequired;
	private String entityState;

	public EffectAssesment() {

	}

	public EffectAssesment(String assesmentType, String sourceApplication, String sourceDataset,
			String applicableToAllData, String modelName, String modelRefrenceCode, String assesmentMedium,
			Integer maxAllowedFailures, String followUpRequired, String reAssesmentRequired, String entityState) {
		super();
		this.assesmentType = assesmentType;
		this.sourceApplication = sourceApplication;
		this.sourceDataset = sourceDataset;
		this.applicableToAllData = applicableToAllData;
		this.modelName = modelName;
		this.modelRefrenceCode = modelRefrenceCode;
		this.assesmentMedium = assesmentMedium;
		this.maxAllowedFailures = maxAllowedFailures;
		this.followUpRequired = followUpRequired;
		this.reAssesmentRequired = reAssesmentRequired;
		this.entityState = entityState;
	}

	public String getAssesmentType() {
		return assesmentType;
	}

	public void setAssesmentType(String assesmentType) {
		this.assesmentType = assesmentType;
	}

	public String getSourceApplication() {
		return sourceApplication;
	}

	public void setSourceApplication(String sourceApplication) {
		this.sourceApplication = sourceApplication;
	}

	public String getSourceDataset() {
		return sourceDataset;
	}

	public void setSourceDataset(String sourceDataset) {
		this.sourceDataset = sourceDataset;
	}

	public String getApplicableToAllData() {
		return applicableToAllData;
	}

	public void setApplicableToAllData(String applicableToAllData) {
		this.applicableToAllData = applicableToAllData;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelRefrenceCode() {
		return modelRefrenceCode;
	}

	public void setModelRefrenceCode(String modelRefrenceCode) {
		this.modelRefrenceCode = modelRefrenceCode;
	}

	public String getAssesmentMedium() {
		return assesmentMedium;
	}

	public void setAssesmentMedium(String assesmentMedium) {
		this.assesmentMedium = assesmentMedium;
	}

	public Integer getMaxAllowedFailures() {
		return maxAllowedFailures;
	}

	public void setMaxAllowedFailures(Integer maxAllowedFailures) {
		this.maxAllowedFailures = maxAllowedFailures;
	}

	public String getFollowUpRequired() {
		return followUpRequired;
	}

	public void setFollowUpRequired(String followUpRequired) {
		this.followUpRequired = followUpRequired;
	}

	public String getReAssesmentRequired() {
		return reAssesmentRequired;
	}

	public void setReAssesmentRequired(String reAssesmentRequired) {
		this.reAssesmentRequired = reAssesmentRequired;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
