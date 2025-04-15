package in.ayna.flowvil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ayna.flowvil.entity.Requirement;
import in.ayna.flowvil.repo.RequirementRepo;

import java.util.List;
import java.util.Optional;

@Service
public class RequirementServiceImpl implements RequirementService {

    @Autowired
    private RequirementRepo requirementRepo;

    @Override
    public Requirement addRequirement(Requirement requirement) {
        return requirementRepo.save(requirement);  // Save and return the new requirement
    }

    @Override
    public List<Requirement> getAllRequirements() {
        return requirementRepo.findAll();  // Fetch all requirements from the database
    }

    @Override
    public Requirement getRequirementById(Long id) {
        Optional<Requirement> requirement = requirementRepo.findById(id);  // Find by ID
        return requirement.orElse(null);  // Return the requirement if it exists, or null if not found
    }

    @Override
    public Requirement updateRequirement(Long id, Requirement requirement) {
        // Check if the requirement exists before updating
        if (!requirementRepo.existsById(id)) {
            return null;  // You could throw a custom exception here, e.g., RequirementNotFoundException
        }

        // Set the ID on the requirement to ensure it updates the correct entity
        requirement.setRequirementId(id);  // Ensure the correct ID is set before updating
        return requirementRepo.save(requirement);  // Save the updated requirement
    }

    @Override
    public void deleteRequirement(Long id) {
        // Check if the requirement exists before deleting
       
            requirementRepo.deleteById(id);  // Delete the requirement by its ID
        
    }
}
