package edu.miu.lab;

import edu.miu.lab.service.ArrayFlattenerService;

import java.util.stream.IntStream;


public class ArrayReversor {

    private ArrayFlattenerService arrayFlattenerService;

    public ArrayReversor(ArrayFlattenerService arrayFlattenerService) {
        this.arrayFlattenerService = arrayFlattenerService;
    }

    public int[] reverseArray(final int[][] arr) {
        if (arr == null) return null;

        final int[] result = arrayFlattenerService.flattenArray(arr);
        return IntStream.range(0, result.length).map(i -> result[result.length - 1 - i]).toArray();
    }
}
