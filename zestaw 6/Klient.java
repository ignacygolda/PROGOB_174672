import java.util.List;
import java.util.Objects;

public class Klient extends Osoba implements Klient_interface {
    private Adres adres;
    private List<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko, Adres adres, List<Zamowienie> listaZamowien) {
        super(imie,nazwisko);
        this.adres = adres;
        this.listaZamowien = listaZamowien;
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

    public void dodajZamowienie(Zamowienie zamowienie) {
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
        if(this.getImie().equals(klient.getImie()) && this.getNazwisko().equals(klient.getNazwisko()) && this.adres.equals(klient.getAdres()) && this.listaZamowien.equals(klient.getListaZamowien())) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getImie(), getNazwisko(), adres, listaZamowien);
    }

    public void wyswietlHistorieZamowien() {
        for(Zamowienie e : listaZamowien) {
            e.wyswietlZamowienie();
        }
    }

    public double obliczLacznyKosztZamowien() {
        double suma=0;
        for(Zamowienie e : listaZamowien) {
            suma+=e.getKoszykZakupowy().obliczCalkowitaWartosc();
        }
        return suma;
    }
}
