package in.ayna.flowvil.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ayna.flowvil.entity.Followup;


@Repository
public interface FollowupRepo extends JpaRepository<Followup, Long>{

}
