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
}
