package Odev5_1;

import Odev5_1.adapters.EnginLogCheckAdapter;
import Odev5_1.business.abstracts.CustomerService;
import Odev5_1.business.concrete.CustomerManager;
import Odev5_1.core.abstracts.LogCheckAdaptersService;
import Odev5_1.dataAcces.concrete.EnginCommerceDao;
import Odev5_1.entities.concrete.Customer;

public class Main {

    public static void main(String[] args) {
        Customer realCustomer = new Customer("Samet", "Acar",
                "acaarsamet@gmail.com", "123456");
        Customer fakeCustomer = new Customer("Engin", "Demirog",
                "engindemirog@gmail.com", "123456");

        CustomerService service=new CustomerManager(new EnginCommerceDao(),
                realCustomer, new EnginLogCheckAdapter(realCustomer));
          service.add(realCustomer);
        service.register(fakeCustomer);

        //Farklı Çıktılar Almak İçin Referansları Değiştirebilirsiniz.
        //via SAMET ACAR
    }
}
