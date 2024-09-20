package weekly.q01;

public class Test {

    public static void main(String[] args) {
        Product beauty = new Beauty("beauty", 30000, 2);
        Product grocery = new Grocery("grocery", 2000, 3);
        Product largeAppliance = new LargeAppliance("largeAppliance", 500, 5);

        Cart cart = new Cart(new Product[]{beauty, grocery, largeAppliance});
        int totalDeliveryCharge = cart.calculateDeliveryCharge();
        System.out.println(totalDeliveryCharge);    // 결과: 9000
    }

}
