package module4;


public class Main {
    public static void main(String[] args) {

        USBank bankOfAmerica = new USBank(1234, "USA", Currency.USD, 100500, 4000, 100, 9300000);
        USBank citigroupInk = new USBank(1294, "USA", Currency.USD, 100555, 3500, 90, 9900000);
        EUBank hsbc = new EUBank(5412, "UK", Currency.EUR, 354352, 3800, 95, 2000000000);
        EUBank deutscheBank = new EUBank(5439, "Germany",Currency.EUR, 87634, 3770, 90, 150000000);
        ChinaBank chinaConstructionBank = new ChinaBank(3456, "China", Currency.EUR, 642342, 5000,80, 700000 );
        ChinaBank chinaCiticBank = new ChinaBank(4398, "China", Currency.USD, 8765643, 4600, 87, 800000000);


    }
}
