package in.ayna.flowvil.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "batchtbl")
public class Batch {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long batchId;
	//private  Followupid //foreign key
	private String batchVenue;
	private String trainingMode;
	private int batchDuration; //No of days
	private Date batchStartDate;
	private Date batchEndDate;
    private String batchName;
    private String trainingFor;
    private String locationContactPerson;
    private String locationContactPhone;
    private String technologies;
	
	
}
