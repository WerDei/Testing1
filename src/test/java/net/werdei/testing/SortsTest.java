package net.werdei.testing;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortsTest
{
    @Test
    public void bucketSortTest()
    {
        int[] a1 = new int[]{2, 15, 6, 7, 11, 9, 9, 1, 7};
        assertTrue(isSorted(Sorts.bucketSort(a1)), "Bucket sort - average case");

        int[] a2 = new int[]{6, 1, 5, 2, 4, 7, 8, 3};
        assertTrue(isSorted(Sorts.bucketSort(a2)), "Bucket sort - best case");

        int[] a3 = new int[]{13, 15, 13, 5, 13, 13, 13, 13, 13};
        assertTrue(isSorted(Sorts.bucketSort(a3)), "Bucket sort - worst case");
    }


    private static boolean isSorted(int[] array)
    {
        int prevValue = Integer.MIN_VALUE;
        for (int value : array) {
            if (value < prevValue) return false;
            prevValue = value;
        }
        return true;
    }


}
