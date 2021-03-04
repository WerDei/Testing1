package net.werdei.testing;

public class Sorts
{
    public static int[] bucketSort(int[] unsorted)
    {
        int maxValue = 0;
        for (int value : unsorted) {
            maxValue = Math.max(maxValue, value);
        }
        return bucketSort(unsorted, maxValue);
    }

    public static int[] bucketSort(int[] unsorted, int maxValue)
    {
        int[] bucket = new int[maxValue + 1];
        int[] sorted = new int[unsorted.length];

        for (int value : unsorted) bucket[value]++;

        int pos = 0;
        for (int i = 0; i < bucket.length; i++)
            for (int j = 0; j < bucket[i]; j++)
                sorted[pos++] = i;

        return sorted;
    }
}
