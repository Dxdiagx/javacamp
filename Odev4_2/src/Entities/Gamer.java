package Entities;

public class Gamer {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private int wallet;
    private String password;
    private String nationaltyID;
    private String dateOfBirth;

    public Gamer(String id, String firstName, String lastName, String email, int wallet, String password, String nationaltyID, String dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.wallet = wallet;
        this.password = password;
        this.nationaltyID = nationaltyID;
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getnationaltyID() {
        return this.nationaltyID;
    }

    public void setnationaltyID(String nationaltyID) {
        this.nationaltyID = nationaltyID;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getWallet() {
        return this.wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }
}

