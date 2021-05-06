package Odev5_1.adapters;

import Odev5_1.core.abstracts.LogCheckAdaptersService;
import Odev5_1.entities.concrete.Customer;

import java.util.Random;
import java.util.Scanner;

public class EnginLogCheckAdapter implements LogCheckAdaptersService {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    private Customer customer;
    EmailValidator emailValidator = new EmailValidator();

    public EnginLogCheckAdapter(Customer customer) {
        this.customer = customer;
    }


    @Override
    public boolean log(Customer customer) {

        if (this.customer.getPassword().equals(customer.getPassword()) &&
                this.customer.getEmail().equals(customer.getEmail())) {
            System.out.println("Giriş Başarılı...");
            return true;
        } else {
            System.out.println("Giriş Başarısız...");

            return false;
        }
    }

    @Override
    public boolean add(Customer customer) {
        if (emailValidator.isValid(customer.getEmail())
                && customer.getPassword().length() >= 6 &&
                this.customer.getEmail() != customer.getEmail()) {

            System.out.println("Lütfen Email Adresinize Giden Kodu Tuşlayınız : ");

            int realCode = (int) (100 * Math.random() * 1000);

            System.out.println("Gönderilen Kod : " + realCode);

            int scannerCode = scanner.nextInt();

            if (scannerCode == realCode) {

                System.out.println("Tebrikler! Kayıt Başarıyla oluşturuldu " + customer.getFirstName());
            } else {

                System.out.println("Kayıt Başarısız...");
                return false;
            }

        } else {
            System.out.println("Kayıt Başarısız...");
            return false;
        }
        return false;
    }

}
