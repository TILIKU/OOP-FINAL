package finalexam.task1;

public class Circle implements Drawable {

    private double radius;

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter and Setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Implementation of the Draw() method from Drawable interface
    @Override
    public void Draw() {
        // For the purpose of this example, we'll just print a message
        System.out.println("Drawing a circle with radius: " + radius);
    }

    // Overriding the toString() method to provide a string representation of the Circle object
    @Override
    public String toString() {
        return "Circle [Radius=" + radius + ", Area=" + getArea() + ", Circumference=" + getCircumference() + "]";
    }
}