public class CarTester {
    public static void main(String[] args) {
        Car[] cars={new Sedan(25000.00,"black",14.5),new Truck(53500.00,"silver",3000)};
        for(Car c:cars){
            c.calculateSalePrice();
        }
    }
}
