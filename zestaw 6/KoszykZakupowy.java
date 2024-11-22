import java.util.List;
import java.util.ArrayList;

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
        for (Produkt e : listaProduktow) {
            e.wyswietlInformacje();
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
