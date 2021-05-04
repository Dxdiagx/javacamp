package Entities;

public class Campaign {
    private String name;
    private String date;
    private int discount;

    public Campaign(String name, String date, int discount) {
        this.name = name;
        this.date = date;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
