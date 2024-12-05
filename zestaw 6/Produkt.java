import java.util.Objects;

public class Produkt {
    private String nazwa;
    private double cena;

    public Produkt(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public void setNazwa(String nazwa) {
        if(nazwa!=null) this.nazwa = nazwa;
        else throw new IllegalArgumentException("Niepoprawne dane");
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setCena(int cena) {
        if(cena>0) this.cena = cena;
        else throw new IllegalArgumentException("Niepoprawne dane");
    }

    public double getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return "Produkt [nazwa=" + this.nazwa + ", \ncena=" + this.cena + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, cena);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Produkt produkt = (Produkt) obj;
        if(this.nazwa.equals(produkt.getNazwa()) && this.cena == produkt.getCena()) return true;
        return false;
    }

    void dodajDoMagazynu(Magazyn m, int ilosc) {
        m.dodajProdukt(this, ilosc);
    }
    void usunZMagazynu(Magazyn m, int ilosc) {
        m.usunProdukt(this, ilosc);
    }
}
