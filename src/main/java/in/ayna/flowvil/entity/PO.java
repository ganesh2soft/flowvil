package in.ayna.flowvil.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "potbl")
public class PO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Long poId;
	
	//batchId foreign key
	
	//@Timestamp
    private Date pogDate;
  
}
