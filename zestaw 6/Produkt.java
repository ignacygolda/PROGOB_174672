public class Produkt {
    String nazwa;
    double cena;

    public Produkt(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    void wyswietlInformacje() {
        System.out.println("nazwa: "+this.nazwa);
        System.out.println("cena: "+this.cena);
    }

    void dodajDoMagazynu(Magazyn m, int ilosc) {
        m.dodajProdukt(this, ilosc);
    }
    void usunZMagazynu(Magazyn m, int ilosc) {
        m.usunProdukt(this, ilosc);
    }

    boolean equals(Produkt p) {
        if(this.cena == p.cena && this.nazwa == p.nazwa) {
            return true;
        }
        return false;
    }
}
