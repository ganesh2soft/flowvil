package in.ayna.flowvil.entity;

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
	
}
