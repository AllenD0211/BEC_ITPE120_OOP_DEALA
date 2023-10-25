
public class enumswithmethod{

  
    enum Shape {
        CIRCLE(3.0), SQUARE(5.0), TRIANGLE(4.0, 3.0, 5.0);

        private double[] dimensions;

        
        Shape(double... dimensions) {
            this.dimensions = dimensions;
        }

        public double calculateArea() {
            switch (this) {
                case CIRCLE:
                    double radius = dimensions[0];
                    return Math.PI * radius * radius;
                case SQUARE:
                    double side = dimensions[0];
                    return side * side;
                case TRIANGLE:
                    double a = dimensions[0];
                    double b = dimensions[1];
                    double c = dimensions[2];
                    double s = (a + b + c) / 2;
                    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
                default:
                    return 0.0;
            }
        }

        public double calculatePerimeter() {
            switch (this) {
                case CIRCLE:
                    double radius = dimensions[0];
                    return 2 * Math.PI * radius;
                case SQUARE:
                    double side = dimensions[0];
                    return 4 * side;
                case TRIANGLE:
                    double a = dimensions[0];
                    double b = dimensions[1];
                    double c = dimensions[2];
                    return a + b + c;
                default:
                    return 0.0;
            }
        }
    }

    public static void main(String[] args) {
        for (Shape shape : Shape.values()) {
            System.out.println("Shape: " + shape);
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println();
        }
    }
}


