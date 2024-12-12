public class Osoba {
    private String imie;
    private String nazwisko;
    public Osoba(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if(imie!=null) this.imie = imie;
        else throw new IllegalArgumentException("Niepoprawne dane");
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if(nazwisko!=null) this.nazwisko = nazwisko;
        else throw new IllegalArgumentException("Niepoprawne dane");
    }
}
