package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignCheckManager implements CampaignService {
    public CampaignCheckManager() {
    }

    public void discount(Campaign campaign, Game game) {

        System.out.println(game.getName() + "Adlı Oyuna  %" + campaign.getDiscount()
                + " oranında indirim Yapıldı.");
    }
}

