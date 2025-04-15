package in.ayna.flowvil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ayna.flowvil.entity.Vendor;
import in.ayna.flowvil.repo.VendorRepo;

@Service
public class VendorServiceImpl implements VendorService {
	@Autowired
    private VendorRepo vendorRepo;

    @Override
    public Vendor addVendor(Vendor vendor) {
        return vendorRepo.save(vendor);
    }

    @Override
    public List<Vendor> getAllVendors() {
        return vendorRepo.findAll();
    }

    @Override
    public Vendor getVendorById(Long id) {
        return vendorRepo.findById(id).orElse(null);
    }

    @Override
    public Vendor updateVendor(Long id, Vendor vendor) {
        vendor.setVendorId(id); // Ensure you're using the correct field name (vendorId)
        return vendorRepo.save(vendor); // Save the updated vendor entity
    }
    @Override
    public void deleteVendor(Long id) {
        vendorRepo.deleteById(id);
    }
}
