package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService {

    @Override
    public void add(Game game) {
        System.out.println(game.getName() + "Adlı Oyun Eklendi.");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getName() + "Adlı oyun Silindi");
    }

    @Override
    public void saleGame(Game game, Gamer gamer, Campaign campaign) {
        System.out.println(game.getName() + "Adlı Oyunun Satışı Gerçekleştiriliyor...\n"+"Oyunun Gerçek Fiyatı : "+game.getPrice()+
                "TL \n Uygulanan Kampanya : " + campaign.getName() +"( %"+campaign.getDiscount()+" )"+
                "\n Alınan Oyunun Fiyatı : " + (game.getPrice()- game.getPrice()*campaign.getDiscount()/100)
                + "TL \n Alan Kişi : " + gamer.getFirstName());


    }
}
