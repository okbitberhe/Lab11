package edu.miu.lab;

import edu.miu.lab.service.ArrayFlattenerService;

import java.util.Arrays;

public class ArrayFlattener {

    public int[] flattenArray(final int[][] arr) {
        if (arr == null) return null;

        return Arrays.stream(arr).flatMapToInt(i -> Arrays.stream(i)).toArray();
    }
}
