package weekly.q01;

public class Product implements Promotion {

    private String name;
    private int price;
    private int weight;

    Product(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public int getDiscountAmount() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }
}
