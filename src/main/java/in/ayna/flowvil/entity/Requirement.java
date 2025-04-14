package in.ayna.flowvil.entity;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "requiretbl")
public class Requirement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long requirementId;
	@Column(nullable=false)
	private String vendorName;
	private String vendorContactPerson;
	private String vendorPhone;
	private String clientName;
	private int durationofDays;
	@Column(nullable=false)
	private String batchMode;
	private Date validTill;
	private int budgetperDay;
	private String subject;
	public Long getRequirementId() {
		return requirementId;
	}
	public void setRequirementId(Long requirementId) {
		this.requirementId = requirementId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorContactPerson() {
		return vendorContactPerson;
	}
	public void setVendorContactPerson(String vendorContactPerson) {
		this.vendorContactPerson = vendorContactPerson;
	}
	public String getVendorPhone() {
		return vendorPhone;
	}
	public void setVendorPhone(String vendorPhone) {
		this.vendorPhone = vendorPhone;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public int getDurationofDays() {
		return durationofDays;
	}
	public void setDurationofDays(int durationofDays) {
		this.durationofDays = durationofDays;
	}
	public String getBatchMode() {
		return batchMode;
	}
	public void setBatchMode(String batchMode) {
		this.batchMode = batchMode;
	}
	public Date getValidTill() {
		return validTill;
	}
	public void setValidTill(Date validTill) {
		this.validTill = validTill;
	}
	public int getBudgetperDay() {
		return budgetperDay;
	}
	public void setBudgetperDay(int budgetperDay) {
		this.budgetperDay = budgetperDay;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public int hashCode() {
		return Objects.hash(batchMode, budgetperDay, clientName, durationofDays, requirementId, subject, validTill,
				vendorContactPerson, vendorName, vendorPhone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Requirement other = (Requirement) obj;
		return Objects.equals(batchMode, other.batchMode) && budgetperDay == other.budgetperDay
				&& Objects.equals(clientName, other.clientName) && durationofDays == other.durationofDays
				&& Objects.equals(requirementId, other.requirementId) && Objects.equals(subject, other.subject)
				&& Objects.equals(validTill, other.validTill)
				&& Objects.equals(vendorContactPerson, other.vendorContactPerson)
				&& Objects.equals(vendorName, other.vendorName) && Objects.equals(vendorPhone, other.vendorPhone);
	}
	@Override
	public String toString() {
		return "Requirement [requirementId=" + requirementId + ", vendorName=" + vendorName + ", vendorContactPerson="
				+ vendorContactPerson + ", vendorPhone=" + vendorPhone + ", clientName=" + clientName
				+ ", durationofDays=" + durationofDays + ", batchMode=" + batchMode + ", validTill=" + validTill
				+ ", budgetperDay=" + budgetperDay + ", subject=" + subject + "]";
	}
	public Requirement(Long requirementId, String vendorName, String vendorContactPerson, String vendorPhone,
			String clientName, int durationofDays, String batchMode, Date validTill, int budgetperDay, String subject) {
		super();
		this.requirementId = requirementId;
		this.vendorName = vendorName;
		this.vendorContactPerson = vendorContactPerson;
		this.vendorPhone = vendorPhone;
		this.clientName = clientName;
		this.durationofDays = durationofDays;
		this.batchMode = batchMode;
		this.validTill = validTill;
		this.budgetperDay = budgetperDay;
		this.subject = subject;
	}
	public Requirement() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}