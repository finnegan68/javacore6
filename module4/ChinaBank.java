package module4;


public class ChinaBank extends Bank{

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if(currency ==Currency.USD){
            return 100;
        }else if(currency == Currency.EUR){
            return 150;
        }else {
            return 0;
        }
    }

    @Override
    int getLimitOfFunding() {
        if(currency == Currency.EUR){
            return 5000;
        }else if(currency == Currency.USD){
            return 10000;
        }
        return 0;
    }

    @Override
    double getMonthlyRate() {
        if(currency == Currency.USD){
            return 0.01;
        }return 0;
    }

    @Override
    double getCommission(int summ) {
        if(this.currency == Currency.USD && summ < 1000){
            return 0.03;
        }
        else if(this.currency == Currency.USD && summ > 1000){
            return 0.05;
        }
        else if(this.currency == Currency.EUR && summ < 1000){
            return 0.1;
        }
        else if(this.currency == Currency.EUR && summ > 1000){
            return 0.11;
        }
        return 0;
    }
}
