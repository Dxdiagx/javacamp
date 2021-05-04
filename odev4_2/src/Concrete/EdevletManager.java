package Concrete;

import Abstract.BaseGamerService;
import Abstract.GamerCheckService;
import Adapters.GamerCheckAdapter;
import Entities.Gamer;

public class EdevletManager extends BaseGamerService {

    private GamerCheckService gamerCheckService ;

    public EdevletManager(GamerCheckService gamerCheckService) {

        this.gamerCheckService = gamerCheckService;

    }
    public void save(Gamer gamer) {


            if (gamerCheckService.loginCheck(gamer)) {
                System.out.println(gamer.getFirstName() + " Adlı kişiye Mernis Kontrolü Yapıldı...");

            } else {
                System.out.println(gamer.getFirstName() + " Adlı kişi mevcut degil...");
                System.exit(0);
            }

        }
    }


