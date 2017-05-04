package module6;


import module2.Task1;

import java.util.Arrays;

public final class ArrayUtils extends Task1{

    static int[] reverse(int[] array){
        if (array == null){
            System.out.println("Array is null");
            return null;
        }
        int[] answ = new int[array.length];
        int count = 0;
        for (int i = array.length - 1; i >= 0 ; i--) {
            answ[count] = array[i];
            count++;
        }
        return answ;
    }

    static int[] findEvenElements(int[] array){
        if (array == null){
            System.out.println("Array is null");
            return null;
        }
        int[] answ = new int[array.length];
        for(int element : array){
            if(element % 2 == 0){
                answ = Arrays.copyOf(answ, answ.length + 1);
                answ[answ.length - 1] = element;
            }
        }
        return answ;
    }


}
