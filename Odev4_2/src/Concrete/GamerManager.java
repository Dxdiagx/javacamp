package Concrete;

import Abstract.BaseGamerService;
import Entities.Gamer;

public class GamerManager extends BaseGamerService {
    private BaseGamerService baseGamerService;

    public GamerManager(BaseGamerService baseGamerService) {
        this.baseGamerService = baseGamerService;

    }

    @Override
    public void save(Gamer gamer) {
        baseGamerService.save(gamer);
    }
}
