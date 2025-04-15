package in.ayna.flowvil.service;

import java.util.List;

import in.ayna.flowvil.entity.Settlement;
import in.ayna.flowvil.entity.Trainer;

public interface SettlementService {
	Settlement addSettlement(Settlement settlement);
	   
    List<Settlement> getAllSettlements();
  
    Settlement getSettlementById(Long id);

  //  Settlement updateSettlement(Long id, Settlement settlement);

    void deleteSettlement(Long id);
}
