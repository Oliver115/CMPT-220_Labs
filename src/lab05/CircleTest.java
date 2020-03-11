package lab05;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    static Circle circle;

    @BeforeAll
    public static void setUp() { circle = new Circle(10); }

    @Test
    public void testGetHeight() { assertEquals(10, circle.getRadius()); }

    @Test
    public void testGetArea() { assertEquals(314.1592653589793, circle.getArea()); }
}
