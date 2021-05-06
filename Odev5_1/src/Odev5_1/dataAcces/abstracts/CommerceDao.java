package Odev5_1.dataAcces.abstracts;

import Odev5_1.entities.concrete.Customer;

public interface CommerceDao {
    void add(Customer customer);
    void delete(Customer customer);
    void update(Customer customer);
    void register(Customer customer);

}
