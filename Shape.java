public interface Shape {
    void calculateArea();
    void calculatePerimeter();
}

class Circle implements Shape {
    double radius;
    final double pi = 3.14;
    public Circle (double radius){
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of Circle is: "+pi*(radius*radius));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Circumference of Circle is: "+2*pi*radius);
    }
}

class Square implements Shape {
    double length;
    public Square(double length) {
        this.length = length;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of Square is: "+length*length);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of Square is: "+length*4);
    }
}
