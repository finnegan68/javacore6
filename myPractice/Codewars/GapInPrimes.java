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
        for(long element : gap(4,100,110)){
            System.out.print(element + " ");
        }
    }

    public static long[] gap(int g, long m, long n) {
        //Catch all gaps
        long[] massOfGaps = new long[0];
        for (long i = m; i <= n; i++) {
            if (isItGap(i)){
                massOfGaps = Arrays.copyOf(massOfGaps, massOfGaps.length + 1);
                massOfGaps[massOfGaps.length - 1] = i;
            }
        }
        for (int i = 0; i < massOfGaps.length - 1; i++) {
            if (massOfGaps[i + 1] - massOfGaps[i] == g){
                long[] answer = {massOfGaps[i], massOfGaps[i + 1]};
                return answer;
            }
        }
        return null;
    }

    //Inspection: gap or not?
    public static boolean isItGap(long x){
        long[] mass = new long[0];
        int count = 0;
        for (long i = 1; i <= x; i++) {
            if (x % i == 0){
                count++;
            }
            else if(count > 2){
                break;
            }
        }
        if (count == 2){
            return true;
        }else {
            return false;
        }
    }
}

