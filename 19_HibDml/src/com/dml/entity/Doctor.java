package com.dml.entity;

import java.io.Serializable;

public class Doctor implements Serializable {
	private static final long serialVersionUID = 1L;
	
	protected String doctorId;
	protected String doctorName;
	protected String experience;
	protected String specilization;
	protected String qualification;

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getSpecilization() {
		return specilization;
	}

	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((doctorId == null) ? 0 : doctorId.hashCode());
		result = prime * result + ((doctorName == null) ? 0 : doctorName.hashCode());
		result = prime * result + ((experience == null) ? 0 : experience.hashCode());
		result = prime * result + ((qualification == null) ? 0 : qualification.hashCode());
		result = prime * result + ((specilization == null) ? 0 : specilization.hashCode());
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
		Doctor other = (Doctor) obj;
		if (doctorId == null) {
			if (other.doctorId != null)
				return false;
		} else if (!doctorId.equals(other.doctorId))
			return false;
		if (doctorName == null) {
			if (other.doctorName != null)
				return false;
		} else if (!doctorName.equals(other.doctorName))
			return false;
		if (experience == null) {
			if (other.experience != null)
				return false;
		} else if (!experience.equals(other.experience))
			return false;
		if (qualification == null) {
			if (other.qualification != null)
				return false;
		} else if (!qualification.equals(other.qualification))
			return false;
		if (specilization == null) {
			if (other.specilization != null)
				return false;
		} else if (!specilization.equals(other.specilization))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", experience=" + experience
				+ ", specilization=" + specilization + ", qualification=" + qualification + "]";
	}

}
