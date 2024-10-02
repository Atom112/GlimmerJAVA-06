public class Dish implements Order {
    protected String name;
    protected double price;

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
/*----------以下两个方法在子类中进行重写---------------*/
    public void profile() {

    }

    public void cook() {

    }
/*-----------------------------------------------*/
    public boolean check() {
        return Math.random() < 0.5;
    }
}