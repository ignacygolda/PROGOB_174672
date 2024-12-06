public class Adres implements Adres_interface {
    private String ulica;
    private int numerDomu;
    private int numerMieszkania;
    private String miasto;
    private String kodPocztowy;

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

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        if(ulica!=null) this.ulica = ulica;
        else throw new IllegalArgumentException("Niepoprawne dane");
    }

    public int getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(int numerDomu) {
        if(numerDomu>0) this.numerDomu = numerDomu;
        else throw new IllegalArgumentException("Niepoprawne dane");
    }

    public int getNumerMieszkania() {
        return numerMieszkania;
    }

    public void setNumerMieszkania(int numerMieszkania) {
        if(numerMieszkania>0) this.numerMieszkania = numerMieszkania;
        else throw new IllegalArgumentException("Niepoprawne dane");
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        if(miasto!=null) this.miasto = miasto;
        else throw new IllegalArgumentException("Niepoprawne dane");
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        if(kodPocztowy!=null) this.kodPocztowy = kodPocztowy;
        else throw new IllegalArgumentException("Niepoprawne dane");
    }
}
