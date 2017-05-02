package module4;


public class USBank extends Bank{

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if(currency == Currency.USD){
            return 1000;
        }else if(currency == Currency.EUR){
            return 1200;
        }else {
            return 0;
        }
    }

    @Override
    int getLimitOfFunding() {
        if(currency == Currency.EUR){
            return 10000;
        }else {
            return 0;
        }
    }

    @Override
    double getMonthlyRate() {
        if(currency == Currency.USD){
            return 0.01;
        }else if(currency == Currency.EUR){
            return 0.02;
        }else {
            return 0;
        }
    }

    @Override
    double getCommission(int summ) {
        if(this.currency == Currency.USD && summ < 1000){
            return 0.05;
        }
        else if(this.currency == Currency.USD && summ > 1000){
            return 0.07;
        }
        else if(this.currency == Currency.EUR && summ < 1000){
            return 0.06;
        }
        else if(this.currency == Currency.EUR && summ > 1000){
            return 0.08;
        }
        return 0;
    }
}
