package in.ayna.flowvil.service;

import java.util.List;

import in.ayna.flowvil.entity.Followup;

public interface FollowupService {
	Followup addFollowup(Followup followup);

    List<Followup> getAllFollowups();

    Followup getFollowupById(Long id);

    Followup updateFollowup(Long id, Followup followup);

    void deleteFollowup(Long id);
}
