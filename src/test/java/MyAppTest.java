import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MyAppTest {
    @Test
    public void testAddition() {
        int result = add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        int result = subtract(5, 2);
        assertEquals(3, result);
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }
}
