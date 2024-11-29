import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class KoszykZakupowy {
    HashMap<Produkt, Integer> listaProduktow;

    public KoszykZakupowy() {
        this.listaProduktow = new HashMap<>();
    }

    void dodajProdukt(Magazyn m,Produkt p,int ilosc) {

        if(this.listaProduktow.containsKey(p)) {
            if(m.produkty.get(p)>ilosc) {
                int temp = this.listaProduktow.get(p);
                temp+=ilosc;
                this.listaProduktow.put(p,temp);
            }
            else {
                this.listaProduktow.put(p,m.produkty.get(p));
            }
        }
        else {
            if(m.produkty.get(p)>ilosc) {
                this.listaProduktow.put(p,ilosc);
            }
            else {
                this.listaProduktow.put(p,m.produkty.get(p));
            }
        }
        p.usunZMagazynu(m,ilosc);
    }

    void wyswietlZawartoscKoszyka() {
        for(Produkt e : this.listaProduktow.keySet()) {
            e.wyswietlInformacje();
            System.out.println("ilosc: "+this.listaProduktow.get(e));
        }
    }

    double obliczCalkowitaWartosc() {
        double suma=0;
        for (Produkt e : listaProduktow.keySet()) {
            suma+=e.cena;
        }
        return suma;
    }
}
