public class Adres {
    String ulica;
    int numerDomu;
    int numerMieszkania;
    String miasto;
    String kodPocztowy;

    public Adres(String ulica,int numerDomu,int numerMieszkania,String miasto,String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
        this.ulica = ulica;
    }

    public Adres(String ulica,int numerDomu,String miasto,String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
        this.numerDomu = numerDomu;
        this.ulica = ulica;
    }
}
