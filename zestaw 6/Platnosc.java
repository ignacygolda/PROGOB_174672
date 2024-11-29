public class Platnosc {
    double kwota;
    String statusPlatnosci;

    public Platnosc(double kwota, String statusPlatnosci) {
        this.kwota = kwota;
        this.statusPlatnosci = statusPlatnosci;
    }
    void zaplac() {
        this.statusPlatnosci = "Opłacone";
    }

    boolean equals(Platnosc p) {
        if(this.kwota == p.kwota && this.statusPlatnosci == p.statusPlatnosci) {
            return true;
        }
        return false;
    }
}
