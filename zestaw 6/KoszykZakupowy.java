import java.util.HashMap;

public class KoszykZakupowy implements KoszykZakupowy_interface {
    private HashMap<Produkt, Integer> listaProduktow;

    public KoszykZakupowy() {
        this.listaProduktow = new HashMap<>();
    }

    public HashMap<Produkt, Integer> getListaProduktow() {
        return listaProduktow;
    }

    public void setListaProduktow(HashMap<Produkt, Integer> listaProduktow) {
        if(listaProduktow!=null) this.listaProduktow = listaProduktow;
        else throw new IllegalArgumentException("Niepoprawne dane");
    }

    public void dodajProdukt(Magazyn m, Produkt p, int ilosc) {

        if(this.listaProduktow.containsKey(p)) {
            if(m.getProdukty().get(p)>ilosc) {
                int temp = this.listaProduktow.get(p);
                temp+=ilosc;
                this.listaProduktow.put(p,temp);
            }
            else {
                this.listaProduktow.put(p,m.getProdukty().get(p));
            }
        }
        else {
            if(m.getProdukty().get(p)>ilosc) {
                this.listaProduktow.put(p,ilosc);
            }
            else {
                this.listaProduktow.put(p,m.getProdukty().get(p));
            }
        }
        p.usunZMagazynu(m,ilosc);
    }

    @Override
    public String toString() {
        String out = "";
        for(Produkt e : this.listaProduktow.keySet()) {
            out+=e.toString()+"\n";
            out+="ilosc: "+this.listaProduktow.get(e)+"\n";
        }
        return out;
    }

    public void wyswietlZawartoscKoszyka() {
        for(Produkt e : this.listaProduktow.keySet()) {
            System.out.println(e.toString());
            System.out.println("ilosc: "+this.listaProduktow.get(e));
        }
    }

    public double obliczCalkowitaWartosc() {
        double suma=0;
        for (Produkt e : listaProduktow.keySet()) {
            suma+=e.getCena();
        }
        return suma;
    }
}
