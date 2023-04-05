// 課題1-29
package info;

public class Prefecture {
    private int id;
    private String name;
    private String capital;
    private double area;

    public Prefecture(int id, String name, String capital, double area) {
        this.id = id;
        this.name = name;
        this.capital = capital;
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public double getArea() {
        return area;
    }
}
