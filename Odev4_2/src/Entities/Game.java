package Entities;

public class Game {
    private String id;
    private String Name;
    private int price;

    public Game(String id, String name, int price) {
        this.id = id;
        this.Name = name;
        this.price = price;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
