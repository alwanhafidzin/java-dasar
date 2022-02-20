package test;

public class Customer {
    private String name;
    private int points;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Customer(String s, int i) {
        this.name = s;
        this.points = i;
    }
    //Constructor and standard getters
}