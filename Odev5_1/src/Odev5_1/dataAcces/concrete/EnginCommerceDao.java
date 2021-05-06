package Odev5_1.dataAcces.concrete;

import Odev5_1.dataAcces.abstracts.CommerceDao;
import Odev5_1.entities.concrete.Customer;

public class EnginCommerceDao implements CommerceDao {

    @Override
    public void add(Customer customer) {
        System.out.println("Engin Ticarete Hoşgeldiniz");

    }


    @Override
    public void delete(Customer customer) {

    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void register(Customer customer) {

    }
}
