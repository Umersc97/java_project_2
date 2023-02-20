public class ShapeTester {
    public static void main(String[] args) {
        Shape[] shape={new Circle(10.0), new Square(20.0)};
        for(Shape s:shape){
            s.calculateArea();
            s.calculatePerimeter();
        }
    }
}
