package com.tpsc.beans;

public class FixedBidProject extends Project {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String projectDuration;
	protected float projectCost;

	public String getProjectDuration() {
		return projectDuration;
	}

	public void setProjectDuration(String projectDuration) {
		this.projectDuration = projectDuration;
	}

	public float getProjectCost() {
		return projectCost;
	}

	public void setProjectCost(float projectCost) {
		this.projectCost = projectCost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(projectCost);
		result = prime * result + ((projectDuration == null) ? 0 : projectDuration.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FixedBidProject other = (FixedBidProject) obj;
		if (Float.floatToIntBits(projectCost) != Float.floatToIntBits(other.projectCost))
			return false;
		if (projectDuration == null) {
			if (other.projectDuration != null)
				return false;
		} else if (!projectDuration.equals(other.projectDuration))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FixedBidProject [projectDuration=" + projectDuration + ", projectCost=" + projectCost + ", projectId="
				+ projectId + ", projctName=" + projctName + ", description=" + description + ", type=" + type + "]";
	}

}
