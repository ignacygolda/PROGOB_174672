import java.util.List;
import java.util.ArrayList;

public class Sklep {
    private List<Produkt> produkty;
    private String nazwaSklepu;
    private String dataPowstania;
    private Magazyn magazynSklepu;

    public Sklep(String nazwaSklepu, String dataPowstania, Magazyn magazynSklepu) {
        this.produkty = new ArrayList<>();
        this.nazwaSklepu = nazwaSklepu;
        this.dataPowstania = dataPowstania;
        this.magazynSklepu = magazynSklepu;
    }

    public List<Produkt> getProdukty() {
        return produkty;
    }

    public void setProdukty(List<Produkt> produkty) {
        if(produkty!=null) this.produkty = produkty;
        else throw new IllegalArgumentException("Niepoprawne dane");
    }

    public String getNazwaSklepu() {
        return nazwaSklepu;
    }

    public void setNazwaSklepu(String nazwaSklepu) {
        if(nazwaSklepu!=null) this.nazwaSklepu = nazwaSklepu;
        else throw new IllegalArgumentException("Niepoprawne dane");
    }

    public String getDataPowstania() {
        return dataPowstania;
    }

    public void setDataPowstania(String dataPowstania) {
       if(dataPowstania!=null) this.dataPowstania = dataPowstania;
       else throw new IllegalArgumentException("Niepoprawne dane");
    }

    public Magazyn getMagazynSklepu() {
        return magazynSklepu;
    }

    public void setMagazynSklepu(Magazyn magazynSklepu) {
        if(magazynSklepu!=null) this.magazynSklepu = magazynSklepu;
        else throw new IllegalArgumentException("Niepoprawne dane");
    }

    void dodajProdukt(Produkt p, int ilosc) {
        this.produkty.add(p);
        this.magazynSklepu.dodajProdukt(p,ilosc);
    }

    @Override
    public String toString() {
        String out = "";
        for(int i=0;i<produkty.size();i++) {
            out+=produkty.get(i).toString();
        }
        return out;
    }

    void wyswietlOferty() {
        for(int i=0;i<produkty.size();i++) {
            System.out.println(produkty.get(i).toString());
        }
    }
    Produkt wyszukajProduktu(String n) {
        for(int i=0;i<produkty.size();i++) {
            if(produkty.get(i).getNazwa() == n) {
                return produkty.get(i);
            }
        }
        return null;
    }

    void zakupy(Magazyn m, Produkt p, int n, KoszykZakupowy k) {
        k.dodajProdukt(m,p,n);
    }
}
