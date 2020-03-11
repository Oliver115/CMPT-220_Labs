package lab05;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    static Rectangle rectangle;

    @BeforeAll
    public static void setUp() {
        rectangle = new Rectangle(10, 10);
    }

    @Test
    public void testGetHeight() {
        assertEquals(10, rectangle.getHeight());
    }

    @Test
    public void testGetLength() { assertEquals(10, rectangle.getLength()); }

    @Test
    public void testGetArea() { assertEquals(100, rectangle.getArea()); }
}