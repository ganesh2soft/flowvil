package in.ayna.flowvil.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ayna.flowvil.entity.Trainer;


@Repository
public interface TrainerRepo extends JpaRepository<Trainer, Long> {

}
