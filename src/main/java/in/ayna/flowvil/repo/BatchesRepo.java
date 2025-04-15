package in.ayna.flowvil.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ayna.flowvil.entity.Batches;


@Repository
public interface BatchesRepo extends JpaRepository<Batches, Long>{

}

