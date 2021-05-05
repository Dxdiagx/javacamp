package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameCheckManager implements GameService {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    @Override
    public void add(Game game) {

    }

    @Override
    public void delete(Game game) {

    }

    @Override
    public void saleGame(Game game, Gamer gamer, Campaign campaign) {

    }
}
