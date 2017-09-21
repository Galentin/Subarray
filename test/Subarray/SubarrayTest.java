package Subarray;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubarrayTest {
    @Test
    public void maxSubarray() throws Exception {
        int[] a = new int[] {2,-4, 3, 5, 2, -7,1};
        int[] b = new int[] {1,4};

        int[] a2 = new int[] {2,-4, -3, -5, -2, -7,-1};
        int[] b2 = new int[] {0};
        Subarray mas = new Subarray();
        assertArrayEquals(b, mas.maxSubarray(a));
        assertArrayEquals(b2, mas.maxSubarray(a2));
    }

}