import java.util.HashMap;

public class Magazyn implements Magazyn_interface {
    private HashMap<Produkt,Integer> produkty;

    public Magazyn() {
        this.produkty = new HashMap<>();
    }

    public HashMap<Produkt, Integer> getProdukty() {
        return produkty;
    }

    public void setProdukty(HashMap<Produkt, Integer> produkty) {
        if(produkty!=null) this.produkty = produkty;
        else throw new IllegalArgumentException("Niepoprawne dane");
    }

    public void dodajProdukt(Produkt p, int ilosc) {
        if(this.produkty.containsKey(p)) {
            int temp = this.produkty.get(p);
            temp+=ilosc;
            this.produkty.put(p,temp);
        }
        else {
            this.produkty.put(p,ilosc);
        }
    }

    public void usunProdukt(Produkt p, int ilosc) {
        if(this.produkty.get(p)>ilosc) {
            int temp = this.produkty.get(p);
            temp-=ilosc;
            this.produkty.put(p,temp);
        }
        else {
            this.produkty.remove(p);
        }
    }

    @Override
    public String toString() {
        String out = "";
        out+="--------------------";
        for(Produkt p : this.produkty.keySet()) {
            out+=p.toString() + "\n";
            out+="ilosc: "+this.produkty.get(p) + "\n";
        }
        out+="--------------------";
        return out;
    }

    public void wyswietlAsortyment() {
        System.out.println("--------------------");
        for(Produkt p : this.produkty.keySet()) {
            System.out.println(p.toString());
            System.out.println("ilosc: "+this.produkty.get(p));
        }
        System.out.println("--------------------");
    }
}
