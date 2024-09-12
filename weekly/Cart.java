package weekly;

public class Cart {

    private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    int calculateDeliveryCharge() {
        int deliveryCharge = 0;
        int totalWeight = 0;
        int totalPrice = 0;

        for (Product p : products) {
            totalPrice += p.getPrice() - p.getDiscountAmount();
            totalWeight += p.getWeight();
        }

        System.out.println("totalPrice: " + totalPrice);
        System.out.println("totalWeight: " + totalWeight);

        if (totalWeight < 3) {
            deliveryCharge = 1000;
        } else if (totalWeight < 10) {
            deliveryCharge = 5000;
        } else {
            deliveryCharge = 10000;
        }

        System.out.println("deliveryCharge: " + deliveryCharge);

        if (totalPrice >= 100000) {
            deliveryCharge = 0;
        } else if (totalPrice >= 30000) {
            deliveryCharge -= 1000;
        }

        System.out.println("deliveryCharge: " + deliveryCharge);

        return deliveryCharge;
    }
}
