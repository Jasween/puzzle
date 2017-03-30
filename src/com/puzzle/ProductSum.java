package com.puzzle;

import java.math.BigInteger;

public class ProductSum {


    public BigInteger calculateSumOfProducts(long n, long c) {

        BigInteger productElements = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;
        long firstProductElement = 1;

        for (int i = 1; i <= c; i++) {
            productElements= productElements.multiply(BigInteger.valueOf(i));
            sum = sum.add(productElements);
        }

        for (long i = ++c; i < n; i++) {
            productElements = productElements.divide(BigInteger.valueOf(firstProductElement)).multiply(BigInteger.valueOf(i));
            sum = sum.add(productElements);
            firstProductElement += 1;
        }

        String sumStr = sum.toString();
        sum = sumStr.length() > 10 ? BigInteger.valueOf(Long.valueOf(sumStr.substring(0, 10))) : sum;

        return sum;
    }

}
