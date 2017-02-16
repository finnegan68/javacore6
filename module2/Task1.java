package module2;

import java.util.Arrays;


public class Task1 {
    public static void main(String[] args) {

        int[] intArray = {2,2,2,2,2,2,2,2,0};
        double[] doubleArray = {2.23, 3.643, 3, 5, 2.8, 96, 45.3, 1, 43, 2};

        System.out.println("**************FOR INT***************");
        System.out.println("");
        System.out.print("The sum of array: ");
        sum(intArray);
        System.out.print("The min of array: ");
        min(intArray);
        System.out.print("The max of array: ");
        max(intArray);
        System.out.print("The max positive of array: ");
        maxpositive(intArray);
        System.out.print("The multiplication of array");
        multiplication(intArray);
        System.out.print("The modulus of last and first element: ");
        modulus(intArray);
        System.out.print("The second largest element of array: ");
        secondLargest(intArray);
        System.out.println("");
        System.out.println("**************FOR DOUBLE***************");
        System.out.println("");
        System.out.print("The sum of array: ");
        sum(doubleArray);
        System.out.print("The min of array: ");
        min(doubleArray);
        System.out.print("The max of array: ");
        max(doubleArray);
        System.out.print("The max positive of array: ");
        maxpositive(doubleArray);
        System.out.print("The multiplication of array");
        multiplication(doubleArray);
        System.out.print("The modulus of last and first element: ");
        modulus(doubleArray);
        System.out.print("The second largest element of array: ");
        secondLargest(doubleArray);
    }
    public static void sum(int array[]){
        if (array == null){
            System.out.println("There is no one element in array");
            return;
        }
        int sum = 0;
        for(int element : array){
            sum += element;
        }
        System.out.println(sum);
    }
    public static void min(int array[]){
        if(array == null){
            System.out.println("There is no one element in array");
            return;
        }
        int min = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i+1] < array[i]){
                min = array[i+1];
            }
        }
        System.out.println(min);
    }
    public static void max(int array[]){
        if(array == null){
            System.out.println("There is no one element in array");
            return;
        }
        int max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i+1] > max){
                max = array[i+1];
            }
        }
        System.out.println(max);
    }
    public static void maxpositive(int array[]){
        if(array == null){
            System.out.println("There is no one element in array");
            return;
        }
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
    public static void multiplication(int array[]){
        if (array == null){
            System.out.println("Error. The massive is null!");
            return;
        }else{
            int multiplication = 1;
            for (int i = 0; i < array.length; i++) {
                multiplication = multiplication * array[i];
            }
            System.out.println(multiplication);
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
        if(array == null){
            System.out.println("There is no one element in array");
            return;
        }
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
    public static void sum(double array[]){
        if (array == null){
            System.out.println("There is no one element in array");
            return;
        }
        int sum = 0;
        for(double element : array){
            sum += element;
        }
        System.out.println(sum);
    }
    public static void min(double array[]){
        if (array == null){
            System.out.println("There is no one element in array");
            return;
        }
        double min = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i+1] < array[i]){
                min = array[i+1];
            }
        }
        System.out.println(min);;
    }
    public static void max(double array[]){
        if(array == null){
            System.out.println("There is no one element in array");
            return;
        }
        double max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i+1] > max){
                max = array[i+1];
            }
        }
        System.out.println(max);
    }
    public static void maxpositive(double array[]){
        if(array == null){
            System.out.println("There is no one element in array");
            return;
        }
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
    public static void multiplication(double array[]){
        if (array == null){
            System.out.println("Error. The massive is null!");
            return;
        }else{
            double multiplication = 1;
            for (int i = 0; i < array.length; i++) {
                multiplication = multiplication * array[i];
            }
            System.out.println(multiplication);
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
        if(array == null){
            System.out.println("There is no one element in array");
            return;
        }
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