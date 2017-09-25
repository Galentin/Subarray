package Subarray;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubarrayTest {
    @Test
    public void maxSubarray() throws Exception {
        int[] a = new int[] {2, -4, 3, 5, 2, -7, 1};
        int[] b = new int[] {2, 4};

        int[] a2 = new int[] {2, -4, -3, -5, -2, -7, -1};
        int[] b2 = new int[] {0};

        int[] a3 = new int[] {2, 1, 4, 6, 8, 7, 1};
        int[] b3 = new int[] {0, 6};

        int[] a4 = new int[] {-2, -1, -4, -6, -8, -7, -1};
        int[] b4 = new int[] {};
        Subarray mas = new Subarray();
        assertArrayEquals(b, mas.maxSubarray(a));
        assertArrayEquals(b2, mas.maxSubarray(a2));
        assertArrayEquals(b3, mas.maxSubarray(a3));
        assertArrayEquals(b4, mas.maxSubarray(a4));
    }

}