public class Zamowienie {
    private KoszykZakupowy koszykZakupowy;
    private String statusZamowienia;
    private Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszykZakupowy) {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = "niezrealizowane";
        this.platnosc = new Platnosc(koszykZakupowy.obliczCalkowitaWartosc(), "Nieopłacone");
    }

    public KoszykZakupowy getKoszykZakupowy() {
        return koszykZakupowy;
    }

    public void setKoszykZakupowy(KoszykZakupowy koszykZakupowy) {
        if(koszykZakupowy!=null) this.koszykZakupowy = koszykZakupowy;
        else throw new IllegalArgumentException("Niepoprawne dane");
    }

    public String getStatusZamowienia() {
        return statusZamowienia;
    }

    public void setStatusZamowienia(String statusZamowienia) {
        if(statusZamowienia!=null) this.statusZamowienia = statusZamowienia;
        else throw new IllegalArgumentException("Niepoprawne dane");
    }

    public Platnosc getPlatnosc() {
        return platnosc;
    }

    public void setPlatnosc(Platnosc platnosc) {
        if(platnosc!=null) this.platnosc = platnosc;
        else throw new IllegalArgumentException("Niepoprawne dane");
    }

    public void ustawStatusZamownienia(String status) {
        this.statusZamowienia = status;
    }

    @Override
    public String toString() {
        String out = "";
        out+="---------------------";
        out+="status zamownienia: "+this.statusZamowienia+"\n";
        out+=this.koszykZakupowy.toString()+"\n";
        out+="---------------------";
        return out;
    }

    public void wyswietlZamowienie() {
        System.out.println("---------------------");
        System.out.println(this.statusZamowienia);
        this.koszykZakupowy.wyswietlZawartoscKoszyka();
        System.out.println("---------------------");
    }

    public void finalizujZamowienie() {
        if(this.platnosc.getStatusPlatnosci() == "Opłacone") {
            this.statusZamowienia = "Gotowe do wysyłki";
        }
    }

    public void zwrocProdukt(Magazyn m,Produkt p, int n) {
        if(this.koszykZakupowy.getListaProduktow().get(p)>n) {
            p.dodajDoMagazynu(m,n);
            int temp = this.koszykZakupowy.getListaProduktow().get(p)-n;
            this.koszykZakupowy.getListaProduktow().put(p,temp);
        }
        else {
            p.dodajDoMagazynu(m,this.koszykZakupowy.getListaProduktow().get(p));
            this.koszykZakupowy.getListaProduktow().remove(p);
        }
        double temp=0;
        for(Produkt e : koszykZakupowy.getListaProduktow().keySet()) {
            temp+=e.getCena();
        }
        this.platnosc.setKwota(temp);
    }
}
