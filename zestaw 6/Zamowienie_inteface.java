public interface Zamowienie_inteface {
    KoszykZakupowy getKoszykZakupowy();
    void setKoszykZakupowy(KoszykZakupowy koszykZakupowy);
    String getStatusZamowienia();
    void setStatusZamowienia(String statusZamowienia);
    Platnosc getPlatnosc();
    void setPlatnosc(Platnosc platnosc);
    void ustawStatusZamownienia(String status);
    void wyswietlZamowienie();
    void finalizujZamowienie();
    void zwrocProdukt(Magazyn m,Produkt p, int n);
}
