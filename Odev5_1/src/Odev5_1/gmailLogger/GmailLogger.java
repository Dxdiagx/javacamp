package Odev5_1.gmailLogger;

import Odev5_1.adapters.EmailValidator;
import Odev5_1.entities.concrete.Customer;

import java.util.Scanner;

public class GmailLogger {
    private Customer customer;
    private EmailValidator emailValidator=new EmailValidator();
     Scanner scanner=new Scanner(System.in);
    public GmailLogger(Customer customer) {
        this.customer = customer;
    }

    public void add(Customer customer) {

        if (emailValidator.isValid(customer.getEmail()) && customer.getPassword().length() >= 6) {
            System.out.println("Lütfen Email Adresinize Giden Kodu Tuşlayınız : ");
            int realCode = (int) (100 * Math.random() * 1000);
            System.out.println("Gönderilen Kod : " + realCode);
            int scannerCode = scanner.nextInt();


            if (scannerCode == realCode) {
                System.out.println("Tebrikler! Gmail adresiniz ile Kayıt Başarıyla oluşturuldu " + customer.getFirstName());

            }
            else {
                System.out.println("Kayıt Başarısız...");

            }
        }

    }
}





