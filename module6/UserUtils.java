package module6;


import java.util.Arrays;

final public class UserUtils {

    static User[] uniqueUsers(User[] users){
        if(users == null){
            System.out.println("Array is null");
            return null;
        }
        User[] answer = users;
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if(answer[i].equals(answer[j])){
                    answer[j] = null;
                    for (int k = j; k < answer.length - 1; k++) {
                        answer[k] = answer[k + 1];
                    }
                    answer = Arrays.copyOf(answer, answer.length - 1);
                }
            }
        }
        return answer;
    }

    static User[] usersWithContitionalBalance(User[] users, int balance){
        User[] usersWithSuchBalance = new User[0];
        for (User user : users){
            if (user.getBalance() == balance){
                usersWithSuchBalance = Arrays.copyOf(usersWithSuchBalance, usersWithSuchBalance.length + 1);
                usersWithSuchBalance[usersWithSuchBalance.length - 1] = user;
            }
        }
        return usersWithSuchBalance;
    }

    static User[] paySalaryToUsers(User[] users){
        for(User user : users){
            if(user == null){
                continue;
            }
            user.setBalance(user.getBalance() + user.getSalary());
        }
        return users;
    }

    long[] getUsersId(User[] users){
        long[] id = new long[users.length];
        for (int i = 0; i < id.length; i++) {
            id[i] = users[i].getId();
        }
        return id;
    }

    static User[] deleteEmptyUsers(User[] users){
        for (int i = 0; i < users.length; i++) {
            if(users[i] == null){
                int numMoved = users.length - i - 1;
                if (numMoved > 0){
                    System.arraycopy(users, i + 1, users, i, numMoved);
                }
                users = Arrays.copyOf(users, users.length - 1);
            }
        }
        return users;
    }
}
