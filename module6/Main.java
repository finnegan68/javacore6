package module6;


public class Main{
    public static void main(String[] args) {
        User[] users = new User[4];

        users[0] = new User(123,"Valera", "Varerich", 2000,16342);
        users[1] = new User(124, "Petr","Petrovich", 3000, 19236);
        users[2] = new User(125,"Vasiliy", "Vasilich",2500, 43523);


        System.out.println(UserUtils.uniqueUsers(users));
        System.out.println(UserUtils.paySalaryToUsers(users));
        users = UserUtils.deleteEmptyUsers(users);

        System.out.println(users.length);

    }
}
