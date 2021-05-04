package Abstract;
import Entities.Gamer;

public abstract class BaseGamerService implements GamerService{

    @Override
    public void save(Gamer gamer) {
        System.out.println("<----------- "+gamer.getFirstName() + " Veritabanina Kaydedildi ----------->");
    }
}

