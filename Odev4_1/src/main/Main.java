package main;
import Abstract.BaseCustomerService;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.util.Date;
public class Main {

    public static void main(String[] args) {

        //Starbucks Icin Ekleme
        BaseCustomerService customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        // Gercek insan kaydi
        Customer samet = new Customer(1,"Samet","Açar",new Date(2000, 07, 20), "Bu alana TCno Ekleyiniz");
        // Sahte insan kaydi
        Customer fake1 = new Customer(1,"Ali","Ýnsan",new Date(1968, 2, 3), "12345678910");
        customerManager.save(samet);
        customerManager.save(fake1);
        //Nero Icin Ekleme
        BaseCustomerService customerService2 = new NeroCustomerManager();

        Customer fake2 = new Customer(1,"Eda","Tuna",new Date(2000, 10, 27), "12345678910");
        customerService2.save(fake2);
    }

}
