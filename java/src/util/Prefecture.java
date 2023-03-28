package util;

public class Prefecture implements Comparable<Prefecture> {
    private int id;
    private String name;
    private String capital;
    private double area;

    public Prefecture(int id, String data) {
        String[] elements = data.split(":");
        this.id = id;
        this.name = elements[0];
        this.capital = elements[1];
        this.area = Double.parseDouble(elements[2]);
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

    @Override
    public int compareTo(Prefecture o) {
        return Double.compare(this.area, o.area);
    }
}
