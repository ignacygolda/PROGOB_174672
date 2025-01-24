public class CurrencyConverter implements Converter{
    double euroRate;
    double USDRate;

    public CurrencyConverter() {
        this.euroRate = 5;
        this.USDRate = 4;
    }

    @Override
    public double convertToEuro(double amount) {
        return this.euroRate*amount;
    }

    @Override
    public double convertToUSD(double amount) {
        return this.USDRate*amount;
    }

    @Override
    public double getConversionRate(String currency) {
        if(currency.equals("Euro")) {
            return this.euroRate;
        }
        else if(currency.equals("USD")) {
            return this.USDRate;
        }
        else {
            System.out.println("Wrong currency");
            return 0;
        }
    }
}
