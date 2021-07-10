package edu.miu.lab;

import edu.miu.lab.service.ArrayFlattenerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class ArrayReversorTests {

    @Mock
    private ArrayFlattenerService arrayFlattenerService;

    @InjectMocks
    private ArrayReversor arrayReversor;

    @Test
    void testReverseArrayWithNullArray() {
        Assertions.assertNull(arrayReversor.reverseArray(null));
    }

    @Test
    void testReverseArrayWithEmptyArray() {
        Mockito.when(arrayFlattenerService.flattenArray(ArgumentMatchers.any())).thenReturn(new int[0]);
        Assertions.assertEquals(0, arrayReversor.reverseArray(new int[0][]).length);
    }

    @Test
    void testReverseArrayWithNotNullArray() {
        final int[][] arr = {{1,3}, {0}, {4,5,9}};
        final int[] expected = {9, 5, 4, 0, 3, 1};
        Mockito.when(arrayFlattenerService.flattenArray(ArgumentMatchers.any())).thenReturn(new int[]{1, 3, 0, 4, 5, 9});
        Assertions.assertArrayEquals(expected, arrayReversor.reverseArray(arr));
    }
}
