import java.util.List;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.HashMap;

public class KoszykZakupowy {
    List<Produkt> listaProduktow;

    public KoszykZakupowy() {
        this.listaProduktow = new ArrayList<>();
    }

    void dodajProdukt(Produkt p) {
        if(p.iloscNaMagazynie>0) {
            this.listaProduktow.add(p);
            p.usunZMagazynu(1);
        }
        else {
            System.out.println("nie mozna dodac produktu");
        }
    }

    void wyswietlZawartoscKoszyka() {
        System.out.println("Zawartosc koszyka:");
        HashMap<Produkt, Integer> ilosci = new HashMap<>();
        for (Produkt e : listaProduktow) {
            if(ilosci.containsKey(e)) {
                Integer temp = ilosci.get(e);
                temp++;
                ilosci.put(e,temp);
            }
            else {
                ilosci.put(e,1);
            }
        }
        for(Produkt e : ilosci.keySet()) {
            e.wyswietlInformacje();
            System.out.println("ilosc: "+ilosci.get(e));
        }
    }

    double obliczCalkowitaWartosc() {
        double suma=0;
        for (Produkt e : listaProduktow) {
            suma+=e.cena;
        }
        return suma;
    }
}
