package in.ayna.flowvil.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "settlementtbl")
public class Settlement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Long settlementId;
	
	//batchId,
	//poId,
	
}
