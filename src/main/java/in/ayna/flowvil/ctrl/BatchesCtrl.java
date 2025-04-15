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

import in.ayna.flowvil.entity.Batches;
import in.ayna.flowvil.service.BatchesService;

@RestController
@RequestMapping("/api/v1/batches")
@CrossOrigin(origins = "http://localhost:4300")
public class BatchesCtrl {

    @Autowired
    private BatchesService batchesService;

//    @PostMapping("/add")
//    public Batches addBatches(@RequestBody Batches batch) {
//        return batchesService.addBatches(batch);
//    }

    @GetMapping("/all")
    public List<Batches> getAllBatches() {
        return batchesService.getAllBatches();
    }

    @GetMapping("/{id}")
    public Batches getBatchById(@PathVariable Long id) {
        return batchesService.getBatchesById(id);
    }

//    @PutMapping("/update/{id}")
//    public Batches updateBatch(@PathVariable Long id, @RequestBody Batches batch) {
//        return batchesService.updateBatches(id, batch);
//    }

    @DeleteMapping("/delete/{id}")
    public void deleteBatch(@PathVariable Long id) {
        batchesService.deleteBatches(id);
    }
}