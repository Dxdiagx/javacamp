package Abstract;

import Entities.Gamer;

public abstract class BaseGamerService implements GamerService {

    public void save(Gamer gamer) {
        System.out.println("<----------- " + gamer.getFirstName() + " Veritabanina Kaydedildi ----------->");
    }
}
