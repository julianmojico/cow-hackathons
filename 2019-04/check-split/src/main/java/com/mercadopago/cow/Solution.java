package com.mercadopago.cow;

public class Solution {
    /**
     * This functions returns a SolutionDTO which resolves the splitting amount (without 4)
     *
     * @return
     */
    public static SolutionDTO getSolution(int n) {


        char[] arrayOfDigits = Character.toChars(n);
        StringBuilder resultA = new StringBuilder();
        StringBuilder resultB = new StringBuilder();

        for (char c : arrayOfDigits) {
            appendA(c, resultA);
            appendB(c, resultB);
        }

        int a = Integer.valueOf(resultA.toString());
        int b = Integer.valueOf(resultB.toString());

        return new SolutionDTO(a, b);

    }

    public static void appendA(char c, StringBuilder resultA) {

        if (c == '4') {
            resultA.append("3");
        } else {
            resultA.append(c);
        }

    }

    public static void appendB(char c, StringBuilder resultB) {

        if (c == '4') {
            resultB.append("1");
        } else {
            resultB.append("0");
        }
    }
}
