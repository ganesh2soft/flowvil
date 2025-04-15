package in.ayna.flowvil.service;

import java.util.List;

import in.ayna.flowvil.entity.Requirement;

public interface RequirementService {
	// Add a new requirement
    Requirement addRequirement(Requirement requirement);

    // Get all requirements
    List<Requirement> getAllRequirements();

    // Get a requirement by its ID
    Requirement getRequirementById(Long id);

    // Update a requirement by its ID
    Requirement updateRequirement(Long id, Requirement requirement);

    // Delete a requirement by its ID
    void deleteRequirement(Long id);
}

