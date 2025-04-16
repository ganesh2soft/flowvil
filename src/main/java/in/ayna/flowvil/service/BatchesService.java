package in.ayna.flowvil.service;

import java.util.List;

import in.ayna.flowvil.entity.Batches;

public interface BatchesService {
	Batches addBatches(Batches batch);
    List<Batches> getAllBatches();
    Batches getBatchesById(Long id);
    Batches updateBatch(Long id, Batches batch);
    void deleteBatches(Long id);
}
