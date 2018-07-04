package com.tpsc.beans;

public class TimeBasedProject extends Project {

	protected String totalCompletionTime;
	protected String perHourRate;

	public String getTotalCompletionTime() {
		return totalCompletionTime;
	}

	public void setTotalCompletionTime(String totalCompletionTime) {
		this.totalCompletionTime = totalCompletionTime;
	}

	public String getPerHourRate() {
		return perHourRate;
	}

	public void setPerHourRate(String perHourRate) {
		this.perHourRate = perHourRate;
	}

	@Override
	public String toString() {
		return "TimeBasedProject [totalCompletionTime=" + totalCompletionTime + ", perHourRate=" + perHourRate
				+ ", projectId=" + projectId + ", projctName=" + projctName + ", description=" + description + ", type="
				+ type + "]";
	}

}
