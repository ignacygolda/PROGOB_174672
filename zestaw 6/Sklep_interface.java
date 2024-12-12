import java.util.List;
import java.util.ArrayList;

public interface Sklep_interface {
    List<Produkt> getProdukty();
    void setProdukty(List<Produkt> produkty);
    String getNazwaSklepu();
    void setNazwaSklepu(String nazwaSklepu);
    String getDataPowstania();
    void setDataPowstania(String dataPowstania);
    Magazyn getMagazynSklepu();
    void setMagazynSklepu(Magazyn magazynSklepu);
    void dodajProdukt(Produkt p, int ilosc);
    void wyswietlOferty();
    Produkt wyszukajProduktu(String n);
    void zakupy(Magazyn m, Produkt p, int n, KoszykZakupowy k);
}
