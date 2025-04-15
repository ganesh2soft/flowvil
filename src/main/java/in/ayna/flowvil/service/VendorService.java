package in.ayna.flowvil.service;

import java.util.List;

import in.ayna.flowvil.entity.Vendor;

public interface VendorService {
	Vendor addVendor(Vendor vendor);

	List<Vendor> getAllVendors();

	Vendor getVendorById(Long id);

	Vendor updateVendor(Long id, Vendor vendor);

	void deleteVendor(Long id);
}
