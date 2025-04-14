package in.ayna.flowvil.entity;


import java.util.Date;

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
	
}
