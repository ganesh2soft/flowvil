package in.ayna.flowvil.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ayna.flowvil.entity.Requirement;


@Repository
public interface RequirementRepo extends JpaRepository<Requirement, Long>{

}
