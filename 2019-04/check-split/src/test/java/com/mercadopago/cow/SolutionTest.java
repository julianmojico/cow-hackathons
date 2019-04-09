package com.mercadopago.cow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SolutionTest {

    @Test
    public void testGetSolution1() {

        int n = 44444444;
        SolutionDTO solution = Solution.getSolution(n);
        int a = solution.getA();
        int b = solution.getB();

        assertEquals(n, a + b);
        assertFalse(String.valueOf(a).contains("4"));
        assertFalse(String.valueOf(b).contains("4"));
    }
}
