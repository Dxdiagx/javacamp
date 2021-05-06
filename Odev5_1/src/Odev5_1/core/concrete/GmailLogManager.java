package Odev5_1.core.concrete;

import Odev5_1.gmailLogger.GmailLogger;
import Odev5_1.core.abstracts.LogCheckAdaptersService;
import Odev5_1.entities.concrete.Customer;

public class GmailLogManager implements LogCheckAdaptersService {


    @Override
    public boolean log(Customer customer) {
        return true;

    }

    @Override
    public boolean add(Customer customer) {
        GmailLogger gmailLogger =new GmailLogger(customer);
        gmailLogger.add(customer);
return true;
    }


}
