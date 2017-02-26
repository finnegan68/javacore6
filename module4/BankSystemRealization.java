package module4;


public class BankSystemRealization implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        if(user.balance < amount){
            System.out.println("User has not so much money");
            return;
        }
        System.out.println("Give me your money in sum of " + amount);
        user.balance = user.balance - amount;
    }

    @Override
    public void fundUser(User user, int amount) {
        System.out.println("Take this man: " + amount);
        user.balance = user.balance + amount;
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if(fromUser.balance < amount){
            System.out.println("First user has not so much money");
            return;
        }
        fromUser.balance -= amount;
        toUser.balance += amount;
    }

    @Override
    public void paySalary(User user) {
        user.balance += user.salary;
    }
}
