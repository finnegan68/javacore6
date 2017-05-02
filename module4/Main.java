package module4;


public class Main {
    public static void main(String[] args) {
        Bank[] all_banks = new Bank[6];

        USBank bankOfAmerica = new USBank(1234, "USA", Currency.USD, 100500, 4000, 100, 9300000);
        USBank citigroupInk = new USBank(1294, "USA", Currency.USD, 100555, 3500, 90, 9900000);
        EUBank hsbc = new EUBank(5412, "UK", Currency.EUR, 354352, 3800, 95, 2000000000);
        EUBank deutscheBank = new EUBank(5439, "Germany",Currency.EUR, 87634, 3770, 90, 150000000);
        ChinaBank chinaConstructionBank = new ChinaBank(3456, "China", Currency.EUR, 642342, 5000,80, 700000 );
        ChinaBank chinaCiticBank = new ChinaBank(4398, "China", Currency.USD, 8765643, 4600, 87, 800000000);

        all_banks[0] = bankOfAmerica;
        all_banks[1] = citigroupInk;
        all_banks[2] = hsbc;
        all_banks[3] = deutscheBank;
        all_banks[4] = chinaCiticBank;
        all_banks[5] = chinaConstructionBank;

        System.out.println(bankOfAmerica.getLimitOfFunding());
        System.out.println(bankOfAmerica.getCommission(300));
        System.out.println(bankOfAmerica.getLimitOfWithdrawal());
        System.out.println(bankOfAmerica.getMonthlyRate());

        System.out.println(citigroupInk.getLimitOfFunding());
        System.out.println(citigroupInk.getCommission(400));
        System.out.println(citigroupInk.getLimitOfWithdrawal());
        System.out.println(citigroupInk.getMonthlyRate());

        System.out.println(hsbc.getLimitOfFunding());
        System.out.println(hsbc.getCommission(350));
        System.out.println(hsbc.getLimitOfWithdrawal());
        System.out.println(hsbc.getMonthlyRate());

        System.out.println(deutscheBank.getLimitOfFunding());
        System.out.println(deutscheBank.getCommission(390));
        System.out.println(deutscheBank.getLimitOfWithdrawal());
        System.out.println(deutscheBank.getMonthlyRate());

        System.out.println(chinaCiticBank.getLimitOfFunding());
        System.out.println(chinaCiticBank.getCommission(200));
        System.out.println(chinaCiticBank.getLimitOfWithdrawal());
        System.out.println(chinaCiticBank.getMonthlyRate());

        System.out.println(chinaConstructionBank.getLimitOfFunding());
        System.out.println(chinaConstructionBank.getCommission(500));
        System.out.println(chinaConstructionBank.getLimitOfWithdrawal());
        System.out.println(chinaConstructionBank.getMonthlyRate());

        System.out.println("");

        for(Bank bank : all_banks){
            System.out.println("Country: " + bank.getBankCountry());
            System.out.println("Number of employments: " + bank.getNumberOfEmployees());
            System.out.println("Total capital: " + bank.getTotalCapital());
            System.out.println("");
        }
    }
}
