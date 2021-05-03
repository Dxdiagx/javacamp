package Abstract;

import Entities.Customer;

public abstract class BaseCustomerService implements CustomerService{

    @Override
    public void save(Customer customer) {
        System.out.println("<----------- "+customer.getFirstName() + " Veritabanina Kaydedildi ----------->");
    }


}
