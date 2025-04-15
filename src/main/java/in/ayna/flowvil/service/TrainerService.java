package in.ayna.flowvil.service;

import java.util.List;

import in.ayna.flowvil.entity.Trainer;

public interface TrainerService {

    public Trainer addTrainer(Trainer trainer);
    List<Trainer> getAllTrainers();
    Trainer getTrainerById(Long id);
    Trainer updateTrainer(Long id, Trainer trainer);
    void deleteTrainer(Long id);
}
