package Adapters;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class GamerCheckAdapter implements GamerCheckService {
    private String id;
    private String firstName;
    private String lastName;
    private String nationaltyID;
    private String dateOfBirth;


    public GamerCheckAdapter(String firstName, String nationaltyID,String dateOfBirth) {
        this.firstName = firstName;
        this.nationaltyID = nationaltyID;
    this.dateOfBirth=dateOfBirth;
    }


    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationaltyID() {
        return nationaltyID;
    }

    public void setNationaltyID(String nationaltyID) {
        this.nationaltyID = nationaltyID;
    }



    @Override
    public boolean loginCheck(Gamer gamer) {
        boolean result = false;

        result =(this.getNationaltyID().equals(gamer.getnationaltyID()) && this.firstName.equals(gamer.getFirstName()) &&
                this.dateOfBirth.equals(gamer.getDateOfBirth()));
        return result;
    }
}

