package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface GameService {

void add(Game game);
void delete(Game game);
void saleGame(Game game, Gamer gamer, Campaign campaign);
}
