package main;

import Abstract.BaseGamerService;
import Adapters.GamerCheckAdapter;
import Concrete.CampaignCheckManager;
import Concrete.EdevletManager;
import Concrete.GameManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {


    public static void main(String[] args) {
        GamerCheckAdapter realGamer= new GamerCheckAdapter("Samet","12345","20.07.2000");

        Gamer fakeGamer1 = new Gamer("1", "Samet", "Acar",
                "acaarsamet@gmail.com", 1500, "123456", "12345","20.07.2000");
        Game game = new Game("1", "RedAlert2 ", 150);
        BaseGamerService gamerCheckService=new EdevletManager(
                new GamerCheckAdapter(realGamer.getFirstName(), realGamer.getNationaltyID(),realGamer.getDateOfBirth()));
        gamerCheckService.save(fakeGamer1);

        Campaign campaign1 = new Campaign("Kara Cuma ", "20.05.2022", 20);
        CampaignCheckManager campaignCheckManager = new CampaignCheckManager();
        campaignCheckManager.discount(campaign1, game);
        GameManager gameManager=new GameManager();
        gameManager.saleGame(game,fakeGamer1,campaign1);

    }
}

