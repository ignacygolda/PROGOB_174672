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

    void zwrocProdukt(Magazyn m,Produkt p, int n) {
        if(this.koszykZakupowy.listaProduktow.get(p)>n) {
            p.dodajDoMagazynu(m,n);
            int temp = this.koszykZakupowy.listaProduktow.get(p)-n;
            this.koszykZakupowy.listaProduktow.put(p,temp);
        }
        else {
            p.dodajDoMagazynu(m,this.koszykZakupowy.listaProduktow.get(p));
            this.koszykZakupowy.listaProduktow.remove(p);
        }
        this.platnosc.kwota=0;
        for(Produkt e : koszykZakupowy.listaProduktow.keySet()) {
            this.platnosc.kwota+=e.cena;
        }
    }
}
