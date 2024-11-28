import java.util.HashMap;

public class Zamowienie {
    KoszykZakupowy koszykZakupowy;
    String statusZamowienia;
    Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszykZakupowy) {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = "niezrealizowane";
        this.platnosc = new Platnosc(koszykZakupowy.obliczCalkowitaWartosc(), "Nieopłacone");
    }

    void ustawStatusZamownienia(String status) {
        this.statusZamowienia = status;
    }

    void wyswietlZamowienie() {
        System.out.println("---------------------");
        System.out.println(this.statusZamowienia);
        this.koszykZakupowy.wyswietlZawartoscKoszyka();
        System.out.println("---------------------");
    }

    void finalizujZamowienie() {
        if(this.platnosc.statusPlatnosci == "Opłacone") {
            this.statusZamowienia = "Gotowe do wysyłki";
        }
    }

    void zwrocProdukt(Produkt p, int n) {
        if(this.koszykZakupowy.listaProdoktowIlosc.get(p)>n) {
            p.dodajDoMagazynu(n);
            int temp = this.koszykZakupowy.listaProdoktowIlosc.get(p)-n;
            this.koszykZakupowy.listaProdoktowIlosc.put(p,temp);
        }
        else {
            p.dodajDoMagazynu(this.koszykZakupowy.listaProdoktowIlosc.get(p));
            this.koszykZakupowy.listaProdoktowIlosc.remove(p);
        }
        this.platnosc.kwota=0;
        for(Produkt e : koszykZakupowy.listaProduktow) {
            this.platnosc.kwota+=e.cena;
        }
    }
}
