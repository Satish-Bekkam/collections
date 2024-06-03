package com.demo;



public class Training {
	
	@Override
	public String toString() {
		return "Training [trainingId=" + trainingId + ", trainingName=" + trainingName + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", trainingMode=" + trainingMode + ", businessUnit=" + businessUnit
				+ ", contactPersonId=" + contactPersonId + "]";
	}
	private String trainingId;
    private String trainingName;
    private String startDate;
    private String endDate;
    private String trainingMode;
    private String businessUnit;
    private String contactPersonId;
	public String getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(String trainingId) {
		this.trainingId = trainingId;
	}
	public String getTrainingName() {
		return trainingName;
	}
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getTrainingMode() {
		return trainingMode;
	}
	public void setTrainingMode(String trainingMode) {
		this.trainingMode = trainingMode;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public String getContactPersonId() {
		return contactPersonId;
	}
	public void setContactPersonId(String contactPersonId) {
		this.contactPersonId = contactPersonId;
	}
	public Training() {
		super();
	}
	public Training(String trainingId, String trainingName, String startDate, String endDate, String trainingMode,
			String businessUnit, String contactPersonId) {
		super();
		this.trainingId = trainingId;
		this.trainingName = trainingName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.trainingMode = trainingMode;
		this.businessUnit = businessUnit;
		this.contactPersonId = contactPersonId;
	}

}
