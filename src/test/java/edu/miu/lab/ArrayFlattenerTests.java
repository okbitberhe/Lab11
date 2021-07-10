package edu.miu.lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class ArrayFlattenerTests {

    private static ArrayFlattener arrayFlattener;

    @BeforeAll
    static void init() {
        arrayFlattener = new ArrayFlattener();
    }

    @Test
    void testFlattenArrayWithNullArray() {
        Assertions.assertNull(arrayFlattener.flattenArray(null));
    }

    @Test
    void testFlattenArrayWithEmptyArray() {
        Assertions.assertEquals(0, arrayFlattener.flattenArray(new int[0][]).length);
    }

    @Test
    void testFlattenArrayWithNotNullArray() {
        final int[][] arr = {{1,3}, {0}, {4,5,9}};
        final int[] expected = {1, 3, 0, 4, 5, 9};
        Assertions.assertArrayEquals(expected, arrayFlattener.flattenArray(arr));
    }
}
