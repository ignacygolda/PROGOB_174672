import java.util.HashMap;

public interface Magazyn_interface {
    HashMap<Produkt,Integer> getProdukty();
    void setProdukty(HashMap<Produkt, Integer> produkty);
    void dodajProdukt(Produkt p, int ilosc);
    void usunProdukt(Produkt p, int ilosc);
    void wyswietlAsortyment();
}
