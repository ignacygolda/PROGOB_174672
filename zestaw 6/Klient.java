import java.util.List;
import java.util.Objects;

public class Klient {
    private String imie;
    private String nazwisko;
    private Adres adres;
    private List<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko, Adres adres, List<Zamowienie> listaZamowien) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.listaZamowien = listaZamowien;
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

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        if(adres!=null) this.adres = adres;
        else throw new IllegalArgumentException("Niepoprawne dane");
    }

    public List<Zamowienie> getListaZamowien() {
        return listaZamowien;
    }

    public void setListaZamowien(List<Zamowienie> listaZamowien) {
        if(listaZamowien!=null) this.listaZamowien = listaZamowien;
        else throw new IllegalArgumentException("Niepoprawne dane");
    }

    void dodajZamowienie(Zamowienie zamowienie) {
        listaZamowien.add(zamowienie);
    }

    @Override
    public String toString() {
        String out = "";
        for(Zamowienie e : listaZamowien) {
            out+=e.toString()+"\n";
        }
        return out;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Klient klient = (Klient) obj;
        if(this.imie.equals(klient.getImie()) && this.nazwisko.equals(klient.getNazwisko()) && this.adres.equals(klient.getAdres()) && this.listaZamowien.equals(klient.getListaZamowien())) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, adres, listaZamowien);
    }

    void wyswietlHistorieZamowien() {
        for(Zamowienie e : listaZamowien) {
            e.wyswietlZamowienie();
        }
    }

    double obliczLacznyKosztZamowien() {
        double suma=0;
        for(Zamowienie e : listaZamowien) {
            suma+=e.getKoszykZakupowy().obliczCalkowitaWartosc();
        }
        return suma;
    }
}
