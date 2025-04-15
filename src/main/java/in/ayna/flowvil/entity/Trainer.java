package in.ayna.flowvil.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trainertbl")
public class Trainer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Long trainerId;
	
	private String trainerName;
	private String trainerEmail;
	private String trainerPhone;
	private String trainerLocation;
	private int costperday;
	private String technologics;
	public Long getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(Long trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getTrainerEmail() {
		return trainerEmail;
	}
	public void setTrainerEmail(String trainerEmail) {
		this.trainerEmail = trainerEmail;
	}
	public String getTrainerPhone() {
		return trainerPhone;
	}
	public void setTrainerPhone(String trainerPhone) {
		this.trainerPhone = trainerPhone;
	}
	public String getTrainerLocation() {
		return trainerLocation;
	}
	public void setTrainerLocation(String trainerLocation) {
		this.trainerLocation = trainerLocation;
	}
	public int getCostperday() {
		return costperday;
	}
	public void setCostperday(int costperday) {
		this.costperday = costperday;
	}
	public String getTechnologics() {
		return technologics;
	}
	public void setTechnologics(String technologics) {
		this.technologics = technologics;
	}
	@Override
	public int hashCode() {
		return Objects.hash(costperday, technologics, trainerEmail, trainerId, trainerLocation, trainerName,
				trainerPhone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trainer other = (Trainer) obj;
		return costperday == other.costperday && Objects.equals(technologics, other.technologics)
				&& Objects.equals(trainerEmail, other.trainerEmail) && Objects.equals(trainerId, other.trainerId)
				&& Objects.equals(trainerLocation, other.trainerLocation)
				&& Objects.equals(trainerName, other.trainerName) && Objects.equals(trainerPhone, other.trainerPhone);
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", trainerEmail=" + trainerEmail
				+ ", trainerPhone=" + trainerPhone + ", trainerLocation=" + trainerLocation + ", costperday="
				+ costperday + ", technologics=" + technologics + "]";
	}
	public Trainer(Long trainerId, String trainerName, String trainerEmail, String trainerPhone, String trainerLocation,
			int costperday, String technologics) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.trainerEmail = trainerEmail;
		this.trainerPhone = trainerPhone;
		this.trainerLocation = trainerLocation;
		this.costperday = costperday;
		this.technologics = technologics;
	}
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
