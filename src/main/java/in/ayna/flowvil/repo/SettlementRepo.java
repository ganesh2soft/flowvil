package in.ayna.flowvil.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ayna.flowvil.entity.Settlement;



@Repository
public interface SettlementRepo extends JpaRepository<Settlement, Long>{
	
    
}