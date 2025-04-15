package in.ayna.flowvil.service;

import java.util.List;

import in.ayna.flowvil.entity.Batches;

public interface BatchesService {
	//void addBatches(Batches batch);
    List<Batches> getAllBatches();
    Batches getBatchesById(Long id);
  //  void updateBatches(Long id, Batches batch);
    void deleteBatches(Long id);
}
