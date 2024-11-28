import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class KoszykZakupowy {
    HashMap<Produkt, Integer> listaProdoktowIlosc;
    List<Produkt> listaProduktow;

    public KoszykZakupowy() {
        this.listaProduktow = new ArrayList<>();
        this.listaProdoktowIlosc = new HashMap<>();
    }

    void dodajProdukt(Produkt p) {
        if(p.iloscNaMagazynie>0) {
            this.listaProduktow.add(p);
            p.usunZMagazynu(1);
            if(this.listaProdoktowIlosc.containsKey(p)) {
                Integer temp = this.listaProdoktowIlosc.get(p);
                temp++;
                this.listaProdoktowIlosc.put(p,temp);
            }
            else {
                this.listaProdoktowIlosc.put(p,1);
            }
        }
        else {
            System.out.println("nie mozna dodac produktu");
            System.out.println();
        }
    }

    void wyswietlZawartoscKoszyka() {
        for(Produkt e : this.listaProdoktowIlosc.keySet()) {
            e.wyswietlInformacje();
            System.out.println("ilosc: "+this.listaProdoktowIlosc.get(e));
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
