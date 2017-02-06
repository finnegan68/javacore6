package module2;

import java.util.Arrays;



public class Task1 {
    public static void main(String[] args) {

        int[] intArray = {2,2,2,2,2,2,2,2,0};
        double[] doubleArray = {2.23, 3.643, 3, 5, 2.8, 96, 45.3, 1, 43, 2};

        System.out.println("**************FOR INT***************");
        System.out.println("");
        System.out.println("The sum of massive is " + sum(intArray));
        System.out.println("The min of massive is " + min(intArray));
        System.out.println("The max of massive is " + max(intArray));
        maxpositive(intArray);
        System.out.println("The multiplication of massive is " + multiplication(intArray));
        modulus(intArray);
        secondLargest(intArray);
        System.out.println("");
        System.out.println("**************FOR DOUBLE***************");
        System.out.println("");
        System.out.println("The sum of massive is " + sum(doubleArray));
        System.out.println("The min of massive is " + min(doubleArray));
        System.out.println("The max of massive is " + max(doubleArray));
        maxpositive(doubleArray);
        System.out.println("The multiplication of massive is " + multiplication(doubleArray));
        modulus(doubleArray);
        secondLargest(doubleArray);
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
    public static void maxpositive(int array[]){
        int maxPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxPositive){ //Here we don't need "array[i]>0" course we initialize as 0.
                maxPositive = array[i];
            }
        }
        if (maxPositive == 0){
            System.out.println("There is no one positive number in massive");
        }
        else{
            System.out.println("The max positive element of massive is " + maxPositive);
        }

    }
    public static int multiplication(int array[]){
        if (array == null){
            System.out.println("Error. The massive is null!");
            return 0;
        }else{
            int multiplication = 1;
            for (int i = 0; i < array.length; i++) {
                multiplication = multiplication * array[i];
            }
            return multiplication;
        }
    }
    public static void modulus(int array[]){
        try{
            int mod = array[0] % array[array.length-1];
            System.out.println("The modulus is " + mod);
        }catch (ArithmeticException e){
            System.out.println("Error! Division by zero.");
        }
    }
    public static void secondLargest(int array[]){
        Arrays.sort(array);
        int count = 0; // Make inspection here.May be all elements in massive are the same.
        for (int j = 0; j < array.length - 1; j++) {
            if (array[j] == array[j+1]){
                count += 1;}
            else{
                break;}
        }
        if (count == array.length - 1){
            System.out.println("No second largest in this massive");
            return;
        }

        for (int i = array.length - 1; i > 0 ; i--) {
            if (array[i-1] < array[i]){
                System.out.println("The second largest element of massive is " + array[i-1]);
                break;
            }
        }


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
    public static void maxpositive(double array[]){
        double maxPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxPositive){ //Here we don't need "array[i]>0" course we initialize as 0.
                maxPositive = array[i];
            }
        }
        if (maxPositive == 0){
            System.out.println("There is no one positive number in massive");
        }
        else{
            System.out.println("The max positive element of massive is " + maxPositive);
        }

    }
    public static double multiplication(double array[]){
        if (array == null){
            System.out.println("Error. The massive is null!");
            return 0;
        }else{
            double multiplication = 1;
            for (int i = 0; i < array.length; i++) {
                multiplication = multiplication * array[i];
            }
            return multiplication;
        }
    }
    public static void modulus(double array[]){
        try{
            double mod = array[0] % array[array.length-1];
            System.out.println("The modulus is " + mod);
        }catch (ArithmeticException e){
            System.out.println("Error! Division by zero.");
        }
    }
    public static void secondLargest(double array[]){
        Arrays.sort(array);
        int count = 0; // Make inspection here.May be all elements in massive are the same.
        for (int j = 0; j < array.length - 1; j++) {
            if (array[j] == array[j+1]){
                count += 1;}
            else{
                break;}
        }
        if (count == array.length - 1) {
            System.out.println("There is no second largest element in this massive.");
            return;
        }
        for (int i = array.length - 1; i > 0 ; i--) {
            if (array[i-1] < array[i]){
                System.out.println("The second largest element of massive is " + array[i-1]);
                break;
            }
        }

    }
}