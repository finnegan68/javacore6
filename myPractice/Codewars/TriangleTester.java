package myPractice.Codewars;

/**
 * Created by Илья on 04.02.2017.
 */
public class TriangleTester {
    public static void main(String[] args) {

    }
    public static boolean isTriangle(int a, int b, int c){
        if((a < b + c) && (b < a + c) && (c < a + b)){
            return true;
        }else{
            return false;
        }
    }
}
