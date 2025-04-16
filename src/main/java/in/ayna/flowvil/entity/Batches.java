package in.ayna.flowvil.entity;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "batchestbl")
public class Batches {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long batchId;	
	private String batchVenue;
	private String trainingMode;
	private int batchDuration; //No of days
	@Temporal(TemporalType.DATE)
	private Date batchStartDate;

	@Temporal(TemporalType.DATE)
	private Date batchEndDate;

    private String batchName;
    private String trainingFor;
    private String locationContactPerson;
    private String locationContactPhone;
    private String technologies;
	public Long getBatchId() {
		return batchId;
	}
	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}
	public String getBatchVenue() {
		return batchVenue;
	}
	public void setBatchVenue(String batchVenue) {
		this.batchVenue = batchVenue;
	}
	public String getTrainingMode() {
		return trainingMode;
	}
	public void setTrainingMode(String trainingMode) {
		this.trainingMode = trainingMode;
	}
	public int getBatchDuration() {
		return batchDuration;
	}
	public void setBatchDuration(int batchDuration) {
		this.batchDuration = batchDuration;
	}
	public Date getBatchStartDate() {
		return batchStartDate;
	}
	public void setBatchStartDate(Date batchStartDate) {
		this.batchStartDate = batchStartDate;
	}
	public Date getBatchEndDate() {
		return batchEndDate;
	}
	public void setBatchEndDate(Date batchEndDate) {
		this.batchEndDate = batchEndDate;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getTrainingFor() {
		return trainingFor;
	}
	public void setTrainingFor(String trainingFor) {
		this.trainingFor = trainingFor;
	}
	public String getLocationContactPerson() {
		return locationContactPerson;
	}
	public void setLocationContactPerson(String locationContactPerson) {
		this.locationContactPerson = locationContactPerson;
	}
	public String getLocationContactPhone() {
		return locationContactPhone;
	}
	public void setLocationContactPhone(String locationContactPhone) {
		this.locationContactPhone = locationContactPhone;
	}
	public String getTechnologies() {
		return technologies;
	}
	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}
	@Override
	public int hashCode() {
		return Objects.hash(batchDuration, batchEndDate, batchId, batchName, batchStartDate, batchVenue,
				locationContactPerson, locationContactPhone, technologies, trainingFor, trainingMode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Batches other = (Batches) obj;
		return batchDuration == other.batchDuration && Objects.equals(batchEndDate, other.batchEndDate)
				&& Objects.equals(batchId, other.batchId) && Objects.equals(batchName, other.batchName)
				&& Objects.equals(batchStartDate, other.batchStartDate) && Objects.equals(batchVenue, other.batchVenue)
				&& Objects.equals(locationContactPerson, other.locationContactPerson)
				&& Objects.equals(locationContactPhone, other.locationContactPhone)
				&& Objects.equals(technologies, other.technologies) && Objects.equals(trainingFor, other.trainingFor)
				&& Objects.equals(trainingMode, other.trainingMode);
	}
	@Override
	public String toString() {
		return "Batches [batchId=" + batchId + ", batchVenue=" + batchVenue + ", trainingMode=" + trainingMode
				+ ", batchDuration=" + batchDuration + ", batchStartDate=" + batchStartDate + ", batchEndDate="
				+ batchEndDate + ", batchName=" + batchName + ", trainingFor=" + trainingFor
				+ ", locationContactPerson=" + locationContactPerson + ", locationContactPhone=" + locationContactPhone
				+ ", technologies=" + technologies + "]";
	}
	public Batches(Long batchId, String batchVenue, String trainingMode, int batchDuration, Date batchStartDate,
			Date batchEndDate, String batchName, String trainingFor, String locationContactPerson,
			String locationContactPhone, String technologies) {
		super();
		this.batchId = batchId;
		this.batchVenue = batchVenue;
		this.trainingMode = trainingMode;
		this.batchDuration = batchDuration;
		this.batchStartDate = batchStartDate;
		this.batchEndDate = batchEndDate;
		this.batchName = batchName;
		this.trainingFor = trainingFor;
		this.locationContactPerson = locationContactPerson;
		this.locationContactPhone = locationContactPhone;
		this.technologies = technologies;
	}
	public Batches() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
