package Abstract;

import Entities.Campaign;
import Entities.Game;

public interface CampaignService {
    void discount(Campaign campaign, Game game);
}