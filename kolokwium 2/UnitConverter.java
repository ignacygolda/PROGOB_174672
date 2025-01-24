public class UnitConverter implements Converter{
    @Override
    public double convertToEuro(double amount) {
        return 5*amount;
    }

    @Override
    public double convertToUSD(double amount) {
        return 4*amount;
    }

    @Override
    public double getConversionRate(String currency) {
        if(currency.equals("Euro")) {
            return 5;
        }
        else if(currency.equals("USD")) {
            return 4;
        }
        else {
            return 0;
        }
    }
}
