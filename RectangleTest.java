class Rectangle {
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Set method for length
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            System.out.println("Length must be between 0.0 and 20.0");
        }
    }

    // Get method for length
    public double getLength() {
        return length;
    }

    // Set method for width
    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            System.out.println("Width must be between 0.0 and 20.0");
        }
    }

    // Get method for width
    public double getWidth() {
        return width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }
}

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        // Test default values
        System.out.println("Default Length: " + rectangle.getLength());
        System.out.println("Default Width: " + rectangle.getWidth());
        System.out.println("Default Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Default Area: " + rectangle.calculateArea());

        // Set new values
        rectangle.setLength(5.0);
        rectangle.setWidth(10.0);

        // Test new values
        System.out.println("Updated Length: " + rectangle.getLength());
        System.out.println("Updated Width: " + rectangle.getWidth());
        System.out.println("Updated Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Updated Area: " + rectangle.calculateArea());

        // Test validation
        rectangle.setLength(25.0); // Should trigger validation message
        rectangle.setWidth(-5.0);   // Should trigger validation message
    }
}



