public interface Produkt_interface {
    void setNazwa(String nazwa);
    String getNazwa();
    void setCena(int cena);
    double getCena();
    void dodajDoMagazynu(Magazyn m, int ilosc);
    void usunZMagazynu(Magazyn m, int ilosc);
}
