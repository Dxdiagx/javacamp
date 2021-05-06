package Odev5_1.business.concrete;

import Odev5_1.business.abstracts.CustomerService;
import Odev5_1.core.abstracts.LogCheckAdaptersService;
import Odev5_1.dataAcces.abstracts.CommerceDao;
import Odev5_1.entities.concrete.Customer;

public class CustomerManager implements CustomerService {
    private LogCheckAdaptersService logCheckAdaptersService;
    private CommerceDao commerceDao;
    private Customer customer;

    public CustomerManager(CommerceDao commerceDao, Customer customer, LogCheckAdaptersService logCheckAdaptersService) {
        this.commerceDao = commerceDao;
        this.customer = customer;
        this.logCheckAdaptersService = logCheckAdaptersService;
    }

    @Override
    public void add(Customer customer) {

           if (logCheckAdaptersService.log(customer)) {
               commerceDao.add(customer);
           }

        }

    @Override
    public void register(Customer customer) {

        if (logCheckAdaptersService.add(customer)){

            commerceDao.add(customer);
        }

    }
}










