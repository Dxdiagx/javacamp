package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import tr.tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

import java.rmi.RemoteException;

public class MernisServiceAdapter implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        KPSPublicSoap client = (KPSPublicSoap) new KPSPublicSoapProxy();
        boolean result = false;
        try {
            result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityID()),customer.getFirstName(),customer.getLastName(), customer.getDateOfBirth().getYear());
        }
        catch (NumberFormatException e){
            e.printStackTrace();
        }
        catch(RemoteException e) {
            e.printStackTrace();
        }
        return result;
    }
}
