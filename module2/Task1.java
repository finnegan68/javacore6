package module2;

import java.util.Arrays;


/**
 * Created by Илья on 30.01.2017.
 */
public class Task1 {
    public static void main(String[] args) {

        int[] intArray = {15, 2, 3, 4, 5, 6, -3, 8, 9, 10};
        double[] doubleArray = {2.23, 3.643, 3, 5, 2.8, 96, 45.3, 1, 43, 2};

        System.out.println("**************FOR INT***************");
        System.out.println("");
        System.out.println("The sum of massive is " + sum(intArray));
        System.out.println("The min of massive is " + min(intArray));
        System.out.println("The max of massive is " + max(intArray));
        System.out.println("The max positive element of massive is " + maxpositive(intArray));
        System.out.println("The multiplication of massive is " + multiplication(intArray));
        System.out.println("The modulus of first and last element of massive is " + modulus(intArray));
        System.out.println("The second largest element of massive is " + secondLargest(intArray));
        System.out.println("");
        System.out.println("**************FOR DOUBLE***************");
        System.out.println("");
        System.out.println("The sum of massive is " + sum(doubleArray));
        System.out.println("The min of massive is " + min(doubleArray));
        System.out.println("The max of massive is " + max(doubleArray));
        System.out.println("The max positive element of massive is " + maxpositive(doubleArray));
        System.out.println("The multiplication of massive is " + multiplication(doubleArray));
        System.out.println("The modulus of first and last element of massive is " + modulus(doubleArray));
        System.out.println("The second largest element of massive is " + secondLargest(doubleArray));
    }
    public static int sum(int array[]){
        int sum = 0;
        for(int element : array){
            sum += element;
        }
        return sum;
    }
    public static int min(int array[]){
        int min = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i+1] < array[i]){
                min = array[i+1];
            }
        }
        return min;
    }
    public static int max(int array[]){
        int max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i+1] > max){
                max = array[i+1];
            }
        }
        return max;
    }
    public static int maxpositive(int array[]){
        int maxPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxPositive){ //Here we don't need "array[i]>0" course we initialize as 0.
                maxPositive = array[i];
            }
        }
        if (maxPositive == 0){
            return Integer.parseInt(null);
        }
        else{
            return maxPositive;
        }

    }
    public static int multiplication(int array[]){
        int mult = array[0];
        //Here we start from second element of massive.Course first is "mult".
        for (int i = 1; i < array.length; i++) {
            mult *= array[i];
        }
        return mult;
    }
    public static int modulus(int array[]){
        int mod = array[0] % array[array.length-1];
        return mod;
    }
    public static int secondLargest(int array[]){
        Arrays.sort(array);
        for (int i = array.length - 1; i > 0 ; i--) {
            if (array[i-1] < array[i]){
                return array[i-1];
            }
        }
        return Integer.parseInt(null);
    }
    public static double sum(double array[]){
        int sum = 0;
        for(double element : array){
            sum += element;
        }
        return sum;
    }
    public static double min(double array[]){
        double min = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i+1] < array[i]){
                min = array[i+1];
            }
        }
        return min;
    }
    public static double max(double array[]){
        double max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i+1] > max){
                max = array[i+1];
            }
        }
        return max;
    }
    public static double maxpositive(double array[]){
        double maxPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxPositive){ //Here we don't need "array[i]>0" course we initialize as 0.
                maxPositive = array[i];
            }
        }
        if (maxPositive == 0){
            return Integer.parseInt(null);
        }
        else{
            return maxPositive;
        }

    }
    public static double multiplication(double array[]){
        double mult = array[0];
        //Here we start from second element of massive.Course first is "mult".
        for (int i = 1; i < array.length; i++) {
            mult *= array[i];
        }
        return mult;
    }
    public static double modulus(double array[]){
        double mod = array[0] % array[array.length-1];
        return mod;
    }
    public static double secondLargest(double array[]){
        Arrays.sort(array);
        for (int i = array.length - 1; i > 0 ; i--) {
            if (array[i-1] < array[i]){
                return array[i-1];
            }
        }
        return Integer.parseInt(null);
    }
}