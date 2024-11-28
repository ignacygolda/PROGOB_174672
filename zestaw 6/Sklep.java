import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Sklep {
    List<Produkt> produkty;

    public Sklep() {
        this.produkty = new ArrayList<>();
    }
    void dodajProdukt(Produkt p) {
        this.produkty.add(p);
    }
    void wyswietlOferty() {
        for(int i=0;i<produkty.size();i++) {
            produkty.get(i).wyswietlInformacje();
        }
    }
    Produkt wyszukajProduktu(String n) {
        for(int i=0;i<produkty.size();i++) {
            if(produkty.get(i).nazwa == n) {
                return produkty.get(i);
            }
        }
        return null;
    }

    void zakupy(Produkt p, int n, KoszykZakupowy k) {
        for(int i=n;i>0;i--) {
            k.dodajProdukt(p);
        }
    }

}
