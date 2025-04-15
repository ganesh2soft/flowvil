package in.ayna.flowvil.entity;


import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "followuptbl")
public class Followup {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long followupId;
	private Date call_Scheduled_Date_Time;
	@ManyToOne
	@JoinColumn(name = "reqcode", referencedColumnName = "requirementId")
	private Requirement requirement; 
	private Boolean client_Evaluation_Cleared;
	private String reason;
	public Long getFollowupId() {
		return followupId;
	}
	public void setFollowupId(Long followupId) {
		this.followupId = followupId;
	}
	public Date getCall_Scheduled_Date_Time() {
		return call_Scheduled_Date_Time;
	}
	public void setCall_Scheduled_Date_Time(Date call_Scheduled_Date_Time) {
		this.call_Scheduled_Date_Time = call_Scheduled_Date_Time;
	}
	public Requirement getRequirement() {
		return requirement;
	}
	public void setRequirement(Requirement requirement) {
		this.requirement = requirement;
	}
	public Boolean getClient_Evaluation_Cleared() {
		return client_Evaluation_Cleared;
	}
	public void setClient_Evaluation_Cleared(Boolean client_Evaluation_Cleared) {
		this.client_Evaluation_Cleared = client_Evaluation_Cleared;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	@Override
	public int hashCode() {
		return Objects.hash(call_Scheduled_Date_Time, client_Evaluation_Cleared, followupId, reason, requirement);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Followup other = (Followup) obj;
		return Objects.equals(call_Scheduled_Date_Time, other.call_Scheduled_Date_Time)
				&& Objects.equals(client_Evaluation_Cleared, other.client_Evaluation_Cleared)
				&& Objects.equals(followupId, other.followupId) && Objects.equals(reason, other.reason)
				&& Objects.equals(requirement, other.requirement);
	}
	@Override
	public String toString() {
		return "Followup [followupId=" + followupId + ", call_Scheduled_Date_Time=" + call_Scheduled_Date_Time
				+ ", requirement=" + requirement + ", client_Evaluation_Cleared=" + client_Evaluation_Cleared
				+ ", reason=" + reason + "]";
	}
	public Followup(Long followupId, Date call_Scheduled_Date_Time, Requirement requirement,
			Boolean client_Evaluation_Cleared, String reason) {
		super();
		this.followupId = followupId;
		this.call_Scheduled_Date_Time = call_Scheduled_Date_Time;
		this.requirement = requirement;
		this.client_Evaluation_Cleared = client_Evaluation_Cleared;
		this.reason = reason;
	}
	public Followup() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
