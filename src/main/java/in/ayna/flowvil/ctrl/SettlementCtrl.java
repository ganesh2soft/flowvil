package in.ayna.flowvil.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ayna.flowvil.entity.Settlement;
import in.ayna.flowvil.service.SettlementService;

@RestController
@RequestMapping("/api/v1/settlement")
@CrossOrigin(origins = "http://localhost:4300")
public class SettlementCtrl {

    @Autowired
    private SettlementService settlementService;

    @PostMapping("/add")
    public Settlement addSettlement(@RequestBody Settlement settlement) {
        return settlementService.addSettlement(settlement);
    }

    @GetMapping("/all")
    public List<Settlement> getAllSettlements() {
        return settlementService.getAllSettlements();
    }

    @GetMapping("/{id}")
    public Settlement getSettlementById(@PathVariable Long id) {
        return settlementService.getSettlementById(id);
    }

//    @PutMapping("/update/{id}")
//    public Settlement updateSettlement(@PathVariable Long id, @RequestBody Settlement settlement) {
//        return settlementService.updateSettlement(id, settlement);
//    }

    @DeleteMapping("/delete/{id}")
    public void deleteSettlement(@PathVariable Long id) {
        settlementService.deleteSettlement(id);
    }
}
