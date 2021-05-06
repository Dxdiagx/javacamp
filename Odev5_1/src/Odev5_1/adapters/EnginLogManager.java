package Odev5_1.adapters;

import Odev5_1.core.abstracts.LogCheckAdaptersService;
import Odev5_1.entities.concrete.Customer;

public class EnginLogManager implements LogCheckAdaptersService {
   private EnginLogManager enginLogManager;
    @Override
    public boolean log(Customer customer) {
        enginLogManager.log(customer);

        return true;
    }

    @Override
    public boolean add(Customer customer) {
        enginLogManager.add(customer);
        return true;
    }

}
