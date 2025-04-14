package in.ayna.flowvil.entity;

import java.util.Date;



import jakarta.persistence.Column;
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
	
	@ManyToOne
	@JoinColumn(name = "reqcode", referencedColumnName = "requirementId")
	private Requirement requirement; 
	
	/*
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
    */
}
