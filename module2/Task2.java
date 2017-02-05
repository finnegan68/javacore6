package module2;


public class Task2 {
    public static void main(String[] args) {

        System.out.println("********TEST1********");
        withdraws(100,10);
        System.out.println("********TEST2********");
        withdraws(100,99);
    }
    public static void withdraws(double balance, double withdrawal){
        double commision = withdrawal * 0.05;
        double newBalance = balance - withdrawal - commision;
        if (newBalance < 0){
            System.out.println("NO");
        }
        else{
            System.out.println("OK " + commision + " " + newBalance);
        }
    }
}
