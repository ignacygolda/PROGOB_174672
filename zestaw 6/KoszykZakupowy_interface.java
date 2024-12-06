import java.util.HashMap;

public interface KoszykZakupowy_interface {
    public HashMap<Produkt, Integer> getListaProduktow();
    void setListaProduktow(HashMap<Produkt, Integer> listaProduktow);
    void dodajProdukt(Magazyn m, Produkt p, int ilosc);
    void wyswietlZawartoscKoszyka();
    double obliczCalkowitaWartosc();
}
