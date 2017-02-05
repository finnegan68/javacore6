package module2;


public class Task3 {
    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        for (int i = 0; i < balances.length; i++) {
            withdraw(ownerNames[i], 490, balances[i]);
        }
    }
    public static void withdraw(String ownerName, int withdrawal, int balance){
        double commision = withdrawal * 0.05;
        double newBalance = balance - withdrawal - commision;
        if (newBalance < 0){
            System.out.println(ownerName + " NO");
        }
        else{
            System.out.println(ownerName + " " + withdrawal + " " + newBalance);
        }

    }
}

