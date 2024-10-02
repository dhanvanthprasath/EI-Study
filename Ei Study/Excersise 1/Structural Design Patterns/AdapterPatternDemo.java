// Existing class
class LegacyRectangle {
    public void draw(int x, int y, int width, int height) {
        System.out.println("Drawing rectangle at (" + x + ", " + y + ") with width " + width + " and height " + height);
    }
}

// Target interface
interface Shape {
    void draw();
}

// Adapter class
class RectangleAdapter implements Shape {
    private LegacyRectangle legacyRectangle;

    public RectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }

    @Override
    public void draw() {
        legacyRectangle.draw(0, 0, 10, 20);  // Example hardcoded parameters
    }
}

// Use Case
public class AdapterPatternDemo {
    public static void main(String[] args) {
        LegacyRectangle legacyRectangle = new LegacyRectangle();
        Shape rectangleAdapter = new RectangleAdapter(legacyRectangle);
        rectangleAdapter.draw();  // Output: Drawing rectangle at (0, 0) with width 10 and height 20
    }
}
