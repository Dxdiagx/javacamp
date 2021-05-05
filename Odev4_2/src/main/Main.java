package main;

import Abstract.BaseGamerService;
import Adapters.GamerCheckAdapter;
import Concrete.CampaignCheckManager;
import Concrete.EdevletManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {


    public static void main(String[] args) {
        GamerCheckAdapter realGamer = new GamerCheckAdapter();
        realGamer.setNationaltyID("12345");
        realGamer.setFirstName("Samet");
        realGamer.setDateOfBirth("20.07.2001"); // KODU ÇALIŞTIRMAK İÇİN 2001 YAZAN YERE 2000 YAZMANIZ GEREKİYOR.

        Gamer fakeGamer1 = new Gamer("1", "Samet", "Acar",
                "acaarsamet@gmail.com", 1500, "123456", "12345",
                "20.07.2000");
        BaseGamerService gamerManager = new GamerManager(new EdevletManager
                (new GamerCheckAdapter(realGamer.getFirstName(), realGamer.getNationaltyID(),
                        realGamer.getDateOfBirth())));
        gamerManager.save(fakeGamer1);
        Game game = new Game("1", "RedAlert2 ", 150);
        Campaign campaign1 = new Campaign("Kara Cuma ", "20.05.2022", 20);
        CampaignCheckManager campaignCheckManager = new CampaignCheckManager();
        campaignCheckManager.discount(campaign1, game);
        GameManager gameManager = new GameManager();
        gameManager.saleGame(game, fakeGamer1, campaign1);

    }
}
