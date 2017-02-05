package myPractice.Codewars;

import java.util.Arrays;

/**
 * Created by Илья on 04.02.2017.
 *
 * In the example above gap(2, 3, 50) will return [3, 5] or (3, 5) or {3, 5} which is the first
 * pair between 3 and 50 with a 2-gap.So this function should return the first pair of two prime numbers spaced with
 * a gap of g between the limits m, n if these numbers exist otherwise nil or null or None or Nothing (depending on the
 * language). In C++ return in such a case {0, 0}.
 */
public class GapInPrimes {

    public static void main(String[] args) {
        for(long element : gap(10,300,400)){
            System.out.print(element + " ");
        }
    }

    public static long[] gap(int g, long m, long n) {
        //Catch all gaps
        long tmp = 0;
        int count = 0;
        for (long i = m; i <= n; i++) {
            if(isItPrime(i) && count > 0 &&(i - tmp == g)){
                long[] answer = {tmp, i};
                return answer;
            }
            else if (isItPrime(i) && count == 0){
                tmp = i;
                count++;
            }
        }
        return null;
    }

    //Inspection: simple or not?
    public static boolean isItPrime(long x){
        for (long i = 2; i < Math.sqrt(x); i++) {
            if((x % i) == 0){
                return false;
            }
        }return true;
    }
}

