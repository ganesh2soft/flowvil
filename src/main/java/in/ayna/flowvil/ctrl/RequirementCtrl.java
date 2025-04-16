package in.ayna.flowvil.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ayna.flowvil.entity.Requirement;
import in.ayna.flowvil.service.RequirementService;

@RestController
@RequestMapping("/api/v1/requirement")
@CrossOrigin(origins = "http://localhost:4300")
public class RequirementCtrl {

    @Autowired
    private RequirementService requirementService;

    @PostMapping("/add")
    public Requirement addRequirement(@RequestBody Requirement requirement) {
        return requirementService.addRequirement(requirement);
    }

    @GetMapping("/all")
    public List<Requirement> getAllRequirements() {
        return requirementService.getAllRequirements();
    }

    @GetMapping("/get/{id}")
    public Requirement getRequirementById(@PathVariable Long id) {
        return requirementService.getRequirementById(id);
    }

    @PutMapping("/update/{id}")
    public Requirement updateRequirement(@PathVariable Long id, @RequestBody Requirement requirement) {
        return requirementService.updateRequirement(id, requirement);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRequirement(@PathVariable Long id) {
        requirementService.deleteRequirement(id);
    }
}
