package in.ayna.flowvil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ayna.flowvil.entity.Trainer;
import in.ayna.flowvil.repo.TrainerRepo;
@Service
public class TrainerServiceImpl implements TrainerService {
	@Autowired
    private TrainerRepo trainerRepo;

    @Override
    public Trainer addTrainer(Trainer trainer) {
        return trainerRepo.save(trainer);
       
    }
    
    @Override
    public List<Trainer> getAllTrainers() {
        return trainerRepo.findAll();
    }

    @Override
    public Trainer getTrainerById(Long id) {
        return trainerRepo.findById(id).orElse(null);
    }

    @Override
    public Trainer updateTrainer(Long id, Trainer trainer) {
        trainer.setTrainerId(id); // correct field name
        return trainerRepo.save(trainer);
    }

    @Override
    public void deleteTrainer(Long id) {
        trainerRepo.deleteById(id);
    }
}
