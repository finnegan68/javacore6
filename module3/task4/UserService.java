package module3.task4;


public class UserService {

    public void paySalary(User user){
        user.setBalance(user.getBalance() + user.getSalary());
    }

    public void withdraw(int summ, User user){
        if (summ < 1000){
            user.setBalance(user.getBalance() - summ * 1.05);
        }else {
            user.setBalance(user.getBalance() - summ * 1.1);
        }
    }
    public int companyNameLenght(User user){
        return user.getCompanyName().length();
    }
    public void  monthIncreaser(int addMonth, User user){
        user.setMonthsOfEmployment(user.getMonthsOfEmployment() + addMonth);
    }
}
