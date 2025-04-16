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

import in.ayna.flowvil.entity.Followup;
import in.ayna.flowvil.service.FollowupService;

@RestController
@RequestMapping("/api/v1/followup")
@CrossOrigin(origins = "http://localhost:4300")
public class FollowupCtrl {

    @Autowired
    private FollowupService followupService;

    @PostMapping("/add")
    public Followup addFollowup(@RequestBody Followup followup) {
        return followupService.addFollowup(followup);
    }

    @GetMapping("/all")
    public List<Followup> getAllFollowups() {
        return followupService.getAllFollowups();
    }

    @GetMapping("/get/{id}")
    public Followup getFollowupById(@PathVariable Long id) {
        return followupService.getFollowupById(id);
    }

    @PutMapping("/update/{id}")
    public Followup updateFollowup(@PathVariable Long id, @RequestBody Followup followup) {
        return followupService.updateFollowup(id, followup);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFollowup(@PathVariable Long id) {
        followupService.deleteFollowup(id);
    }
}
