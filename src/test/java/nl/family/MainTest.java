package nl.family;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void method1() {

        // arrange
        int x = 10;
        int y = 10;

        // act
        int result = Main.method1(x,y);

        // assert
        assertEquals(x + y, result);
    }
}