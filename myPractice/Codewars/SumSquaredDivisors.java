package myPractice.Codewars;

import myPractice.Main;

import java.util.Arrays;


/**
 * Created by Илья on 05.02.2017.
 *
 * Divisors of 42 are : 1, 2, 3, 6, 7, 14, 21, 42. These divisors squared are: 1, 4, 9, 36, 49, 196, 441, 1764.
 * The sum of the squared divisors is 2500 which is 50 * 50, a square!
 * Given two integers m, n (1 <= m <= n) we want to find all integers between m and n whose sum of squared divisors is
 * itself a square. 42 is such a number. The result will be an array of arrays(in C an array of Pair), each subarray
 * having two elements, first the number whose squared divisors is a square and then the sum of the squared divisors.
 */
public class SumSquaredDivisors {
    public static void main(String[] args) {

    }
    public static String listSquared(int start, int finish) {
        //Making mass with divisors
        int[] divisors = new int[0];
        for (int i = 1; i <= start; i++) {
            if (start % i == 0){
                divisors = Arrays.copyOf(divisors, divisors.length + 1);
                divisors[divisors.length - 1] = i;
            }
        }
        int sum = 0;
        for(int element : divisors){
            element = element * element;
            sum += element;
        }
        int squareRoot = Double.valueOf(Math.sqrt(sum)).intValue();
        String lol = "";
        return lol;
    }
}
