package in.ayna.flowvil.service;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ayna.flowvil.entity.Followup;
import in.ayna.flowvil.entity.Vendor;
import in.ayna.flowvil.repo.FollowupRepo;

@Service
public class FollowupServiceImpl implements FollowupService {
	@Autowired
    private FollowupRepo followupRepo;

    @Override
    public Followup addFollowup(Followup followup) {
        return followupRepo.save(followup);
    }

    @Override
    public List<Followup> getAllFollowups() {
        return followupRepo.findAll();
    }

    @Override
    public Followup getFollowupById(Long id) {
       return followupRepo.findById(id).orElse(null);
    }

    @Override
    public Followup updateFollowup(Long id, Followup followup) {
        if (!followupRepo.existsById(id)) {
            return null; // or throw custom exception
        }
        followup.setFollowupId(id); // Make sure your entity has this setter
        return followupRepo.save(followup);
    }

    @Override
    public void deleteFollowup(Long id) {
        if (followupRepo.existsById(id)) {
            followupRepo.deleteById(id);
        }
    }
}
