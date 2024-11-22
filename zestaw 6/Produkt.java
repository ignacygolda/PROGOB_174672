public class Produkt {
    String nazwa;
    double cena;
    int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    void wyswietlInformacje() {
        System.out.println("nazwa: "+this.nazwa);
        System.out.println("cena: "+this.cena);
        System.out.println("ilosc na magazynie: "+iloscNaMagazynie);
        System.out.println();
    }

    void dodajDoMagazynu(int ilosc) {
        this.iloscNaMagazynie+=ilosc;
    }
    void usunZMagazynu(int ilosc) {
        for(int i=0;i<ilosc;i++) {
            this.iloscNaMagazynie--;
            if(this.iloscNaMagazynie==0) {
                break;
            }
        }
    }
}
