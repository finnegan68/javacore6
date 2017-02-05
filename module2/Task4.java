package module2;


public class Task4 {
    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        for (int i = 0; i < balances.length; i++) {
            fund(ownerNames[i], 490, balances[i]);
        }
    }
    public static void fund(String ownerName, double withdrawal, double balance){
        double newBalance = withdrawal + balance;
        System.out.println(ownerName + " " + newBalance);
    }
}
