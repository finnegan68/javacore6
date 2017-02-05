package myPractice.Codewars;

/**
 * Created by Илья on 05.02.2017.
 *
 * Divisors of 42 are : 1, 2, 3, 6, 7, 14, 21, 42. These divisors squared are: 1, 4, 9, 36, 49, 196, 441, 1764.
 * The sum of the squared divisors is 2500 which is 50 * 50, a square!
 * Given two integers m, n (1 <= m <= n) we want to find all integers between m and n whose sum of squared divisors is
 * itself a square. 42 is such a number.
 */
public class SumSquaredDivisors {
    public static void main(String[] args) {
        listSquared(40,1000);
    }
    public static void listSquared(int start, int finish) {
        for (int i = start; i <= finish; i++) {
            if (isItSquareOfSomeNum(sumAndPowAllDivisors(i))){
                System.out.println("(" + i + ", " + sumAndPowAllDivisors(i) + ") ");
            }
        }
    }

    public static int sumAndPowAllDivisors(int number){
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0){
                sum += i * i;
            }
        }
        return sum;
    }
    public static boolean isItSquareOfSomeNum(int number){
        int squareRoot = Double.valueOf(Math.sqrt(number)).intValue();
        if (squareRoot * squareRoot == number){
            return true;
        }
        return false;
    }
}
