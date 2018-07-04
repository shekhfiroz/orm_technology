package com.tpcc.beans;

import java.io.Serializable;

abstract class Project implements Serializable {

	protected String projectId;
	protected String projctName;
	protected String description;
	protected String type;

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjctName() {
		return projctName;
	}

	public void setProjctName(String projctName) {
		this.projctName = projctName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((projctName == null) ? 0 : projctName.hashCode());
		result = prime * result + ((projectId == null) ? 0 : projectId.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (projctName == null) {
			if (other.projctName != null)
				return false;
		} else if (!projctName.equals(other.projctName))
			return false;
		if (projectId == null) {
			if (other.projectId != null)
				return false;
		} else if (!projectId.equals(other.projectId))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projctName=" + projctName + ", description=" + description
				+ ", type=" + type + "]";
	}

}
