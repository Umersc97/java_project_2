abstract class Car {
    double price;
    String colour;
    Car(double price, String colour){
        this.price = price;
        this.colour = colour;
    }
    abstract double calculateSalePrice();
}

class Sedan extends Car {
    double length;

    public Sedan(double price, String colour, double length) {
        super(price, colour);
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        double spacious;
        double compact;

        if (length > 20) {
            spacious = price - (price * 0.05);
            System.out.println("This "+colour+" Sedan is "+length+"ft long. The original price was $"+price+" but since it is more than 20ft long it is now $"+spacious);
            return spacious;
        } else {
            compact = price - (price * 0.10);
            System.out.println("This "+colour+" Sedan is "+length+"ft long. The original price was $"+price+" but since it is less than 20ft long it is now $"+compact);
            return compact;
        }
    }
}



class Truck extends Car{
    double weight;
    public Truck(double price, String colour, double weight){
        super(price, colour);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        double heavy;
        double light;

        if(weight>2000){
            heavy = price-(price*0.10);
            System.out.println("This "+colour+" Truck weighs "+weight+"kg. The original price was $"+price+" but since it weighs more than 2000kg, it is now $"+heavy);
            return heavy;
        }else{
            light = price-(price*0.20);
            System.out.println("This "+colour+" Truck weighs "+weight+"kg. The original price was $"+price+" but since it weighs less than 2000kg, it is now $"+light);
            return light;
        }
    }
}