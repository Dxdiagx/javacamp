package Concrete;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements GamerCheckService {
    public GamerCheckManager() {
    }

    public boolean loginCheck(Gamer gamer) {
        return true;
    }
}
