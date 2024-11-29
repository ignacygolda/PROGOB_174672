import java.util.List;

public class Klient {
    String imie;
    String nazwisko;
    Adres adres;
    List<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko, Adres adres, List<Zamowienie> listaZamowien) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.listaZamowien = listaZamowien;
    }

    void dodajZamowienie(Zamowienie zamowienie) {
        listaZamowien.add(zamowienie);
    }

    void wyswietlHistorieZamowien() {
        for(Zamowienie e : listaZamowien) {
            e.wyswietlZamowienie();
        }
    }

    double obliczLacznyKosztZamowien() {
        double suma=0;
        for(Zamowienie e : listaZamowien) {
            suma+=e.koszykZakupowy.obliczCalkowitaWartosc();
        }
        return suma;
    }

    boolean equals(Klient k) {
        if(this.imie == k.imie && this.nazwisko == k.nazwisko && this.adres == k.adres) {
            return true;
        }
        return false;
    }
}
