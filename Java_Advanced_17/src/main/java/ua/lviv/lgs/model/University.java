package ua.lviv.lgs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "universities")
public class University {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String accreditationLevel;
	
	private Integer numberOfInsitutions;
	
	private Integer numberOfStudents;
	
	private String address;
	
	public University() {}

	public University(String accreditationLevel, Integer numberOfInsitutions, Integer numberOfStudents,
			String address) {
		this.accreditationLevel = accreditationLevel;
		this.numberOfInsitutions = numberOfInsitutions;
		this.numberOfStudents = numberOfStudents;
		this.address = address;
	}


	public University(Long id, String accreditationLevel, Integer numberOfInsitutions, Integer numberOfStudents,
			String address) {
		this.id = id;
		this.accreditationLevel = accreditationLevel;
		this.numberOfInsitutions = numberOfInsitutions;
		this.numberOfStudents = numberOfStudents;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccreditationLevel() {
		return accreditationLevel;
	}

	public void setAccreditationLevel(String accreditationLevel) {
		this.accreditationLevel = accreditationLevel;
	}

	public Integer getNumberOfInsitutions() {
		return numberOfInsitutions;
	}

	public void setNumberOfInsitutions(Integer numberOfInsitutions) {
		this.numberOfInsitutions = numberOfInsitutions;
	}

	public Integer getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(Integer numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", accreditationLevel=" + accreditationLevel + ", numberOfInsitutions="
				+ numberOfInsitutions + ", numberOfStudents=" + numberOfStudents + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accreditationLevel == null) ? 0 : accreditationLevel.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((numberOfInsitutions == null) ? 0 : numberOfInsitutions.hashCode());
		result = prime * result + ((numberOfStudents == null) ? 0 : numberOfStudents.hashCode());
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
		University other = (University) obj;
		if (accreditationLevel == null) {
			if (other.accreditationLevel != null)
				return false;
		} else if (!accreditationLevel.equals(other.accreditationLevel))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numberOfInsitutions == null) {
			if (other.numberOfInsitutions != null)
				return false;
		} else if (!numberOfInsitutions.equals(other.numberOfInsitutions))
			return false;
		if (numberOfStudents == null) {
			if (other.numberOfStudents != null)
				return false;
		} else if (!numberOfStudents.equals(other.numberOfStudents))
			return false;
		return true;
	}
	
	
	
}
