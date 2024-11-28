import java.util.List;

public class Klient {
    String imie;
    String nazwisko;
    List<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko, List<Zamowienie> listaZamowien) {
        this.imie = imie;
        this.nazwisko = nazwisko;
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
}
