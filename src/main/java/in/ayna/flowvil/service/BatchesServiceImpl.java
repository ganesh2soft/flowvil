package in.ayna.flowvil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ayna.flowvil.entity.Batches;
import in.ayna.flowvil.repo.BatchesRepo;

@Service
public class BatchesServiceImpl implements BatchesService {

	@Autowired
	private BatchesRepo batchesRepo;

	@Override
	public Batches addBatches(Batches batch) {
		return batchesRepo.save(batch);
	}

	@Override
	public List<Batches> getAllBatches() {
		// TODO Auto-generated method stub
		return batchesRepo.findAll();
	}

	@Override
	public Batches getBatchesById(Long id) {
		return batchesRepo.findById(id).orElse(null);
	}

	@Override
	public Batches updateBatch(Long id, Batches batch) {
		batch.setBatchId(id); // make sure Batches has setId()
		return batchesRepo.save(batch);

	}
	@Override
	public void deleteBatches(Long id) {
		// TODO Auto-generated method stub
		batchesRepo.deleteById(id);
	}

}
