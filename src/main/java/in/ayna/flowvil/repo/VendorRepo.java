package in.ayna.flowvil.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ayna.flowvil.entity.Vendor;



@Repository
public interface VendorRepo extends JpaRepository<Vendor, Long>{

}
