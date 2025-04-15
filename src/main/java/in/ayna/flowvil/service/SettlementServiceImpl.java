package in.ayna.flowvil.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ayna.flowvil.entity.Settlement;

import in.ayna.flowvil.repo.SettlementRepo;

@Service
public class SettlementServiceImpl implements SettlementService {

    @Autowired
    private SettlementRepo settlementRepo; // The repository to handle CRUD operations with the DB

    @Override
    public Settlement addSettlement(Settlement settlement) {
        return settlementRepo.save(settlement); // Save and return the newly added settlement
    }

    @Override
    public List<Settlement> getAllSettlements() {
        return settlementRepo.findAll(); // Fetch all settlements from the DB
    }

    @Override
    public Settlement getSettlementById(Long id) {
        Optional<Settlement> settlement = settlementRepo.findById(id);
        return settlement.orElse(null); // Return the settlement if it exists, or null if not
    }

//    @Override
//    public Settlement updateSettlement(Long id, Settlement settlement) {
//        
//        settlement.setSettlementId(id);
//        return settlementRepo.save(settlement);
//    }

    

    @Override
    public void deleteSettlement(Long id) {
        // Check if the settlement exists before deleting
        if (settlementRepo.existsById(id)) {
            settlementRepo.deleteById(id); // Delete the settlement by ID
        }
    }
}