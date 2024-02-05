package ru.gavrilov.basic.homework.lesson30.tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.gavrilov.basic.homework.lesson30.Main;

public class MainMethodsTest {
    Main main = new Main();

    @Test
    public void copyArrayTest() {
        Assertions.assertArrayEquals(new int[]{5, 6, 7}, main.copyArr(new int[]{1, 3, 51, 1, 5, 6, 7}));
    }

    @Test(expected = RuntimeException.class)
    public void copyArrayExceptionTest() {
        main.copyArr(new int[]{2,2,2,2});
    }

    @Test
    public void validArrayTest() {
        Assertions.assertTrue(main.validArray(new int[]{1, 2, 2, 1}));
        Assertions.assertFalse(main.validArray(new int[]{1, 1}));
        Assertions.assertFalse(main.validArray(new int[]{2, 3}));
        Assertions.assertFalse(main.validArray(new int[]{4, 3}));
    }
}
