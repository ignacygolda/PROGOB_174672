import javax.xml.transform.Source;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Magazyn {
    HashMap<Produkt,Integer> produkty;

    public Magazyn() {
        this.produkty = new HashMap<>();

    }
    void dodajProdukt(Produkt p, int ilosc) {
        if(this.produkty.containsKey(p)) {
            int temp = this.produkty.get(p);
            temp+=ilosc;
            this.produkty.put(p,temp);
        }
        else {
            this.produkty.put(p,ilosc);
        }
    }

    void usunProdukt(Produkt p, int ilosc) {
        if(this.produkty.get(p)>ilosc) {
            int temp = this.produkty.get(p);
            temp-=ilosc;
            this.produkty.put(p,temp);
        }
        else {
            this.produkty.remove(p);
        }
    }

    void wyswietlAsortyment() {
        System.out.println("--------------------");
        for(Produkt p : this.produkty.keySet()) {
            p.wyswietlInformacje();
            System.out.println("ilosc: "+this.produkty.get(p));
        }
        System.out.println("--------------------");
    }
}
